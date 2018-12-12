package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChooseCommand implements Command {


    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        try {
            if (inputs[1] != null) {
                String args[] = inputs[1].split(",");


               // channel.deleteMessageById(message.getId()).queue();

                EmbedBuilder embedBuilder = new EmbedBuilder()
                        .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                        .setColor(Color.decode("#AB82FF"));


                if (inputs[0].equalsIgnoreCase("cho")) {


                    int rnd3 = (int) (Math.random() * args.length);

                    embedBuilder.addField(inputs[1] + ":", args[rnd3], true);
                    channel.sendMessage(embedBuilder.build()).queue();

                    return true;}

                } else {
                    return false;

                }

            }catch(Exception e){
            }


            return false;}}



