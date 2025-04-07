package project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingSuccess extends JFrame {

    public void displayBookingDetails(
            String name, String contactType, String contactDetails,
            String travelType, String destination, String bookingDate,
            String returnDate, String checkIn, String checkOut,
            String numPeople, String numRooms, String roomType,
            String tourDetail, String petDetail,String mealPreference,
            boolean isHotelSelected, boolean isGuidedToursSelected,
            boolean isPetAccommodationSelected, boolean isMealSelected
    ) {

        
        JFrame detailsFrame = new JFrame("Booking Confirmation");
        detailsFrame.setSize(720, 600);
        detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detailsFrame.setLocationRelativeTo(null);

     
        ImageIcon icon = new ImageIcon("image/ChatGPT Image Apr 4, 2025, 04_34_41 PM.png");
        JLabel imagel = new JLabel(icon);
        imagel.setBounds(0, 0, 700, 600); 

        
      //  JPanel panel = new JPanel();
        //panel.setLayout(null);
        //panel.setPreferredSize(new Dimension(0, 0));
        //panel.setOpaque(false); 

        
       //imagel.add(panel);

     
        JLabel titleLabel = new JLabel("Your Booking is Confirmed!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(230, 20, 350, 30);
        imagel.add(titleLabel);

    
        JLabel nameLabel = new JLabel("Name: " + name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nameLabel.setBounds(50, 70, 550, 30);
        imagel.add(nameLabel);

        JLabel contactTypeLabel = new JLabel("Contact Type: " + contactType);
        contactTypeLabel.setFont(new Font("Arial", Font.BOLD, 15));
        contactTypeLabel.setBounds(50, 110, 550, 30);
        imagel.add(contactTypeLabel);

        JLabel contactDetailsLabel = new JLabel("Contact Details: " + contactDetails);
        contactDetailsLabel.setFont(new Font("Arial", Font.BOLD, 15));
        contactDetailsLabel.setBounds(280, 110, 550, 30);
        imagel.add(contactDetailsLabel);

        JLabel travelTypeLabel = new JLabel("Travel Type: " + travelType);
        travelTypeLabel.setFont(new Font("Arial", Font.BOLD, 15));
        travelTypeLabel.setBounds(50, 150, 550, 30);
        imagel.add(travelTypeLabel);

        JLabel destinationLabel = new JLabel("Destination: " + destination);
        destinationLabel.setFont(new Font("Arial", Font.BOLD, 15));
        destinationLabel.setBounds(280, 150, 550, 30);
        imagel.add(destinationLabel);

        JLabel bookingDateLabel = new JLabel("Booking Date: " + bookingDate);
        bookingDateLabel.setFont(new Font("Arial", Font.BOLD, 15));
        bookingDateLabel.setBounds(50, 190, 550, 30);
        imagel.add(bookingDateLabel);

        JLabel returnDateLabel = new JLabel("Return Date: " + returnDate);
        returnDateLabel.setFont(new Font("Arial", Font.BOLD, 15));
        returnDateLabel.setBounds(280, 190, 550, 30);
        imagel.add(returnDateLabel);

        int yPosition = 230;
     
        if (isHotelSelected) {
            JLabel checkInLabel = new JLabel("Hotel Check-in: " + checkIn);
            checkInLabel.setFont(new Font("Arial", Font.BOLD, 15));
            checkInLabel.setBounds(50, yPosition, 250, 30);
            imagel.add(checkInLabel);
            

            JLabel checkOutLabel = new JLabel("Hotel Check-out: " + checkOut);
            checkOutLabel.setFont(new Font("Arial", Font.BOLD, 15));
            checkOutLabel.setBounds(280, yPosition, 250, 30);
            imagel.add(checkOutLabel);
            yPosition += 40;
            
            
            JLabel numPeopleLabel = new JLabel("Number of People: " + numPeople);
            numPeopleLabel.setFont(new Font("Arial", Font.BOLD, 15));
            numPeopleLabel.setBounds(50, yPosition, 550, 30);
            imagel.add(numPeopleLabel);
            
            
            JLabel numRoomsLabel = new JLabel("Number of Rooms: " + numRooms);
            numRoomsLabel.setFont(new Font("Arial", Font.BOLD, 15));
            numRoomsLabel.setBounds(280, yPosition, 550, 30);
            imagel.add(numRoomsLabel);
            yPosition += 40;
            
         //   JLabel roomTypeLabel = new JLabel("Room Type: " + roomType);
           // roomTypeLabel.setFont(new Font("Arial", Font.BOLD, 15));
            //roomTypeLabel.setBounds(50, yPosition, 550, 30);
            //imagel.add(roomTypeLabel);
            //yPosition += 40;
        }

        
        if (isGuidedToursSelected) {
            JLabel tourDetailsLabel = new JLabel("Guided Tour Details: " + tourDetail);
            tourDetailsLabel.setFont(new Font("Arial", Font.BOLD, 15));
            tourDetailsLabel.setBounds(50,yPosition , 550, 30);
            imagel.add(tourDetailsLabel);
            yPosition += 40;
        }

       
        if (isPetAccommodationSelected) {
            JLabel petDetailsLabel = new JLabel("Pet Accommodation Details: " + petDetail);
            petDetailsLabel.setFont(new Font("Arial", Font.BOLD, 15));
            petDetailsLabel.setBounds(50, yPosition, 550, 30);
            imagel.add(petDetailsLabel);
            yPosition += 40;
        }

       
        if (isMealSelected) {
            JLabel mealDetailsLabel = new JLabel("Meal Preferences: " + mealPreference);
            mealDetailsLabel.setFont(new Font("Arial", Font.BOLD, 15));
            mealDetailsLabel.setBounds(50,yPosition, 550, 30);
            imagel.add(mealDetailsLabel);
            yPosition += 40;
        }
    

    
        JButton okButton = new JButton("OK");
        okButton.setBounds(300,510 , 100, 30);
        okButton.setFont(new Font("Arial", Font.BOLD, 14));
        okButton.setForeground(Color.WHITE);
        okButton.setBackground(new Color(20, 20, 20));
        imagel.add(okButton);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detailsFrame.dispose();
            }
        });


      //JScrollPane scrollPane = new JScrollPane(imagel);
     // detailsFrame.add(scrollPane);

        detailsFrame.add(imagel);
        detailsFrame.setVisible(true);
    }
}
