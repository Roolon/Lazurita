package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.awt.*;

public class BobsonCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        if (inputs[0].equalsIgnoreCase("bob")) {

           // channel.deleteMessageById(message.getId()).queue();

            EmbedBuilder embedBuilder = new EmbedBuilder()
                    .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                    .setColor(Color.decode("#AB82FF"));

            String kto = new String();
            String kto2 = new String();
            String otkuda = new String();
            String otkuda2 = new String();
            String kogo = new String();
            String stringone = new String();
            String stringtwo = new String();

            int global_rnd = (int) (Math.random() * 43) + 1;
            if (global_rnd == 1) {
                kto = "�����";
                kto2 = "�������";
            }
            if (global_rnd == 2) {
                kto = "���������";
                kto2 = "�������";
            }
            if (global_rnd == 3) {
                kto = "�������";
                kto2 = "�����";
            }
            if (global_rnd == 4) {
                kto = "��";
                kto2 = "�����";
            }
            if (global_rnd == 5) {
                kto = "�����";
                kto2 = "����";
            }
            if (global_rnd == 6) {
                kto = "������";
                kto2 = "���";
            }
            if (global_rnd == 7) {
                kto = "���";
                kto2 = "������";
            }
            if (global_rnd == 8) {
                kto = "�������";
                kto2 = "������";
            }
            if (global_rnd == 9) {
                kto = "������";
                kto2 = "�����";
            }
            if (global_rnd == 10) {
                kto = "������";
                kto2 = "����";
            }
            if (global_rnd == 11) {
                kto = "�������";
                kto2 = "������";
            }
            if (global_rnd == 12) {
                kto = "���� ����";
                kto2 = "�����";
            }
            if (global_rnd == 13) {
                kto = "��������";
                kto2 = "�������";
            }
            if (global_rnd == 14) {
                kto = "�����";
                kto2 = "�����";
            }
            if (global_rnd == 15) {
                kto = "�����";
                kto2 = "�������";
            }
            if (global_rnd == 16) {
                kto = "�����";
                kto2 = "������";
            }
            if (global_rnd == 17) {
                kto = "������� ��������";
                kto2 = "������";
            }
            if (global_rnd == 18) {
                kto = "������� �����������";
                kto2 = "������ ��� ����";
            }
            if (global_rnd == 19) {
                kto = "���";
                kto2 = "����";
            }
            if (global_rnd == 20) {
                kto = "����������";
                kto2 = "��������";
            }
            if (global_rnd == 21) {
                kto = "������";
                kto2 = "�������";
            }
            if (global_rnd == 22) {
                kto = "�������";
                kto2 = "����� � �����";
            }
            if (global_rnd == 23) {
                kto = "������� ��������";
                kto2 = "������� ��������";
            }
            if (global_rnd == 24) {
                kto = "�������";
                kto2 = "���������";
            }
            if (global_rnd == 25) {
                kto = "����";
                kto2 = "����";
            }
            if (global_rnd == 26) {
                kto = "����";
                kto2 = "����";
            }
            if (global_rnd == 27) {
                kto = "�������";
                kto2 = "���";
            }
            if (global_rnd == 28) {
                kto = "���������";
                kto2 = "�����-�� ������� ���������� ������";
            }
            if (global_rnd == 29) {
                kto = "�������";
                kto2 = "������";
            }
            if (global_rnd == 30) {
                kto = "��������� ����������";
                kto2 = "��������";
            }
            if (global_rnd == 31) {
                kto = "�����";
                kto2 = "��������� ����������";
            }
            if (global_rnd == 32) {
                kto = "�����";
                kto2 = "������";
            }
            if (global_rnd == 33) {
                kto = "������";
                kto2 = "��������";
            }
            if (global_rnd == 34) {
                kto = "��������������";
                kto2 = "�����";
            }
            if (global_rnd == 35) {
                kto = "���";
                kto2 = "�����";
            }
            if (global_rnd == 36) {
                kto = "����";
                kto2 = "���";
            }
            if (global_rnd == 37) {
                kto = "�������";
                kto2 = "�������";
            }
            if (global_rnd == 38) {
                kto = "�����";
                kto2 = "�����";
            }
            if (global_rnd == 39) {
                kto = "�����";
                kto2 = "������";
            }
            if (global_rnd == 40) {
                kto = "����������";
                kto2 = "������";
            }
            if (global_rnd == 41) {
                kto = "����� �����";
                kto2 = "��� ����� ����";
            }
            if (global_rnd == 42) {
                kto = "�������";
                kto2 = "���������";
            }
            if (global_rnd == 43) {
                kto = "���� ������";
                kto2 = "������ �� ������� ���������";
            }

