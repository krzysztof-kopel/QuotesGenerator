package quotes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Graphics {
    JFrame frame;
    JLabel quote;
    JButton button;
    Graphics() {
        frame = new JFrame();
        frame.setSize(500, 400);
        frame.setTitle("Generator cytatów");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        quote = new JLabel();
        quote.setText("Twój cytat pojawi siê tutaj.");
        quote.setHorizontalAlignment(JLabel.CENTER);
        quote.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        frame.add(quote, BorderLayout.CENTER);
        quote.setVisible(true);

        button = new JButton();
        button.setSize(150, 20);
        button.setText("Generuj cytat");
        button.addActionListener(a -> {
            String previousQuote = quote.getText();
            do {
                setQuote();
            } while (previousQuote.equals(quote.getText()));
        });

        frame.add(button, BorderLayout.SOUTH);
        button.setVisible(true);

        frame.setVisible(true);
    }

    private void setQuote() {
        Random random = new Random();
        this.quote.setText(Main.QUOTES[random.nextInt(3)]);
    }
}
