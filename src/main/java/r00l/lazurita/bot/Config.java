package r00l.lazurita.bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import r00l.lazurita.bot.Commands.*;

public class Config {

    private List<Command> commands;
    private String token;
    private String master;
    private String creator;
    private String key;
    private String role;
    private String defaultChannel;
    private String openingMessage;
    private String endingMessage;
    private String newChannelMessage;
    private String isPlaying;
    private boolean allowOnlyDefaultChannel;
    private boolean allowAudio; // задел на работу с аудио =\
    private boolean allowNsfw;
    private boolean allowReactsAnytime;
    private boolean allowReactsToBots;
    private boolean allowNewChannelMessage;
    private boolean allowOpeningMessage;
    private boolean allowEndingMessage;

    Config(Properties properties) {
        commands = new ArrayList<>();
        commands.add(new PingCommand());
        commands.add(new HelpCommand());
        commands.add(new SayCommand());
        commands.add(new ResetCommand());
        commands.add(new WeatherCommand());
        commands.add(new BobsonCommand());
        commands.add(new Rule34Command());
        commands.add(new RandomDiceCommand());
        commands.add(new RandomNumberCommand());
        commands.add(new RandomRangeCommand());
        commands.add(new RandomCoinCommand());
        commands.add(new E621Command());
        commands.add(new ChooseCommand());
        commands.add(new AskCommand());
        commands.add(new StulCommand());
        commands.add(new MolCommand());



        token = getProperty(properties, "token");
        master = getProperty(properties, "master");
        creator = getProperty(properties, "creator");
        key = getProperty(properties, "key");
        role = getProperty(properties, "role");
        isPlaying = getProperty(properties, "isPlaying");
        defaultChannel = getProperty(properties, "defaultChannel");
        openingMessage = getProperty(properties, "openingMessage", "ПРИВА ПЕДИКИ))))))))))))))xDDDDDDDDDD");
        endingMessage = getProperty(properties, "endingMessage", "ПОКИ ПЕДИКИ)))))xDDDDDDDDDDDDDDDDDDDDDD");
        newChannelMessage = getProperty(properties, "newChannelMessage", "КАНАЛ СЛАДКИЙ АНАЛ!");
        allowAudio = Boolean.parseBoolean(getProperty(properties, "allowAudio", "false")); // задел на работу с аудио =\
        allowNsfw = Boolean.parseBoolean(getProperty(properties, "allowNsfw", "false"));
        allowReactsAnytime = Boolean.parseBoolean(getProperty(properties, "allowReactsAnytime", "false"));
        allowReactsToBots = Boolean.parseBoolean(getProperty(properties, "allowReactsToBots", "false"));
        allowNewChannelMessage = Boolean.parseBoolean(getProperty(properties, "allowNewChannelMessage", "false"));
        allowOpeningMessage = Boolean.parseBoolean(getProperty(properties, "allowOpeningMessage", "false"));
        allowEndingMessage = Boolean.parseBoolean(getProperty(properties, "allowEndingMessage", "false"));
        allowOnlyDefaultChannel = Boolean.parseBoolean(getProperty(properties, "allowOnlyDefaultChannel", "false"));
    }

    private String getProperty(Properties properties, String name, String defaultValue) {
        String property = properties.getProperty(name, defaultValue);
        if (property != null && property.equals(""))
            property = null;
        return property;
    }

    private String getProperty(Properties properties, String name) {
        return getProperty(properties, name, "");
    }

    public List<Command> getCommands() {
        return commands;
    }

    String getToken() {
        return token;
    }

    String getMaster() {
        return master;
    }

    public String getCreator() {
        return creator;
    }

    public String getIsPlaying() {
        return isPlaying;
    }

    public String getRole() {
        return role;
    }

    public boolean isAllowOnlyDefaultChannel() {
        return allowOnlyDefaultChannel;
    }

    public String getDefaultChannel() {
        return defaultChannel;
    }

    public String getOpeningMessage() {
        return openingMessage;
    }

    public String getEndingMessage() {
        return endingMessage;
    }

    public String getNewChannelMessage() {
        return newChannelMessage;
    }

    public String getKey() {
        return key;
    }

    public boolean isAllowAudio() {
        return allowAudio;
    }

    public boolean isAllowNsfw() {
        return allowNsfw;
    }

    public boolean isAllowReactsAnytime() {
        return allowReactsAnytime;
    }

    public boolean isAllowReactsToBots() {
        return allowReactsToBots;
    }

    public boolean isAllowNewChannelMessage() {
        return allowNewChannelMessage;
    }

    public boolean isAllowOpeningMessage() {
        return allowOpeningMessage;
    }

    public boolean isAllowEndingMessage() {
        return allowEndingMessage;
    }
}
