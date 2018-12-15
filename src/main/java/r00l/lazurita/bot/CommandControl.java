package r00l.lazurita.bot;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import r00l.lazurita.bot.Commands.Command;

import java.util.List;

class CommandControl {

    public List<Command> commands;

    CommandControl(List<Command> commands) {
        this.commands = commands;
    }

    Boolean execute(Bot bot, MessageReceivedEvent event, List<String> inputs) {
        User author = event.getAuthor();
        Message message = event.getMessage();
        MessageChannel channel = event.getChannel();

        String mention = inputs.get(0);

        if (mention.contains("@" + bot.user.getName())
                || (bot.member.getNickname() != null && mention.contains("@" + bot.member.getNickname())
                || (bot.role != null && inputs.get(0).contains("@" + bot.role.getName()))
                || mention.contains(bot.key))) {
            if (inputs.get(0).startsWith(bot.key))
                inputs.add(1, inputs.get(0).substring(bot.key.length()));

            if (inputs.size() > 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(inputs.get(2));
                for (int i = 3; i < inputs.size(); i++) {
                    sb.append(" ").append(inputs.get(i));
                }
                inputs.remove(2);
                inputs.add(2, sb.toString());
            }

            if (inputs.size() == 2)
                inputs.add(null);
            else if (inputs.size() == 1)
                return false;

            for (Command command : commands) {
                if (command.execute(bot, message, channel, author, inputs.get(1), inputs.get(2)))
                    return true;
            }
        }

        return false;
    }
}
