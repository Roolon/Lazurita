package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class WeatherCommand implements Command {
	private static final String API_KEY = "bfa0b4d9a4a06cc7a965983e8d878251";

    
    public WeatherCommand() {   }	  	    	
    

    

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
    	 if (inputs[0].equalsIgnoreCase("pogoda")) {
    		 Document doc = null;

    		 EmbedBuilder embedBuilder = new EmbedBuilder()
                     .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                     .setColor(Color.decode("#AB82FF"));

             try {
				doc = Jsoup.connect("http://api.openweathermap.org/data/2.5/weather?q="+inputs[1]+"&mode=html&units=metric&appid="+API_KEY).userAgent("Mozilla").timeout(1000*2).get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            

                 Elements links = doc.getElementsByTag("Div");
                 
                 
                 
                 
           //      

                 ArrayList<String> linkscash = new ArrayList<String>();


                 linkscash.clear();


             for (Element link : links) {

                 linkscash.add(link.text());

             }

             embedBuilder.addField(linkscash.get(0)+"\n"+linkscash.get(1).replace("Clouds","\n"+"Облачность").replace("Humidity","\n"+"Влажность").replace("Wind","\n"+"Ветер").replace("m/s","м/с").replace("Pressure","\n"+"Давление").replace("hpa"," гПа"),"",true);
             channel.sendMessage(embedBuilder.build()).queue();
             
             
    	 }
		return false;
    }
}




