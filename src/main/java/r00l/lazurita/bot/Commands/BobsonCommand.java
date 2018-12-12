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
                kto = "педик";
                kto2 = "русофоб";
            }
            if (global_rnd == 2) {
                kto = "математик";
                kto2 = "инженер";
            }
            if (global_rnd == 3) {
                kto = "инженер";
                kto2 = "шпион";
            }
            if (global_rnd == 4) {
                kto = "пёс";
                kto2 = "петух";
            }
            if (global_rnd == 5) {
                kto = "петух";
                kto2 = "урка";
            }
            if (global_rnd == 6) {
                kto = "говнюк";
                kto2 = "дед";
            }
            if (global_rnd == 7) {
                kto = "дед";
                kto2 = "собака";
            }
            if (global_rnd == 8) {
                kto = "генерал";
                kto2 = "ковбой";
            }
            if (global_rnd == 9) {
                kto = "ковбой";
                kto2 = "пидор";
            }
            if (global_rnd == 10) {
                kto = "битард";
                kto2 = "бомж";
            }
            if (global_rnd == 11) {
                kto = "Энштейн";
                kto2 = "Киселёв";
            }
            if (global_rnd == 12) {
                kto = "твоя мать";
                kto2 = "шлюха";
            }
            if (global_rnd == 13) {
                kto = "Шрёдингер";
                kto2 = "Шреддер";
            }
            if (global_rnd == 14) {
                kto = "Обама";
                kto2 = "беляш";
            }
            if (global_rnd == 15) {
                kto = "Путин";
                kto2 = "владыка";
            }
            if (global_rnd == 16) {
                kto = "поцан";
                kto2 = "гопник";
            }
            if (global_rnd == 17) {
                kto = "Быстрый Гонзалес";
                kto2 = "сиська";
            }
            if (global_rnd == 18) {
                kto = "Ульфрик Буревестник";
                kto2 = "Мишаня без ноги";
            }
            if (global_rnd == 19) {
                kto = "мем";
                kto2 = "член";
            }
            if (global_rnd == 20) {
                kto = "червепидор";
                kto2 = "червячок";
            }
            if (global_rnd == 21) {
                kto = "Аксель";
                kto2 = "Таракан";
            }
            if (global_rnd == 22) {
                kto = "инвалид";
                kto2 = "денди и франт";
            }
            if (global_rnd == 23) {
                kto = "поручик Ржевский";
                kto2 = "Василий Иванович";
            }
            if (global_rnd == 24) {
                kto = "ветеран";
                kto2 = "ветеринар";
            }
            if (global_rnd == 25) {
                kto = "Жока";
                kto2 = "Бока";
            }
            if (global_rnd == 26) {
                kto = "Бока";
                kto2 = "Жока";
            }
            if (global_rnd == 27) {
                kto = "Вендрик";
                kto2 = "Сиф";
            }
            if (global_rnd == 28) {
                kto = "Чебурашка";
                kto2 = "какой-то зеленый пупырчатый хуесос";
            }
            if (global_rnd == 29) {
                kto = "Штирлиц";
                kto2 = "Борман";
            }
            if (global_rnd == 30) {
                kto = "президент Казахстана";
                kto2 = "тентакль";
            }
            if (global_rnd == 31) {
                kto = "веган";
                kto2 = "президент Казахстана";
            }
            if (global_rnd == 32) {
                kto = "качок";
                kto2 = "паучок";
            }
            if (global_rnd == 33) {
                kto = "вейпер";
                kto2 = "петушара";
            }
            if (global_rnd == 34) {
                kto = "космодесантник";
                kto2 = "Хорус";
            }
            if (global_rnd == 35) {
                kto = "Бог";
                kto2 = "Путин";
            }
            if (global_rnd == 36) {
                kto = "батя";
                kto2 = "суп";
            }
            if (global_rnd == 37) {
                kto = "Вовочка";
                kto2 = "хулиган";
            }
            if (global_rnd == 38) {
                kto = "Родда";
                kto2 = "крыса";
            }
            if (global_rnd == 39) {
                kto = "Снейк";
                kto2 = "Оцелот";
            }
            if (global_rnd == 40) {
                kto = "Флаттершай";
                kto2 = "Кролик";
            }
            if (global_rnd == 41) {
                kto = "кусок говна";
                kto2 = "код этого бота";
            }
            if (global_rnd == 42) {
                kto = "сталкер";
                kto2 = "Сидорович";
            }
            if (global_rnd == 43) {
                kto = "Тоха Жирный";
                kto2 = "хуесос из нижнего интернета";
            }

            int global_rnd1 = (int) (Math.random() * 41) + 1;
            if (global_rnd1 == 1) {
                kogo = "математиков";
            }
            if (global_rnd1 == 2) {
                kogo = "Энштейнов";
            }
            if (global_rnd1 == 3) {
                kogo = "коней";
            }
            if (global_rnd1 == 4) {
                kogo = "солдат";
            }
            if (global_rnd1 == 5) {
                kogo = "анимешников";
            }
            if (global_rnd1 == 6) {
                kogo = "вейперов";
            }
            if (global_rnd1 == 7) {
                kogo = "негров";
            }
            if (global_rnd1 == 8) {
                kogo = "шлюх";
            }
            if (global_rnd1 == 9) {
                kogo = "лосей";
            }
            if (global_rnd1 == 10) {
                kogo = "инженеров";
            }
            if (global_rnd1 == 11) {
                kogo = "барменов";
            }
            if (global_rnd1 == 12) {
                kogo = "мемасов";
            }
            if (global_rnd1 == 13) {
                kogo = "собак";
            }
            if (global_rnd1 == 14) {
                kogo = "хохлов";
            }
            if (global_rnd1 == 15) {
                kogo = "котов";
            }
            if (global_rnd1 == 16) {
                kogo = "Шредигеров";
            }
            if (global_rnd1 == 17) {
                kogo = "поней";
            }
            if (global_rnd1 == 18) {
                kogo = "твою мать";
            }
            if (global_rnd1 == 19) {
                kogo = "талибов";
            }
            if (global_rnd1 == 20) {
                kogo = "Бобсонов";
            }
            if (global_rnd1 == 21) {
                kogo = "сепаратистов";
            }
            if (global_rnd1 == 22) {
                kogo = "гномов";
            }
            if (global_rnd1 == 23) {
                kogo = "ветеранов";
            }
            if (global_rnd1 == 24) {
                kogo = "Быстрого Гонзалеса";
            }
            if (global_rnd1 == 25) {
                kogo = "бомжей";
            }
            if (global_rnd1 == 26) {
                kogo = "алкоголиков";
            }
            if (global_rnd1 == 27) {
                kogo = "космодесантников";
            }
            if (global_rnd1 == 28) {
                kogo = "инвалидов";
            }
            if (global_rnd1 == 29) {
                kogo = "петухов";
            }
            if (global_rnd1 == 30) {
                kogo = "тоходевок";
            }
            if (global_rnd1 == 31) {
                kogo = "пидоров";
            }
            if (global_rnd1 == 32) {
                kogo = "крокодилов";
            }
            if (global_rnd1 == 33) {
                kogo = "маленьких девочек";
            }
            if (global_rnd1 == 34) {
                kogo = "чугун";
            }
            if (global_rnd1 == 35) {
                kogo = "дакимакур";
            }
            if (global_rnd1 == 36) {
                kogo = "азур";
            }
            if (global_rnd1 == 37) {
                kogo = "школьников";
            }
            if (global_rnd1 == 38) {
                kogo = "Снейков";
            }
            if (global_rnd1 == 39) {
                kogo = "ебинов";
            }
            if (global_rnd1 == 40) {
                kogo = "казахов";
            }
            if (global_rnd1 == 41) {
                kogo = "феечек Винкс";
            }

            int global_rnd2 = (int) (Math.random() * 20) + 1;
            if (global_rnd2 == 1) {
                otkuda = "сейфа";
                otkuda2 = "Банковских взвизгов";
            }
            if (global_rnd2 == 2) {
                otkuda = "ботинка";
                otkuda2 = "Вечернего Геннадий";
            }
            if (global_rnd2 == 3) {
                otkuda = "горящей машины";
                otkuda2 = "Лесных известий";
            }
            if (global_rnd2 == 4) {
                otkuda = "ануса Рулона";
                otkuda2 = "Узника замка IF";
            }
            if (global_rnd2 == 5) {
                otkuda = "шкафа";
                otkuda2 = "Мебелей и Ебелей";
            }
            if (global_rnd2 == 6) {
                otkuda = "ануса Пса";
                otkuda2 = "Эмуляторных страстей";
            }
            if (global_rnd2 == 7) {
                otkuda = "кармана";
                otkuda2 = "Воровских Вестей";
            }
            if (global_rnd2 == 8) {
                otkuda = "сумочки";
                otkuda2 = "Модных Штучек";
            }
            if (global_rnd2 == 9) {
                otkuda = "кучи говна";
                otkuda2 = "Украинской Правды";
            }
            if (global_rnd2 == 10) {
                otkuda = "унитаза";
                otkuda2 = "Сантехнического Вестника";
            }
            if (global_rnd2 == 11) {
                otkuda = "штанов";
                otkuda2 = "Гривни Завтра";
            }
            if (global_rnd2 == 12) {
                otkuda = "шляпы";
                otkuda2 = "Мамкиного Модника";
            }
            if (global_rnd2 == 13) {
                otkuda = "коробки";
                otkuda2 = "Змеиных штуковин";
            }
            if (global_rnd2 == 14) {
                otkuda = "банки с соленьями";
                otkuda2 = "Бабкиного погребка";
            }
            if (global_rnd2 == 15) {
                otkuda = "комода";
                otkuda2 = "Двух вечерних стульев";
            }
            if (global_rnd2 == 16) {
                otkuda = "уретры";
                otkuda2 = "Сельского Порнхаба";
            }
            if (global_rnd2 == 17) {
                otkuda = "себя";
                otkuda2 = "Саморазвития для бедных";
            }
            if (global_rnd2 == 18) {
                otkuda = "погреба";
                otkuda2 = "Можем Повторить!";
            }
            if (global_rnd2 == 19) {
                otkuda = "ящика";
                otkuda2 = "Гробовых вестей";
            }
            if (global_rnd2 == 20) {
                otkuda = "бесконечного всеобъемлющего хаоса";
                otkuda2 = "Ока Варпа";
            }

            int global_rnd_choicemaker = (int) (Math.random() * 100) + 1;
            if (global_rnd_choicemaker < 20) {
                int global_rndlocalgay1 = (int) (Math.random() * 3) + 1;
                if (global_rndlocalgay1 == 1) {
                    stringone = (kto.substring(0, 1).toUpperCase() + kto.substring(1)) + " достал из " + otkuda + " записку " + kogo + ".";
                }
                if (global_rndlocalgay1 == 2) {
                    stringone = "Купил мужик шляпу.";
                }
                if (global_rndlocalgay1 == 3) {
                    stringone = "Идёт " + kto + " по лесу, видит — машина горит.";
                }

                int global_rndlocalgay2 = (int) (Math.random() * 6) + 1;
                if (global_rndlocalgay2 == 1) {
                    stringtwo = "А она ему как раз.";
                }
                if (global_rndlocalgay2 == 2) {
                    stringtwo = "Сел в неё и сгорел.";
                }
                if (global_rndlocalgay2 == 3) {
                    stringtwo = "— Блядь, медведь сгорел.";
                }
                if (global_rndlocalgay2 == 4) {
                    stringtwo = "Война. Война никогда не меняется.";
                }
                if (global_rndlocalgay2 == 5) {
                    stringtwo = "Голова отца.";
                }
                if (global_rndlocalgay2 == 6) {
                    stringtwo = "— Да.";
                }
                //channel.deleteMessageById(message.getId()).queue();
                //channel.sendMessage("```"+stringone +"\n"+ stringtwo+"```").queue();

                embedBuilder.addField(kto2 + " из " + otkuda2 + " сообщает:", stringone + "\n" + stringtwo, true);
                channel.sendMessage(embedBuilder.build()).queue();
            } else {

                int global_gayporn = (int) (Math.random() * 24) + 1;
                if (global_gayporn == 1) {
                    stringone = "Бесконечное число " + kogo + " заходит в бар. Первый заказывает одно пиво. Второй — половину, третий - четверть. Бармен отвечает:\n";
                }
                if (global_gayporn == 2) {
                    stringone = "Гена и " + kto + " попали в тюрьму. \n— Гена, а нас будут брить? \n— Вон у крысы спроси. \n- Крыса, а нас будут брить?\n ";
                }
                if (global_gayporn == 3) {
                    stringone = "Запускают как—то раз инжинера, физика и " + kogo + " в тюрьму, ну и дают задание — зашкварить как можно больше людей в камере. Инжинер заходит, сразу садится на пол, начинает срать и кидаться говном в заключенных, его естественно пиздят, а на выходе говорят — мол петух, ты завалил тест, попал говном только в половину, да и сам первый зашкварился. Заходит физик, и начинает с порогу задвигать — люди, мол, срут уже миллионы лет, и за это время молекулы говна проникли уже повсюду. Воздух, вода, шконки, даже небо — все это уже зашкварено, и вы сами, считайте, уже по уши в говне. Его тоже пиздят, и говорят - это же самозашквар, а кто тебя, петуха опущенного, слушать будет? Последним запускают " + kogo + ", смотрит по сторонам, резво забирается под шконарь, и начинает орать:\n";
                }
                if (global_gayporn == 4) {
                    stringone = "Гейзенберг и " + kto + " едут по трассе на конференцию, " + kto + " за рулём. Внезапно раздаётся удар и он останавливает машину. Гейзенберг выглядывает на дорогу:\n— Боже мой, похоже, я сбил " + kogo + "! \n- Они умерли?\n";
                }
                if (global_gayporn == 5) {
                    stringone = "Приходит " + kto + " в магазин и спрашивает: \n– Лепесины есть? \n- Нет.\n";
                }
                if (global_gayporn == 6) {
                    stringone = "— Ты где?\n— Ебу " + kogo + " в сауне.  \n— Ты с кем там?  \n— Со шлюхами. \n-  А что за женские голоса?\n ";
                }
                if (global_gayporn == 7) {
                    stringone = "Объезжает генерал части на фронте перед атакой. И тут " + kto + " задаёт ему вопрос:  \n- Скажите, товарищ генерал, а правда что война?\n";
                }
                if (global_gayporn == 8) {
                    stringone = "Шла девочка с дедушкой вдоль речки. Смотрят, " + kto + " плывет. Ну, а девочка и спрашивает:  \n— Откуда это?  А дедушка говорит:  \n— Было это давно. Жил принц и принцесса. Принц уехал воевать, а принцесса, подумав, что его убьют, утопилась в этой самой речушке. Спрашивает вновь девочка: \n- А " + kto + "-то откуда?\n";
                }
                if (global_gayporn == 9) {
                    stringone = "Охотник собрался на охоту в тайгу, местности не знает, берёт с собой проводника из местных. Идут по тайге — проводник впереди, прорубает чащу топором с длинным топорищем, охотник идёт за ним с ружьём, в спину дышит.  Вдруг – хуякс! – из чащи " + kto + " навстречу. Проводник замер с поднятым топором, " + kto + " тоже замер, смотрят друг на друга. Проводник, не оборачиваясь, говорит охотнику вполголоса:  \n— Иди сюда… Сзади тишина, он повторяет: \n— И–ди сю–да… Сзади опять тишина, он в третий раз уже аж шипит: \n- Иди сюда, блядь! \nСзади охотник с возмущением: \n";
                }
                if (global_gayporn == 10) {
                    stringone = "Заходит в бар " + kto + ", заказывает пиво, и отказывается платить за него. Вышибала говорит: \n— Плати за пиво, сука. А " + kto + " отвечает: \n— Принимаем, что я уже оплатил. А вышибала ему:\n";
                }
                if (global_gayporn == 11) {
                    stringone = "Зашёл, значит, пацан в комнату. Берёт " + kogo + " из " + otkuda + " и давай на огороде в землю закапывать. Они трепыхаются, кричат, а пацан им говорит:\n";
                }
                if (global_gayporn == 12) {
                    stringone = "Как говорил мой дед:\n";
                }
                if (global_gayporn == 13) {
                    stringone = "Два мужика идут по тротуару друг навстречу другу, оба с несчастным видом подволакивают правую ногу, шаркают так, прихрамывают. Один понимающе смотрит на второго и говорит:\n- Вьетнам, тысяча девятьсот шестьдесят девятый. \nВторой, с перекошенной рожей:\n";
                }
                if (global_gayporn == 14) {
                    stringone = "Ржевский подпрыгнул до потолка и крикнул в толпу " + kogo + ":\n";
                }
                if (global_gayporn == 15) {
                    stringone = "Чукча заходит в чум, а там сидит " + kto + " и жалуется:\n ";
                }
                if (global_gayporn == 16) {
                    stringone = "Гейзенберг произнёс эти слова, в окружении верных ему " + kogo + ":\n";
                }
                if (global_gayporn == 17) {
                    stringone = "Идёт " + kto + " по лесу, видит — машина горит.\n";
                }
                if (global_gayporn == 18) {
                    stringone = "— Блядь, " + kto + " сгорел.\n";
                }
                if (global_gayporn == 19) {
                    stringone = "Лозунг юных " + kogo + ":\n";
                }
                if (global_gayporn == 20) {
                    stringone = "Как любил говорить Дагот-Ур:\n";
                }
                if (global_gayporn == 21) {
                    stringone = "Физик, математик и инженер стоят в поле.\nКаждому выдали одинаковое число досок для забора и сказали огородить максимально возможное число овец.\nИнженер построил небольшой, но крепкий загончик в форме квадрата.\nФизик построил загон в форме окружности, утверждая что такая форма может вместить больше овец.\nМатематик построил заборчик по кругу, сам сел в центре, заявляя:\n";
                }
                if (global_gayporn == 22) {
                    stringone = "Идёт мужик по лесу, увидел дупло.\nПодошёл к дереву, засунул руку в дупло, вытаскивает - нет руки.\nОн обалдел, засунул другую руку, вытаскивает - и этой нет.\nТогда он голову в дупло суёт и кричит:\n";
                }
                if (global_gayporn == 23) {
                    stringone = "Заходит ковбой в бар, подходит к стойке и говорит:\n- Налей мне виски, Джо.\n- А что это от тебя так воняет, Билл? - отвечает бармен.\n- О, это долгая история...\n- Расскажи, Билл.\n- Ну, хорошо.\nБыла раньше у меня любимая лошадь. И ехал я как-то на ней по прерии, уже была глубокка ночь, ну и решил я заночевать на дереве. Лошадь привязал к дереву, а сам полез наверх.\nИ вот я уже спал, как услышал ржание своей лошади. Я проснулся и увидел два желтых глаза, тогда я быстро вытащил пистотлет и стрельнул промеж глаз.\nНаутро я увидел, что это была рысь. Но вскоре моя лошадь умерла и в память о ней я отрезал у нее копыта и постоянно ношу их с собой.\n- Так это воняют копыта твоей лошади, Билл?\n";
                }
                if (global_gayporn == 24) {
                    stringone = "Bыходит ковбой из бара, подходит к своей лошади, задирает ей хвост и целует в задницу.\n- Что это ты делаешь? - интересуются окружающие.\n- Да у меня губы обветрелись, - отвечает тот.\n- А что, это помогает?\n";
                }

                int global_rnd3 = (int) (Math.random() * 34) + 1;
                if (global_rnd3 == 1) {
                    stringtwo = "— Меньше кружки не наливаем.";
                }
                if (global_rnd3 == 2) {
                    stringtwo = "— Блядь, медведь сгорел.";
                }
                if (global_rnd3 == 3) {
                    stringtwo = "— Так, а ну-ка вышли все нахуй.";
                }
                if (global_rnd3 == 4) {
                    stringtwo = "— Всем война, а тебе на ебло говна.";
                }
                if (global_rnd3 == 5) {
                    stringtwo = "— Спокойно! Сейчас всё объясню!";
                }
                if (global_rnd3 == 6) {
                    stringtwo = "— Нищиёбы блять!";
                }
                if (global_rnd3 == 7) {
                    stringtwo = "— Принимаем, что я нахожусь снаружи.";
                }
                if (global_rnd3 == 8) {
                    stringtwo = "— Потому что я туда нассал.";
                }
                if (global_rnd3 == 9) {
                    stringtwo = "— Вот видишь, как плохо, что лошадь умерла";
                }
                if (global_rnd3 == 10) {
                    stringtwo = "— Да.";
                }
                if (global_rnd3 == 11) {
                    stringtwo = "— А я ебу?";
                }
                if (global_rnd3 == 12) {
                    stringtwo = "— Мне тут не до шуток блядь!";
                }
                if (global_rnd3 == 13) {
                    stringtwo = "— Так наш сын уже два часа как на дискотеке.";
                }
                if (global_rnd3 == 14) {
                    stringtwo = "— Голова отца.";
                }
                if (global_rnd3 == 15) {
                    stringtwo = "— У тебя хуй видно, ты в курсе?";
                }
                if (global_rnd3 == 16) {
                    stringtwo = "— Почему у тебя тире короткое, ты что, пидор?";
                }
                if (global_rnd3 == 17) {
                    stringtwo = "— Ты че, ебанутый? Че ты там делаешь?";
                }
                if (global_rnd3 == 18) {
                    stringtwo = "— Война. Война никогда не меняется.";
                }
                if (global_rnd3 == 19) {
                    stringtwo = "— Я твой дед.";
                }
                if (global_rnd3 == 20) {
                    stringtwo = "— Kept you waiting, huh?";
                }
                if (global_rnd3 == 21) {
                    stringtwo = "— Ты что, ебан?";
                }
                if (global_rnd3 == 22) {
                    stringtwo = "— ДРАТУТИ ;-)";
                }
                if (global_rnd3 == 23) {
                    stringtwo = "— Ну вы держитесь там, всего вам хорошего.";
                }
                if (global_rnd3 == 24) {
                    stringtwo = "— Ну как поплавали-то?";
                }
                if (global_rnd3 == 25) {
                    stringtwo = "— Не лезь блять, она тебя сожрёт!";
                }
                if (global_rnd3 == 26) {
                    stringtwo = "— " + (kogo.substring(0, 1).toUpperCase() + kogo.substring(1)) + " не обслуживаем.";
                }
                if (global_rnd3 == 27) {
                    stringtwo = "— Лол";
                }
                if (global_rnd3 == 28) {
                    stringtwo = "— СКАЙРИМ ДЛЯ НОРДОВ!";
                }
                if (global_rnd3 == 29) {
                    stringtwo = "— Fuck you.";
                }
                if (global_rnd3 == 30) {
                    stringtwo = "— Пiшов тi.";
                }
                if (global_rnd3 == 31) {
                    stringtwo = "— Как раз!";
                }
                if (global_rnd3 == 32) {
                    stringtwo = "— Вам там что, блять, совсем делать нехуй?";
                }
                if (global_rnd3 == 33) {
                    stringtwo = "— У меня 5к ММР";
                }
                if (global_rnd3 == 34) {
                    stringtwo = "— я веган";
                }

                //channel.sendMessage("```"+stringone + stringtwo+"```").queue();

                embedBuilder.addField(kto2 + " из " + otkuda2 + " сообщает:", stringone + stringtwo, true);
                channel.sendMessage(embedBuilder.build()).queue();


            }

            return true;
        } else {
            return false;
        }

    }
}
