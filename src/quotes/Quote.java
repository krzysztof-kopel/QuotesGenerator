package quotes;

public class Quote {
    String content, author, language;

    Quote(String content, String author, String language) {
        this.content = content;
        this.author = author;
        this.language = language;
    }

    Quote(Language language) throws java.io.IOException, java.lang.InterruptedException {
        this(language.shortcut);
    }

    Quote(String language_code) throws java.io.IOException, java.lang.InterruptedException {
        String[] input = InternetConnector.downloadQuote(language_code);
        this.content = input[0];
        this.author = input[1];
        this.language = language_code;
    }
}
