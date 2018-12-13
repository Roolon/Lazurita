package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;


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

                embedBuilder.addField("random[" + min + "-" + max + "]:", String.valueOf(ThreadLocalRandom.current().nextInt(min, max)), true);
                channel.sendMessage(embedBuilder.build()).queue();

                return true;

            } else {
                return false;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }
}