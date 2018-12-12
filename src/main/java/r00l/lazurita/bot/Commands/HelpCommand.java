package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.MessageEmbed;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;

public class HelpCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        if (inputs[0].equalsIgnoreCase("help")) {
            MessageEmbed messageEmbed = new EmbedBuilder()
                    .addField("Lazurita Discord Framework v0.7", "ping, say, r34, pogoda, bob, coin, dice, rnd, rng, e621, ask, cho, mol, stul", true)
                    .setColor(Color.CYAN)
                    .build();
            channel.sendMessage(messageEmbed).queue();

            return true;
        } else {
            return false;
        }
    }
}
