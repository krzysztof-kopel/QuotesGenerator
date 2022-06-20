package quotes;

import java.io.IOException;

public class Main {
    static Graphics view;
    public static void main(String[] args) {
        view = new Graphics();
    }

    static void getQuote() {
        //TODO Wprowadziæ mo¿liwoœæ dowolnego ustawiania jêzyka
        String language = "pl";
        if (language.matches("..")) {
            try {
                Quote formattedQuote = new Quote(language);
                view.displayText(formattedQuote.content, "quote");
                view.displayText(formattedQuote.author, "author");
            } catch (IOException | InterruptedException e) {
                view.displayText(String.format("Wyst¹pi³ problem: %s", e.getCause()), "quote");
                view.displayText("", "author");
            }
        } else {
            view.displayText("Nieprawid³owy jêzyk.", "quote");
        }
    }
}