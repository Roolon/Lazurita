package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;

public class RandomNumberCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {

        //channel.deleteMessageById(message.getId()).queue();

        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                .setColor(Color.decode("#AB82FF"));

        if (inputs[0].equalsIgnoreCase("rnd")){

            int rnd4 = 1 + (int) (Math.random() * ((100 - 1) + 1));

            embedBuilder.addField("бросаает кубик 1d100:", String.valueOf(rnd4), true);
            channel.sendMessage(embedBuilder.build()).queue();

            return true;
        } else {
            return false;
        }
    }
}
