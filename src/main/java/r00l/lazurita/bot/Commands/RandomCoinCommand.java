package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;

public class RandomCoinCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {

        //channel.deleteMessageById(message.getId()).queue();

        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                .setColor(Color.decode("#AB82FF"));

        if (inputs[0].equalsIgnoreCase("coin")) {
            int rnd1 = 1 + (int) (Math.random() * ((2 - 1) + 1));
            String ask_string = new String();

            switch (rnd1) {
                case 1:
                    ask_string = "Орел";
                    break;
                case 2:
                    ask_string = "Решка";
                    break;
                case 3:
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
