package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RandomRangeCommand implements Command {



    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
try {
    String args[] = inputs[1].split(" ");


        //channel.deleteMessageById(message.getId()).queue();

        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                .setColor(Color.decode("#AB82FF"));




        if (inputs[0].equalsIgnoreCase("rng") && (args.length == 2 && args[0].matches("[-+]?\\d+") && args[1].matches("[-+]?\\d+"))) {


            int min = Integer.valueOf(args[0]);
            int max = Integer.valueOf(args[1]);

            int rnd3 = min + (int) (Math.random() * ((max - min) + 1));

            embedBuilder.addField("random[" + args[0] + "-" + args[1] + "]:", String.valueOf(rnd3), true);
            channel.sendMessage(embedBuilder.build()).queue();

            return true;

        } else { return false;

        }

}catch(Exception e) {}


        return false;}
}