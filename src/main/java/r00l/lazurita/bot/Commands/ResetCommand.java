package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

public class ResetCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        if (inputs[0].equalsIgnoreCase("reset")) {
            if ((bot.master != null && author.getName().equalsIgnoreCase(bot.master.getName())) || (bot.creator != null && author.getName().equalsIgnoreCase(bot.creator.getName()))) {
                channel.sendMessage("Обновляем команды...").queue();
                bot.reset();
            } else {
                channel.sendMessage("Молодой человек, это не для вас команда.").queue();
            }

            return true;
        } else {
            return false;
        }
    }
}