            int global_rnd1 = (int) (Math.random() * 41) + 1;
            if (global_rnd1 == 1) {
                kogo = "�����������";
            }
            if (global_rnd1 == 2) {
                kogo = "���������";
            }
            if (global_rnd1 == 3) {
                kogo = "�����";
            }
            if (global_rnd1 == 4) {
                kogo = "������";
            }
            if (global_rnd1 == 5) {
                kogo = "�����������";
            }
            if (global_rnd1 == 6) {
                kogo = "��������";
            }
            if (global_rnd1 == 7) {
                kogo = "������";
            }
            if (global_rnd1 == 8) {
                kogo = "����";
            }
            if (global_rnd1 == 9) {
                kogo = "�����";
            }
            if (global_rnd1 == 10) {
                kogo = "���������";
            }
            if (global_rnd1 == 11) {
                kogo = "��������";
            }
            if (global_rnd1 == 12) {
                kogo = "�������";
            }
            if (global_rnd1 == 13) {
                kogo = "�����";
            }
            if (global_rnd1 == 14) {
                kogo = "������";
            }
            if (global_rnd1 == 15) {
                kogo = "�����";
            }
            if (global_rnd1 == 16) {
                kogo = "����������";
            }
            if (global_rnd1 == 17) {
                kogo = "�����";
            }
            if (global_rnd1 == 18) {
                kogo = "���� ����";
            }
            if (global_rnd1 == 19) {
                kogo = "�������";
            }
            if (global_rnd1 == 20) {
                kogo = "��������";
            }
            if (global_rnd1 == 21) {
                kogo = "������������";
            }
            if (global_rnd1 == 22) {
                kogo = "������";
            }
            if (global_rnd1 == 23) {
                kogo = "���������";
            }
            if (global_rnd1 == 24) {
                kogo = "�������� ���������";
            }
            if (global_rnd1 == 25) {
                kogo = "������";
            }
            if (global_rnd1 == 26) {
                kogo = "�����������";
            }
            if (global_rnd1 == 27) {
                kogo = "����������������";
            }
            if (global_rnd1 == 28) {
                kogo = "���������";
            }
            if (global_rnd1 == 29) {
                kogo = "�������";
            }
            if (global_rnd1 == 30) {
                kogo = "���������";
            }
            if (global_rnd1 == 31) {
                kogo = "�������";
            }
            if (global_rnd1 == 32) {
                kogo = "����������";
            }
            if (global_rnd1 == 33) {
                kogo = "��������� �������";
            }
            if (global_rnd1 == 34) {
                kogo = "�����";
            }
            if (global_rnd1 == 35) {
                kogo = "���������";
            }
            if (global_rnd1 == 36) {
                kogo = "����";
            }
            if (global_rnd1 == 37) {
                kogo = "����������";
            }
            if (global_rnd1 == 38) {
                kogo = "�������";
            }
            if (global_rnd1 == 39) {
                kogo = "������";
            }
            if (global_rnd1 == 40) {
                kogo = "�������";
            }
            if (global_rnd1 == 41) {
                kogo = "������ �����";
            }

