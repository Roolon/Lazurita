package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

public class PingCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        if (inputs[0].equalsIgnoreCase("ping")) {
            channel.sendMessage("Ping: " + message.getJDA().getPing() + " ms").queue();

            return true;
        } else {
            return false;
        }
    }
}
