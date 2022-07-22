package quotes;

public enum Language {

    ENGLISH("English", "en"), SPANISH("Espanol", "es"), PORTUGAL("Portugues", "pt"),
    GERMAN("Deutsch", "de"), FRENCH("Français", "fr"), ITALIAN("Italiano", "it"),
    SLOVAK("Slovenský", "sk"), POLISH("Polski", "pl");

    Language(String name, String shortcut) {
        this.name = name;
        this.shortcut = shortcut;
    }

    String name, shortcut;

}
