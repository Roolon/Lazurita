package r00l.lazurita.bot.Commands;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

public class MolCommand implements Command {



    public MolCommand() {   }




    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        if (inputs[0].equalsIgnoreCase("mol")) {

            Document doc = null;

            EmbedBuilder embedBuilder = new EmbedBuilder()
                    .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                    .setColor(Color.decode("#AB82FF"));

            try {
                int rnd = (int) (Math.random() * 946)+1;
                doc = Jsoup.connect("https://molites.ru/page/"+rnd+"/").userAgent("Mozilla").timeout(1000*4).get();
                embedBuilder.setTitle("https://molites.ru/page/"+rnd+"/");
               // System.out.println(doc);
            } catch (IOException e) {
                // TODO Auto-generated catch block

                embedBuilder.addField("Поиск по molites.ru:", "УВАГА: Ошибка соединения.", true);
                channel.sendMessage(embedBuilder.build()).queue();
            }



            Elements links = doc.getElementsByTag("p");




            //

            ArrayList<String> linkscash = new ArrayList<String>();


            linkscash.clear();


            for (Element link : links) {

                linkscash.add(link.text());
                //System.out.println(linkscash.size());
            }

            if (linkscash.size()==0){
                embedBuilder.addField("Поиск по molites.ru:", "УВАГА: Ошибка получения содержимого.", true);
                channel.sendMessage(embedBuilder.build()).queue();
            }
            else {

                String text = linkscash.get(1);
                embedBuilder.addField("Поиск по molites.ru:", text, true);
                channel.sendMessage(embedBuilder.build()).queue();
                //     message.delete().queue();}

            }return true; }else {return false;}

    }
}