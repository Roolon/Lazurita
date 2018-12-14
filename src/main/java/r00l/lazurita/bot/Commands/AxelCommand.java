package r00l.lazurita.bot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import r00l.lazurita.bot.Bot;
import java.io.UnsupportedEncodingException;
import java.sql.*;

import java.awt.*;

public class AxelCommand implements Command {

    @Override
    public boolean execute(Bot bot, Message message, MessageChannel channel, User author, String... inputs) {
        if (inputs[0].equalsIgnoreCase("axl")) {

            EmbedBuilder embedBuilder = new EmbedBuilder()
                    .setAuthor(author.getName(), author.getAvatarUrl(), author.getAvatarUrl())
                    .setColor(Color.decode("#AB82FF"));

            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }

            Connection connection = null;
            try
            {

                try {
                    connection = DriverManager.getConnection("jdbc:sqlite:/home/admin/jlurabot/lurapon.s3db");
                } catch (SQLException e) {
                    System.out.println(e);
                }

                Statement statement_rs_axel = null;
                Statement statement_rs_axelm1 = null;
                Statement statement_rs_axelm2 = null;
                Statement statement_rs_axelp1 = null;
                Statement statement_rs_axelp2 = null;

                try {

                    statement_rs_axel = connection.createStatement();
                    statement_rs_axelm1 = connection.createStatement();
                    statement_rs_axelm2 = connection.createStatement();
                    statement_rs_axelp1 = connection.createStatement();
                    statement_rs_axelp2 = connection.createStatement();

                } catch (SQLException e) {
                    System.out.println(e);
                }
                try {
                    statement_rs_axel.setQueryTimeout(1);  // set timeout to 1 sec.
                    statement_rs_axelm1.setQueryTimeout(1);  // set timeout to 1 sec.
                    statement_rs_axelm2.setQueryTimeout(1);  // set timeout to 1 sec.
                    statement_rs_axelp1.setQueryTimeout(1);  // set timeout to 1 sec.
                    statement_rs_axelp2.setQueryTimeout(1);  // set timeout to 1 sec.

                } catch (SQLException e) {
                    System.out.println(e);
                }

                int random_final = (int)(Math.random() * 10)+1;
                int random_g = (int)(Math.random() * 123)+1;


                ResultSet rs3 = statement_rs_axel.executeQuery("select * from DATA_AXEL WHERE Id='"+random_final+"'");
               ResultSet rs3m1 = statement_rs_axelm1.executeQuery("select * from DATA_AXEL WHERE Id='"+random_g+"'");
                int random_g1 = (int)(Math.random() * 123)+1;
                ResultSet rs3m2 = statement_rs_axelm2.executeQuery("select * from DATA_AXEL WHERE Id='"+random_g1+"'");
                int random_g2 = (int)(Math.random() * 123)+1;
                ResultSet rs3p1 = statement_rs_axelp1.executeQuery("select * from DATA_AXEL WHERE Id='"+random_g2+"'");
                int random_g3 = (int)(Math.random() * 123)+1;
                ResultSet rs3p2 = statement_rs_axelp2.executeQuery("select * from DATA_AXEL WHERE Id='"+random_g3+"'");

                String Quote_MSG_MSG1 = rs3.getString("Final");
                String Quote_MSG_m1 = rs3m1.getString("Rev");
                String Quote_MSG_m2 = rs3m2.getString("Rev");
                String Quote_MSG_p1 = rs3p1.getString("Rev");
                String Quote_MSG_p2 = rs3p2.getString("Rev");

                try {
                    Quote_MSG_MSG1 = new String (Quote_MSG_MSG1.getBytes("UTF-8"),"UTF-8").replace(".","").replace("скорее хуй!","скорее shit!");
                    Quote_MSG_m1 = new String (Quote_MSG_m1.getBytes("UTF-8"),"UTF-8").replace(".","").replace("скорее хуй!","скорее shit!");
                    Quote_MSG_m2 = new String (Quote_MSG_m2.getBytes("UTF-8"),"UTF-8").replace(".","").replace("скорее хуй!","скорее shit!");
                    Quote_MSG_p1 = new String (Quote_MSG_p1.getBytes("UTF-8"),"UTF-8").replace(".","").replace("скорее хуй!","скорее shit!");
                    Quote_MSG_p2 = new String (Quote_MSG_p2.getBytes("UTF-8"),"UTF-8").replace(".","").replace("скорее хуй!","скорее shit!");


                } catch (UnsupportedEncodingException e) {
                    System.out.println(e);
                }

                embedBuilder.addField("Axel says: ", Quote_MSG_m1+"\n"+Quote_MSG_m2+"\n"+Quote_MSG_p1+"\n"+Quote_MSG_p2+"\n"+Quote_MSG_MSG1 + "...", true);
                channel.sendMessage(embedBuilder.build()).queue();

            } catch (SQLException e1) {
                embedBuilder.addField("Axel says: ", "УВАГА: " + e1, true);
                channel.sendMessage(embedBuilder.build()).queue();
            }
                return true;
            } else{
                return false;
            }
        }
}


