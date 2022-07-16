package quotes;

public enum Language {

    ENGLISH("English", "en"), SPAIN("Spain", "es"), PORTUGAL("Portugal", "pt"),
    GERMAN("German", "de"), FRENCH("French", "fr"), ITALIAN("Italian", "it"),
    CZECH("Czech", "cs"), SLOVAK("Slovak", "sk"), POLISH("Polish", "pl");

    Language(String name, String shortcut) {
        this.name = name;
        this.shortcut = shortcut;
    }

    String name, shortcut;

}