            int global_rnd2 = (int) (Math.random() * 20) + 1;
            if (global_rnd2 == 1) {
                otkuda = "�����";
                otkuda2 = "���������� ��������";
            }
            if (global_rnd2 == 2) {
                otkuda = "�������";
                otkuda2 = "��������� ��������";
            }
            if (global_rnd2 == 3) {
                otkuda = "������� ������";
                otkuda2 = "������ ��������";
            }
            if (global_rnd2 == 4) {
                otkuda = "����� ������";
                otkuda2 = "������ ����� IF";
            }
            if (global_rnd2 == 5) {
                otkuda = "�����";
                otkuda2 = "������� � ������";
            }
            if (global_rnd2 == 6) {
                otkuda = "����� ���";
                otkuda2 = "����������� ��������";
            }
            if (global_rnd2 == 7) {
                otkuda = "�������";
                otkuda2 = "��������� ������";
            }
            if (global_rnd2 == 8) {
                otkuda = "�������";
                otkuda2 = "������ ������";
            }
            if (global_rnd2 == 9) {
                otkuda = "���� �����";
                otkuda2 = "���������� ������";
            }
            if (global_rnd2 == 10) {
                otkuda = "�������";
                otkuda2 = "��������������� ��������";
            }
            if (global_rnd2 == 11) {
                otkuda = "������";
                otkuda2 = "������ ������";
            }
            if (global_rnd2 == 12) {
                otkuda = "�����";
                otkuda2 = "��������� �������";
            }
            if (global_rnd2 == 13) {
                otkuda = "�������";
                otkuda2 = "������� ��������";
            }
            if (global_rnd2 == 14) {
                otkuda = "����� � ���������";
                otkuda2 = "��������� ��������";
            }
            if (global_rnd2 == 15) {
                otkuda = "������";
                otkuda2 = "���� �������� �������";
            }
            if (global_rnd2 == 16) {
                otkuda = "������";
                otkuda2 = "��������� ��������";
            }
            if (global_rnd2 == 17) {
                otkuda = "����";
                otkuda2 = "������������ ��� ������";
            }
            if (global_rnd2 == 18) {
                otkuda = "�������";
                otkuda2 = "����� ���������!";
            }
            if (global_rnd2 == 19) {
                otkuda = "�����";
                otkuda2 = "�������� ������";
            }
            if (global_rnd2 == 20) {
                otkuda = "������������ �������������� �����";
                otkuda2 = "��� �����";
            }

