package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;

public class AskCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        if (inputs[0].equalsIgnoreCase("ask")) {

            try {
                if (inputs[1] != null) {
                    String args[] = inputs[1].split(" ");

                  //  channel.deleteMessageById(message.getId()).queue();

                    EmbedBuilder embedBuilder = new EmbedBuilder()
                            .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                            .setColor(Color.decode("#AB82FF"));
                    int global_rnd = 1 + (int) (Math.random() * ((20 - 1) + 1));
                    int rnd = 1 + (int) (Math.random() * ((3 - 1) + 1));
                    String ask_string = new String();
                    switch (rnd) {
                        case 1:
                            if (global_rnd == 1) {
                                ask_string = "��.";
                            }
                            if (global_rnd == 2) {
                                ask_string = "���!";
                            }
                            if (global_rnd == 3) {
                                ask_string = "��� ���!";
                            }
                            if (global_rnd == 4) {
                                ask_string = "� ��� ����? ������� ��!";
                            }
                            if (global_rnd == 5) {
                                ask_string = "���.";
                            }
                            if (global_rnd == 6) {
                                ask_string = "��� � ����.";
                            }
                            if (global_rnd == 7) {
                                ask_string = "�� ���.";
                            }
                            if (global_rnd == 8) {
                                ask_string = "��������� ����.";
                            }
                            if (global_rnd == 9) {
                                ask_string = "� ���? ����� ����� ���� �����?";
                            }
                            if (global_rnd == 10) {
                                ask_string = "� ��!";
                            }
                            if (global_rnd == 11) {
                                ask_string = "�����.";
                            }
                            if (global_rnd == 12) {
                                ask_string = "�������.";
                            }
                            if (global_rnd == 13) {
                                ask_string = "�� �������� ��������.";
                            }
                            if (global_rnd == 14) {
                                ask_string = "������ � ��������.";
                            }
                            if (global_rnd == 15) {
                                ask_string = "�������������.";
                            }
                            if (global_rnd == 16) {
                                ask_string = "���� ����� ����������.";
                            }
                            if (global_rnd == 17) {
                                ask_string = "����� � ���� �� �����.";
                            }
                            if (global_rnd == 18) {
                                ask_string = "���������.";
                            }
                            if (global_rnd == 19) {
                                ask_string = "��� ������.";
                            }
                            if (global_rnd == 20) {
                                ask_string = "����� ����.";
                            }
                            break;
                        case 2:
                            if (global_rnd == 1) {
                                ask_string = "���.";
                            }
                            if (global_rnd == 2) {
                                ask_string = "��-�!";
                            }
                            if (global_rnd == 3) {
                                ask_string = "��������� :-)";
                            }
                            if (global_rnd == 4) {
                                ask_string = "�������!";
                            }
                            if (global_rnd == 5) {
                                ask_string = "�������.";
                            }
                            if (global_rnd == 6) {
                                ask_string = "����� ���.";
                            }
                            if (global_rnd == 7) {
                                ask_string = "������.";
                            }
                            if (global_rnd == 8) {
                                ask_string = "������.";
                            }
                            if (global_rnd == 9) {
                                ask_string = "�� ��� �� ��������?";
                            }
                            if (global_rnd == 10) {
                                ask_string = "������� ����!";
                            }
                            if (global_rnd == 11) {
                                ask_string = "������.";
                            }
                            if (global_rnd == 12) {
                                ask_string = "��� �� �� ���.";
                            }
                            if (global_rnd == 13) {
                                ask_string = "��������.";
                            }
                            if (global_rnd == 14) {
                                ask_string = "������.";
                            }
                            if (global_rnd == 15) {
                                ask_string = "�����������.";
                            }
                            if (global_rnd == 16) {
                                ask_string = "����.";
                            }
                            if (global_rnd == 17) {
                                ask_string = "�������� � ������.";
                            }
                            if (global_rnd == 18) {
                                ask_string = "�����.";
                            }
                            if (global_rnd == 19) {
                                ask_string = "������.";
                            }
                            if (global_rnd == 20) {
                                ask_string = "׸��� � ���!";
                            }
                            break;
                        case 3:
                            if (global_rnd == 1) {
                                ask_string = "������� �� ����.";
                            }
                            if (global_rnd == 2) {
                                ask_string = "� ��� ����� �����?";
                            }
                            if (global_rnd == 3) {
                                ask_string = "��������� � ���������� :-)";
                            }
                            if (global_rnd == 4) {
                                ask_string = "�������� ������.";
                            }
                            if (global_rnd == 5) {
                                ask_string = "� �� ���� � ���� ����.";
                            }
                            if (global_rnd == 6) {
                                ask_string = "����� ������ �������.";
                            }
                            if (global_rnd == 7) {
                                ask_string = "��� ������?";
                            }
                            if (global_rnd == 8) {
                                ask_string = "��� �� ��� �������?";
                            }
                            if (global_rnd == 9) {
                                ask_string = "� ���� ����� �������? ����� ����� �������...";
                            }
                            if (global_rnd == 10) {
                                ask_string = "���������! �� � �������.";
                            }
                            if (global_rnd == 11) {
                                ask_string = "���.";
                            }
                            if (global_rnd == 12) {
                                ask_string = "���.";
                            }
                            if (global_rnd == 13) {
                                ask_string = "��� ���-�� �� ����� �����?";
                            }
                            if (global_rnd == 14) {
                                ask_string = "���������.";
                            }
                            if (global_rnd == 15) {
                                ask_string = "�����.";
                            }
                            if (global_rnd == 16) {
                                ask_string = "�� �� ���� ���. ����� ������.";
                            }
                            if (global_rnd == 17) {
                                ask_string = "�� ������� ���� ����� ����������.";
                            }
                            if (global_rnd == 18) {
                                ask_string = "�� ����� ���-��?";
                            }
                            if (global_rnd == 19) {
                                ask_string = "�� ����� ��� ���������.";
                            }
                            if (global_rnd == 20) {
                                ask_string = "����� ;-)";
                            }
                            break;
                    }

                    embedBuilder.addField(inputs[1], ask_string, true);
                    channel.sendMessage(embedBuilder.build()).queue();

                    return true;

                } else {
                    return false;

                }

            } catch (Exception e) {
            }


            return false;
        }

        return false;
    }
}



