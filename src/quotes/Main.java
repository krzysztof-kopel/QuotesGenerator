package quotes;

import java.io.IOException;

public class Main {
    static Graphics view;
    static Quote currentQuote;
    public static void main(String[] args) {
        view = new Graphics();
    }

    static void getQuote() {
        //TODO Wprowadziæ mo¿liwoœæ dowolnego ustawiania jêzyka
        Language chosen_language = Language.POLISH;
        if (chosen_language.shortcut.matches("\\D\\D")) {
            try {
                currentQuote = new Quote(chosen_language);
                view.displayText(currentQuote.content, "quote");
                if (view.seeAuthor.isSelected()) {
                    view.displayText(currentQuote.author, "author");
                }
            } catch (IOException | InterruptedException e) {
                view.displayText(String.format("Wyst¹pi³ problem: %s", e.getCause()), "quote");
                view.displayText("", "author");
            }
        } else {
            view.displayText("Nieprawid³owy jêzyk.", "quote");
        }
    }
}