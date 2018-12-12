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

public class Rule34Command implements Command {
	


public Rule34Command() {   }	  	    	




@Override
public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
	 if (inputs[0].equalsIgnoreCase("r34")) {
		 
		 Document doc = null;
		 
		 EmbedBuilder embedBuilder = new EmbedBuilder()
                 .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                 .setColor(Color.decode("#AB82FF"));

         try {
			doc = Jsoup.connect("http://rule34.paheal.net/post/list/"+inputs[1]+ "/1").userAgent("Mozilla").timeout(1000*2).get();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			embedBuilder.addField("Поиск по rule34: `" + inputs[1] + "`", "УВАГА: Тег не найден.", true);
			 channel.sendMessage(embedBuilder.build()).queue();
		}

        

         Elements links = doc.select("a[href~=(?i)\\.(png|jpe?g|gif)]");
             
             
             
             
       //      

             ArrayList<String> linkscash = new ArrayList<String>();


             linkscash.clear();


         for (Element link : links) {

        	 linkscash.add(link.attr("href"));
        	 System.out.println(linkscash.size());
         }
         
         if (linkscash.size()==0){
             embedBuilder.addField("Поиск по rule34: `" + inputs[1] + "`", "УВАГА: Ошибка получения содержимого.", true);
             channel.sendMessage(embedBuilder.build()).queue();
         }
         else {
             embedBuilder.setTitle("Поиск по rule34: `" + inputs[1] + "`");
             int rnd = (int) (Math.random() * ((linkscash.size())));
             embedBuilder.setImage(linkscash.get(rnd));
             channel.sendMessage(embedBuilder.build()).queue();
             //message.delete().queue();}

         }return true; }else {return false;}

}
}


   