package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

public class SayCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        if (inputs[0].equalsIgnoreCase("say")) {
            if (inputs[1] != null) {
                channel.deleteMessageById(message.getId()).queue();

                channel.sendMessage(inputs[1]).queue();
                System.out.println(author.getName() + " говорит: " + inputs[1]);
            }

            return true;
        } else {
            return false;
        }
    }
}
