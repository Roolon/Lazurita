package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomCoinCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {

        //channel.deleteMessageById(message.getId()).queue();

        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                .setColor(Color.decode("#AB82FF"));

        if (inputs[0].equalsIgnoreCase("coin")) {
            String ask_string;

            switch (ThreadLocalRandom.current().nextInt(1, 3)) {
                case 1:
                    ask_string = "Орел";
                    break;
                case 2:
                    ask_string = "Решка";
                    break;
                default:
                    ask_string = "Монета встала на ребро и укатилась...";
                    break;
            }

            embedBuilder.addField("подбрасывает монетку:", ask_string, true);
            channel.sendMessage(embedBuilder.build()).queue();
            return true;
        } else {
            return false;
        }
    }
}
