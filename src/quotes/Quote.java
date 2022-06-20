package quotes;

public class Quote {
    String content, author, language;

    Quote(String content, String author, String language) {
        this.content = content;
        this.author = author;
        this.language = language;
    }

    Quote(String language) throws java.io.IOException, java.lang.InterruptedException {
        String[] input = InternetConnector.downloadQuote(language);
        this.content = input[0];
        this.author = input[1];
        this.language = language;
    }
}
