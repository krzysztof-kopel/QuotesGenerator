package quotes;

public class Quote {
    String content, author;
    Language language;

    Quote(String content, String author, Language language) {
        this.content = content;
        this.author = author;
        this.language = language;
    }

    Quote(Language language) throws java.io.IOException, java.lang.InterruptedException {
        this(language.shortcut);
        this.language = language;
    }

    Quote(String languageCode) throws java.io.IOException, java.lang.InterruptedException {
        String[] input = InternetConnector.downloadQuote(languageCode);
        this.content = input[0];
        this.author = input[1];
    }
}
