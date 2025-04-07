package project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelBookingApp {
    public static void main(String[] args) {
        class GradientPanel extends JPanel {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, (new Color(230, 240, 250)), 0, getHeight(), new Color(190, 210, 220)));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        }

        GradientPanel panel = new GradientPanel();
        panel.setLayout(new BorderLayout(10, 20));

        JFrame frame = new JFrame("Travel Booking App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(600, 400); 
        frame.add(panel);  
        frame.setLocationRelativeTo(null); 

        JLabel Label = new JLabel("Welcome to ExploreEase!", JLabel.CENTER);
        Font font = new Font("Arial", Font.BOLD, 20);
        Label.setFont(font);
        panel.add(Label, BorderLayout.NORTH);

        ImageIcon icon = new ImageIcon(TravelBookingApp.class.getResource("/DALL·E 2025-03-22 23.13.55 - A professional and modern travel booking system interface displayed on a laptop and smartphone. The interface includes options for booking flights, ho.png"));
        JLabel imagel = new JLabel(icon);
        panel.add(imagel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(0, 0, 0, 0)); 

        JButton start = new JButton("Start Booking");
        start.setBackground(new Color(44, 62, 80));  
        start.setForeground(Color.WHITE);  
        start.setPreferredSize(new Dimension(150, 40));  

        JButton exit = new JButton("Exit");
        exit.setBackground(new Color(0, 139, 139));  
        exit.setForeground(Color.WHITE);   
        exit.setPreferredSize(new Dimension(150, 40));   

        buttonPanel.add(start); 
        buttonPanel.add(exit);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();  
                new BookingForm(); 
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); 
            }
        });

        frame.setVisible(true);
    }
}