            int global_rnd_choicemaker = (int) (Math.random() * 100) + 1;
            if (global_rnd_choicemaker < 20) {
                int global_rndlocalgay1 = (int) (Math.random() * 3) + 1;
                if (global_rndlocalgay1 == 1) {
                    stringone = (kto.substring(0, 1).toUpperCase() + kto.substring(1)) + " ������ �� " + otkuda + " ������� " + kogo + ".";
                }
                if (global_rndlocalgay1 == 2) {
                    stringone = "����� ����� �����.";
                }
                if (global_rndlocalgay1 == 3) {
                    stringone = "��� " + kto + " �� ����, ����� � ������ �����.";
                }

                int global_rndlocalgay2 = (int) (Math.random() * 6) + 1;
                if (global_rndlocalgay2 == 1) {
                    stringtwo = "� ��� ��� ��� ���.";
                }
                if (global_rndlocalgay2 == 2) {
                    stringtwo = "��� � �� � ������.";
                }
                if (global_rndlocalgay2 == 3) {
                    stringtwo = "� �����, ������� ������.";
                }
                if (global_rndlocalgay2 == 4) {
                    stringtwo = "�����. ����� ������� �� ��������.";
                }
                if (global_rndlocalgay2 == 5) {
                    stringtwo = "������ ����.";
                }
                if (global_rndlocalgay2 == 6) {
                    stringtwo = "� ��.";
                }
                //channel.deleteMessageById(message.getId()).queue();
                //channel.sendMessage("```"+stringone +"\n"+ stringtwo+"```").queue();

                embedBuilder.addField(kto2 + " �� " + otkuda2 + " ��������:", stringone + "\n" + stringtwo, true);
                channel.sendMessage(embedBuilder.build()).queue();
            } else {

                int global_gayporn = (int) (Math.random() * 24) + 1;
                if (global_gayporn == 1) {
                    stringone = "����������� ����� " + kogo + " ������� � ���. ������ ���������� ���� ����. ������ � ��������, ������ - ��������. ������ ��������:\n";
                }
                if (global_gayporn == 2) {
                    stringone = "���� � " + kto + " ������ � ������. \n� ����, � ��� ����� �����? \n� ��� � ����� ������. \n- �����, � ��� ����� �����?\n ";
                }
                if (global_gayporn == 3) {
                    stringone = "��������� ����� ��� ��������, ������ � " + kogo + " � ������, �� � ���� ������� � ���������� ��� ����� ������ ����� � ������. ������� �������, ����� ������� �� ���, �������� ����� � �������� ������ � �����������, ��� ����������� ������, � �� ������ ������� � ��� �����, �� ������� ����, ����� ������ ������ � ��������, �� � ��� ������ �����������. ������� �����, � �������� � ������ ��������� � ����, ���, ���� ��� �������� ���, � �� ��� ����� �������� ����� �������� ��� �������. ������, ����, ������, ���� ���� � ��� ��� ��� ����������, � �� ����, ��������, ��� �� ��� � �����. ��� ���� ������, � ������� - ��� �� �����������, � ��� ����, ������ ����������, ������� �����? ��������� ��������� " + kogo + ", ������� �� ��������, ����� ���������� ��� �������, � �������� �����:\n";
                }
                if (global_gayporn == 4) {
                    stringone = "���������� � " + kto + " ���� �� ������ �� �����������, " + kto + " �� ����. �������� �������� ���� � �� ������������� ������. ���������� ����������� �� ������:\n� ���� ���, ������, � ���� " + kogo + "! \n- ��� ������?\n";
                }
                if (global_gayporn == 5) {
                    stringone = "�������� " + kto + " � ������� � ����������: \n� �������� ����? \n- ���.\n";
                }
                if (global_gayporn == 6) {
                    stringone = "� �� ���?\n� ��� " + kogo + " � �����.  \n� �� � ��� ���?  \n� �� �������. \n-  � ��� �� ������� ������?\n ";
                }
                if (global_gayporn == 7) {
                    stringone = "��������� ������� ����� �� ������ ����� ������. � ��� " + kto + " ����� ��� ������:  \n- �������, ������� �������, � ������ ��� �����?\n";
                }
                if (global_gayporn == 8) {
                    stringone = "��� ������� � �������� ����� �����. �������, " + kto + " ������. ��, � ������� � ����������:  \n� ������ ���?  � ������� �������:  \n� ���� ��� �����. ��� ����� � ���������. ����� ����� �������, � ���������, �������, ��� ��� �����, ��������� � ���� ����� �������. ���������� ����� �������: \n- � " + kto + "-�� ������?\n";
                }
                if (global_gayporn == 9) {
                    stringone = "������� �������� �� ����� � �����, ��������� �� �����, ���� � ����� ���������� �� �������. ���� �� ����� � ��������� �������, ��������� ���� ������� � ������� ���������, ������� ��� �� ��� � ������, � ����� �����.  ����� � �����! � �� ���� " + kto + " ���������. ��������� ����� � �������� �������, " + kto + " ���� �����, ������� ���� �� �����. ���������, �� ������������, ������� �������� ����������:  \n� ��� ����� ����� ������, �� ���������: \n� Ȗ�� ������ ����� ����� ������, �� � ������ ��� ��� �� �����: \n- ��� ����, �����! \n����� ������� � �����������: \n";
                }
                if (global_gayporn == 10) {
                    stringone = "������� � ��� " + kto + ", ���������� ����, � ������������ ������� �� ����. �������� �������: \n� ����� �� ����, ����. � " + kto + " ��������: \n� ���������, ��� � ��� �������. � �������� ���:\n";
                }
                if (global_gayporn == 11) {
                    stringone = "�����, ������, ����� � �������. ���� " + kogo + " �� " + otkuda + " � ����� �� ������� � ����� ����������. ��� �����������, ������, � ����� �� �������:\n";
                }
                if (global_gayporn == 12) {
                    stringone = "��� ������� ��� ���:\n";
                }
                if (global_gayporn == 13) {
                    stringone = "��� ������ ���� �� �������� ���� ��������� �����, ��� � ���������� ����� ������������� ������ ����, ������� ���, ������������. ���� ��������� ������� �� ������� � �������:\n- �������, ������ ��������� ���������� �������. \n������, � ������������ �����:\n";
                }
                if (global_gayporn == 14) {
                    stringone = "�������� ���������� �� ������� � ������� � ����� " + kogo + ":\n";
                }
                if (global_gayporn == 15) {
                    stringone = "����� ������� � ���, � ��� ����� " + kto + " � ��������:\n ";
                }
                if (global_gayporn == 16) {
                    stringone = "���������� ������� ��� �����, � ��������� ������ ��� " + kogo + ":\n";
                }
                if (global_gayporn == 17) {
                    stringone = "��� " + kto + " �� ����, ����� � ������ �����.\n";
                }
                if (global_gayporn == 18) {
                    stringone = "� �����, " + kto + " ������.\n";
                }
                if (global_gayporn == 19) {
                    stringone = "������ ���� " + kogo + ":\n";
                }
                if (global_gayporn == 20) {
                    stringone = "��� ����� �������� �����-��:\n";
                }
                if (global_gayporn == 21) {
                    stringone = "�����, ��������� � ������� ����� � ����.\n������� ������ ���������� ����� ����� ��� ������ � ������� ��������� ����������� ��������� ����� ����.\n������� �������� ���������, �� ������� �������� � ����� ��������.\n����� �������� ����� � ����� ����������, ��������� ��� ����� ����� ����� �������� ������ ����.\n��������� �������� �������� �� �����, ��� ��� � ������, �������:\n";
                }
                if (global_gayporn == 22) {
                    stringone = "��� ����� �� ����, ������ �����.\n������� � ������, ������� ���� � �����, ����������� - ��� ����.\n�� �������, ������� ������ ����, ����������� - � ���� ���.\n����� �� ������ � ����� ��� � ������:\n";
                }
                if (global_gayporn == 23) {
                    stringone = "������� ������ � ���, �������� � ������ � �������:\n- ����� ��� �����, ���.\n- � ��� ��� �� ���� ��� ������, ����? - �������� ������.\n- �, ��� ������ �������...\n- ��������, ����.\n- ��, ������.\n���� ������ � ���� ������� ������. � ���� � ���-�� �� ��� �� ������, ��� ���� �������� ����, �� � ����� � ���������� �� ������. ������ �������� � ������, � ��� ����� ������.\n� ��� � ��� ����, ��� ������� ������ ����� ������. � ��������� � ������ ��� ������ �����, ����� � ������ ������� ��������� � ��������� ������ ����.\n������ � ������, ��� ��� ���� ����. �� ������ ��� ������ ������ � � ������ � ��� � ������� � ��� ������ � ��������� ���� �� � �����.\n- ��� ��� ������ ������ ����� ������, ����?\n";
                }
                if (global_gayporn == 24) {
                    stringone = "B������ ������ �� ����, �������� � ����� ������, �������� �� ����� � ������ � �������.\n- ��� ��� �� �������? - ������������ ����������.\n- �� � ���� ���� �����������, - �������� ���.\n- � ���, ��� ��������?\n";
                }

                int global_rnd3 = (int) (Math.random() * 34) + 1;
                if (global_rnd3 == 1) {
                    stringtwo = "� ������ ������ �� ��������.";
                }
                if (global_rnd3 == 2) {
                    stringtwo = "� �����, ������� ������.";
                }
                if (global_rnd3 == 3) {
                    stringtwo = "� ���, � ��-�� ����� ��� �����.";
                }
                if (global_rnd3 == 4) {
                    stringtwo = "� ���� �����, � ���� �� ���� �����.";
                }
                if (global_rnd3 == 5) {
                    stringtwo = "� ��������! ������ �� �������!";
                }
                if (global_rnd3 == 6) {
                    stringtwo = "� ������ �����!";
                }
                if (global_rnd3 == 7) {
                    stringtwo = "� ���������, ��� � �������� �������.";
                }
                if (global_rnd3 == 8) {
                    stringtwo = "� ������ ��� � ���� ������.";
                }
                if (global_rnd3 == 9) {
                    stringtwo = "� ��� ������, ��� �����, ��� ������ ������";
                }
                if (global_rnd3 == 10) {
                    stringtwo = "� ��.";
                }
                if (global_rnd3 == 11) {
                    stringtwo = "� � � ���?";
                }
                if (global_rnd3 == 12) {
                    stringtwo = "� ��� ��� �� �� ����� �����!";
                }
                if (global_rnd3 == 13) {
                    stringtwo = "� ��� ��� ��� ��� ��� ���� ��� �� ���������.";
                }
                if (global_rnd3 == 14) {
                    stringtwo = "� ������ ����.";
                }
                if (global_rnd3 == 15) {
                    stringtwo = "� � ���� ��� �����, �� � �����?";
                }
                if (global_rnd3 == 16) {
                    stringtwo = "� ������ � ���� ���� ��������, �� ���, �����?";
                }
                if (global_rnd3 == 17) {
                    stringtwo = "� �� ��, ��������? �� �� ��� �������?";
                }
                if (global_rnd3 == 18) {
                    stringtwo = "� �����. ����� ������� �� ��������.";
                }
                if (global_rnd3 == 19) {
                    stringtwo = "� � ���� ���.";
                }
                if (global_rnd3 == 20) {
                    stringtwo = "� Kept you waiting, huh?";
                }
                if (global_rnd3 == 21) {
                    stringtwo = "� �� ���, ����?";
                }
                if (global_rnd3 == 22) {
                    stringtwo = "� ������� ;-)";
                }
                if (global_rnd3 == 23) {
                    stringtwo = "� �� �� ��������� ���, ����� ��� ��������.";
                }
                if (global_rnd3 == 24) {
                    stringtwo = "� �� ��� ���������-��?";
                }
                if (global_rnd3 == 25) {
                    stringtwo = "� �� ���� �����, ��� ���� �����!";
                }
                if (global_rnd3 == 26) {
                    stringtwo = "� " + (kogo.substring(0, 1).toUpperCase() + kogo.substring(1)) + " �� �����������.";
                }
                if (global_rnd3 == 27) {
                    stringtwo = "� ���";
                }
                if (global_rnd3 == 28) {
                    stringtwo = "� ������� ��� ������!";
                }
                if (global_rnd3 == 29) {
                    stringtwo = "� Fuck you.";
                }
                if (global_rnd3 == 30) {
                    stringtwo = "� �i��� �i.";
                }
                if (global_rnd3 == 31) {
                    stringtwo = "� ��� ���!";
                }
                if (global_rnd3 == 32) {
                    stringtwo = "� ��� ��� ���, �����, ������ ������ �����?";
                }
                if (global_rnd3 == 33) {
                    stringtwo = "� � ���� 5� ���";
                }
                if (global_rnd3 == 34) {
                    stringtwo = "� � �����";
                }

                //channel.sendMessage("```"+stringone + stringtwo+"```").queue();

                embedBuilder.addField(kto2 + " �� " + otkuda2 + " ��������:", stringone + stringtwo, true);
                channel.sendMessage(embedBuilder.build()).queue();


            }

            return true;
        } else {
            return false;
        }

    }
}
