package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

public interface Command {

    boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs);
}