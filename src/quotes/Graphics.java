package quotes;

import javax.swing.*;
import java.awt.*;

public class Graphics {
    JFrame frame;
    JPanel centerPanel;
    JLabel quote, author;
    JButton button;
    Graphics() {
        frame = new JFrame();
        frame.setSize(500, 400);
        frame.setTitle("Generator cytatów");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(10, 10));
        frame.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setVisible(true);

        quote = new JLabel();
        quote.setText("Twój cytat pojawi siê tutaj.");
        quote.setHorizontalAlignment(JLabel.CENTER);
        quote.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        centerPanel.add(quote, BorderLayout.CENTER);
        quote.setVisible(true);

        author = new JLabel();
        author.setText("");
        author.setHorizontalAlignment(JLabel.RIGHT);
        author.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 15));
        centerPanel.add(author, BorderLayout.SOUTH);
        author.setVisible(true);

        button = new JButton();
        button.setSize(150, 20);
        button.setText("Generuj cytat");
        button.addActionListener(a -> {
            String previousQuote = quote.getText();
            do {
                Main.getQuote();
            } while (previousQuote.equals(quote.getText()));
        });

        frame.add(button, BorderLayout.SOUTH);
        button.setVisible(true);

        frame.setVisible(true);
    }

    void displayText(String text, String fieldName) {
        switch (fieldName) {
            case "quote" -> this.quote.setText("<html>" + text + "</html>");
            case "author" -> this.author.setText("<html>" + text + "</html>");
            default -> this.quote.setText("B³êdna nazwa pola wyœwietlania");
        }
    }
}
