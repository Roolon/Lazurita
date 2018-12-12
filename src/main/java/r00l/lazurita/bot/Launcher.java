package r00l.lazurita.bot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.requests.RequestFuture;

import javax.security.auth.login.LoginException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Launcher {

    public static JDA jda;

    Launcher(String[] args) throws RateLimitedException, InterruptedException {
        String fileName;
        if (args.length == 0)
            fileName = "config";
        else
            fileName = args[0];
        try (FileInputStream fileInputStream = new FileInputStream("/home/admin/jlurabot/" + fileName + ".properties")) {
            Properties properties = new Properties();
            properties.load(fileInputStream);

            Config config = new Config(properties); // грузим конфиг

            jda = new JDABuilder(AccountType.BOT)
                    .setToken(config.getToken())    // читаем токен бота
                    .build()
                    .awaitReady();               // синхронизируем код бота с JDA через лончер

            Bot bot = new Bot(config); // грузим конфиг в инстанс от JDA
            jda.addEventListener(bot); // добавляем бота как листенера евентов
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    
    
    public static User getUser(String name) throws NullPointerException {
        if (name == null)
            return null;
        if (name.startsWith("@"))
            name = name.substring(1);

        List<Member> members = jda.getSelfUser().getMutualGuilds().get(0).getMembers();
        for (Member member : members) {
            if (member.getEffectiveName().equalsIgnoreCase(name))
                return member.getUser();
            else if (member.getNickname() != null && member.getNickname().equalsIgnoreCase(name))
                return member.getUser();
            else if (member.getUser().getName().equalsIgnoreCase(name))
                return member.getUser();
            else if (member.getUser().getId().equalsIgnoreCase(name))
                return member.getUser();
        }

        return null;
    }

    public static Role getRole(String name) throws NullPointerException {
        if (name == null)
            return null;

        List<Role> roles = jda.getSelfUser().getMutualGuilds().get(0).getRoles();
        System.out.println(roles.size());
        for (Role role : roles) {
            if (role.getName().equalsIgnoreCase(name))
                return role;
            else if (role.getId().equalsIgnoreCase(name))
                return role;
        }

        return null;
    }
}
