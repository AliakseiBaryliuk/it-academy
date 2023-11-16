package by.itacademy.brest.class17.cw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

public class SwingTest {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Button Example");

        // Create a JButton
        JButton button = new JButton("Click me");

        // Event listener using a Runnable
        Consumer<String> myRunnable = value -> {
            // Code to be executed when the button is clicked
            System.out.println("Button clicked! - " + value);
        };

        // Adding the ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calling the Runnable when the button is clicked
                myRunnable.accept("Hello");
            }
        });

        // Add the button to the JFrame
        frame.getContentPane().add(button);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
