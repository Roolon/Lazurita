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
                                ask_string = "Да.";
                            }
                            if (global_rnd == 2) {
                                ask_string = "Ага!";
                            }
                            if (global_rnd == 3) {
                                ask_string = "Еще как!";
                            }
                            if (global_rnd == 4) {
                                ask_string = "О чем речь? Конечно да!";
                            }
                            if (global_rnd == 5) {
                                ask_string = "Угу.";
                            }
                            if (global_rnd == 6) {
                                ask_string = "Так и есть.";
                            }
                            if (global_rnd == 7) {
                                ask_string = "Всё так.";
                            }
                            if (global_rnd == 8) {
                                ask_string = "Известное дело.";
                            }
                            if (global_rnd == 9) {
                                ask_string = "А что? Разве могло быть иначе?";
                            }
                            if (global_rnd == 10) {
                                ask_string = "А то!";
                            }
                            if (global_rnd == 11) {
                                ask_string = "Агась.";
                            }
                            if (global_rnd == 12) {
                                ask_string = "Конечно.";
                            }
                            if (global_rnd == 13) {
                                ask_string = "Не подлежит сомнению.";
                            }
                            if (global_rnd == 14) {
                                ask_string = "Нечего и говорить.";
                            }
                            if (global_rnd == 15) {
                                ask_string = "Безоговорочно.";
                            }
                            if (global_rnd == 16) {
                                ask_string = "Само собой разумеется.";
                            }
                            if (global_rnd == 17) {
                                ask_string = "Иначе и быть не может.";
                            }
                            if (global_rnd == 18) {
                                ask_string = "Наверняка.";
                            }
                            if (global_rnd == 19) {
                                ask_string = "Без всяких.";
                            }
                            if (global_rnd == 20) {
                                ask_string = "Знамо дело.";
                            }
                            break;
                        case 2:
                            if (global_rnd == 1) {
                                ask_string = "Нет.";
                            }
                            if (global_rnd == 2) {
                                ask_string = "Не-а!";
                            }
                            if (global_rnd == 3) {
                                ask_string = "Дожидайся :-)";
                            }
                            if (global_rnd == 4) {
                                ask_string = "Увольте!";
                            }
                            if (global_rnd == 5) {
                                ask_string = "Фигушки.";
                            }
                            if (global_rnd == 6) {
                                ask_string = "Никак нет.";
                            }
                            if (global_rnd == 7) {
                                ask_string = "Нетути.";
                            }
                            if (global_rnd == 8) {
                                ask_string = "Отнюдь.";
                            }
                            if (global_rnd == 9) {
                                ask_string = "Да что вы говорите?";
                            }
                            if (global_rnd == 10) {
                                ask_string = "Гнусная ложь!";
                            }
                            if (global_rnd == 11) {
                                ask_string = "Вранье.";
                            }
                            if (global_rnd == 12) {
                                ask_string = "Как бы не так.";
                            }
                            if (global_rnd == 13) {
                                ask_string = "Глупости.";
                            }
                            if (global_rnd == 14) {
                                ask_string = "Ерунда.";
                            }
                            if (global_rnd == 15) {
                                ask_string = "Сомнительно.";
                            }
                            if (global_rnd == 16) {
                                ask_string = "Чушь.";
                            }
                            if (global_rnd == 17) {
                                ask_string = "Наговоры и враньё.";
                            }
                            if (global_rnd == 18) {
                                ask_string = "Ересь.";
                            }
                            if (global_rnd == 19) {
                                ask_string = "Ерунда.";
                            }
                            if (global_rnd == 20) {
                                ask_string = "Чёрта с два!";
                            }
                            break;
                        case 3:
                            if (global_rnd == 1) {
                                ask_string = "Понятия не имею.";
                            }
                            if (global_rnd == 2) {
                                ask_string = "А мне почем знать?";
                            }
                            if (global_rnd == 3) {
                                ask_string = "Позвоните в справочную :-)";
                            }
                            if (global_rnd == 4) {
                                ask_string = "Странный вопрос.";
                            }
                            if (global_rnd == 5) {
                                ask_string = "Я не спец в этом деле.";
                            }
                            if (global_rnd == 6) {
                                ask_string = "Лучше блинов покушай.";
                            }
                            if (global_rnd == 7) {
                                ask_string = "Это вопрос?";
                            }
                            if (global_rnd == 8) {
                                ask_string = "Сам то как думаешь?";
                            }
                            if (global_rnd == 9) {
                                ask_string = "У бати травы воруешь? Такую херню спросил...";
                            }
                            if (global_rnd == 10) {
                                ask_string = "Поехавший! Ну и вопросы.";
                            }
                            if (global_rnd == 11) {
                                ask_string = "Лол.";
                            }
                            if (global_rnd == 12) {
                                ask_string = "Кек.";
                            }
                            if (global_rnd == 13) {
                                ask_string = "Это что-то из новых мемов?";
                            }
                            if (global_rnd == 14) {
                                ask_string = "Азазазаза.";
                            }
                            if (global_rnd == 15) {
                                ask_string = "Кекус.";
                            }
                            if (global_rnd == 16) {
                                ask_string = "Да ты хуже ПСА. Хуйню несешь.";
                            }
                            if (global_rnd == 17) {
                                ask_string = "На Лилиуме тоже такое спрашивали.";
                            }
                            if (global_rnd == 18) {
                                ask_string = "Ты хохол что-ли?";
                            }
                            if (global_rnd == 19) {
                                ask_string = "Не смеши мои соленоиды.";
                            }
                            if (global_rnd == 20) {
                                ask_string = "Ниняю ;-)";
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



