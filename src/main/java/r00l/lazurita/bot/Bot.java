package r00l.lazurita.bot;

import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.entities.Game.GameType;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.events.channel.text.TextChannelCreateEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bot extends ListenerAdapter {

    private Config config;
    private CommandControl commandControl;
    private TextChannel defaultChannel;

    // Переменные в конфиг-файле
    public String endingMessage;
    public boolean allowReactionsToBots;
    public boolean allowAudio;
    public boolean allowNewChannelMessage;
    public boolean allowOpeningMessage;
    public boolean allowEndingMessage;
    public boolean allowNsfw;
    public boolean allowAnyTimeReactions;
    public boolean allowOnlyDefaultChannel;

    // Юзеры со специальными правами
    public User master;
    public User creator;

    // Переменные для бота
    public Member member; // Member object of bot
    public User user; // User object of bot
    public Role role; // Special bot role
    public String key; // Key for commands

    Bot(Config config) {
        this.config = config;

        try {
            // инициализация конфига
            endingMessage = config.getEndingMessage();
            allowAnyTimeReactions = config.isAllowReactsAnytime();
            allowReactionsToBots = config.isAllowReactsToBots();
            allowAudio = config.isAllowAudio();
            allowNsfw = config.isAllowNsfw();
            allowNewChannelMessage = config.isAllowNewChannelMessage();
            allowOpeningMessage = config.isAllowOpeningMessage();
            allowEndingMessage = config.isAllowEndingMessage();
            allowOnlyDefaultChannel = config.isAllowOnlyDefaultChannel();

            // инициализация бота
            try {
			  user = Launcher.getUser(Launcher.jda.getSelfUser().getId());
            	} catch (NullPointerException|IndexOutOfBoundsException e) {
                e.printStackTrace();
                shutdown();
			}
            try {
                member = user.getMutualGuilds().get(0).getSelfMember();
            } catch (NullPointerException|IndexOutOfBoundsException e) {
                e.printStackTrace();
                shutdown();
            }
            master = Launcher.getUser(config.getMaster());
            creator = Launcher.getUser(config.getCreator());
            role = Launcher.getRole(config.getRole());
            if (config.getKey() == null)
                key = user.getName().toLowerCase().substring(0, 2) + "/"; // если в конфиге не найден ключ - ключом бота будут две первые буквы имени + '/'
            else
                key = config.getKey();

            String isPlaying = config.getIsPlaying();
            if (isPlaying != null) {
                Launcher.jda.getPresence().setGame(Game.of(GameType.DEFAULT, isPlaying));
            }

            // Вывод данных в консоль
            System.out.println("My name: " + user.getName());
            System.out.println("My key: " + key);
            if (role != null)
                System.out.println("My role: " + role.getName());
            else
                System.out.println("No group found");
            if (master != null)
                System.out.println("My master: " + master.getName());
            else
                System.out.println("No master found");
            if (creator != null)
                System.out.println("My creator: " + creator.getName());
            else
                System.out.println("No creator found");

            // Инициализация команд
            commandControl = new CommandControl(config.getCommands());

            try {
                defaultChannel = Launcher.jda.getTextChannelsByName(config.getDefaultChannel(), true).get(0);
            } catch (IndexOutOfBoundsException|NullPointerException e) {
                System.err.println("Default channel not found");
                allowOnlyDefaultChannel = false;
            }


        } catch (Exception e) {
            e.printStackTrace();
            shutdown();
        }
    }

    /**
     * созадем бота в JDA и связываем его с Лаунчером
     */
    public void reset() {
        Launcher.jda.removeEventListener(this);
        Bot bot = new Bot(config);
        Launcher.jda.addEventListener(bot);
    }

    public void shutdown() {
        Launcher.jda.shutdown();
        System.exit(1);
    }

    @Override
    public void onReady(ReadyEvent event) {
        if (allowOpeningMessage)
            defaultChannel.sendMessage(config.getOpeningMessage()).queue();
    }

    @Override
    public void onTextChannelCreate(TextChannelCreateEvent event) {
        event.getChannel().sendMessage(config.getNewChannelMessage()).queue();
    }

    /**
     * ловим события на канале с ботом
     */
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (allowOnlyDefaultChannel && event.getChannel().equals(defaultChannel)) {
            if (!event.getChannel().equals(defaultChannel))
                return;
        }

        /**
         * выдираем текст сообщения через getContentDisplay()
         * возможно тут нужно RAW, (нинужно, работает так)
         */
        
        if (!event.getAuthor().isBot() || (allowReactionsToBots && !event.getAuthor().equals(user))) {
            List<String> inputs = new ArrayList<>(Arrays.asList(event.getMessage().getContentDisplay().split(" ")));
            if (commandControl.execute(this, event, inputs))
                return;

        }
    }
}
