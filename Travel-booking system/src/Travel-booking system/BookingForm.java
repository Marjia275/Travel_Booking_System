package project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingForm {
	
	 public BookingForm() {
        
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
        panel.setLayout(new GridLayout(36, 2, 10, -2));
        
        JFrame frame = new JFrame("Travel Booking Form");
        frame.setSize(600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        frame.add(panel);
        
        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);
       
        
        
        JLabel contactType = new JLabel("Contact Type:");
        String[] contactTypes = {"Select a type","Mobile", "Email", "WhatsApp"};
        JComboBox contactTypeBox = new JComboBox(contactTypes);
        panel.add(contactType);
        panel.add(contactTypeBox);

        JLabel Details = new JLabel("Contact Details:");
        JTextField contactField = new JTextField();
        panel.add(Details);
        panel.add(contactField);

       
        
        JLabel travelLabel = new JLabel("Travel Type:");
        panel.add(travelLabel);
        
        JRadioButton flightRadio = new JRadioButton("Flight");
        JRadioButton trainRadio = new JRadioButton("Train");
        JRadioButton busRadio = new JRadioButton("Bus");
        panel.add(flightRadio);
        panel.add(trainRadio);
        panel.add(busRadio);

        ButtonGroup group = new ButtonGroup();
        group.add(flightRadio);
        group.add(trainRadio);
        group.add(busRadio);
        panel.add(flightRadio);
        panel.add(trainRadio);
        panel.add(busRadio);

        
        
        JLabel ticketBookingDateLabel = new JLabel("Ticket Booking Date and Time:");
        panel.add(ticketBookingDateLabel);
        JTextField BookingDate = new JTextField();
        BookingDate.setEnabled(false);
        panel.add(BookingDate);

        JLabel returnTicketDateLabel = new JLabel("Return Ticket Date and Time:");
        panel.add(returnTicketDateLabel);
        JTextField returnFlightDate = new JTextField();
        returnFlightDate.setEnabled(false);
        panel.add(returnFlightDate);

          
        flightRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isFlightSelected = flightRadio.isSelected();
                BookingDate.setEnabled(isFlightSelected);
                returnFlightDate.setEnabled(isFlightSelected);
            }
        });

        trainRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 boolean isFlightSelected = trainRadio.isSelected();
               BookingDate.setEnabled(isFlightSelected);
                returnFlightDate.setEnabled(isFlightSelected);
            }
        });

        busRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	  boolean isFlightSelected = busRadio.isSelected();
            	BookingDate.setEnabled(isFlightSelected);
                returnFlightDate.setEnabled(isFlightSelected);
            }
        });
        
        
            
        JLabel destinationLabel = new JLabel("Destination:");
        String[] destinations = {"Select a destination", "Paris", "London", "Tokyo", "New York", "Sydney"};
        JComboBox destination = new JComboBox(destinations);
        panel.add(destinationLabel);
        panel.add(destination);

        
        JLabel AdditionalServices = new JLabel("Additional Services:");
        panel.add(AdditionalServices);
        JPanel services = new JPanel();
        JCheckBox hotelCheck = new JCheckBox("Hotel");
        JCheckBox guidedToursCheck = new JCheckBox("Guide for Tour");
        JCheckBox petAccommodationCheck = new JCheckBox("Pet Accommodation");
        JCheckBox mealCheck = new JCheckBox("Meal");

        services.add(hotelCheck);
        services.add(guidedToursCheck);
        services.add(petAccommodationCheck);
        services.add(mealCheck);
        panel.add(services);

        
        
        JLabel checkInLabel = new JLabel("Check-in Date:");
        panel.add(checkInLabel);
        JTextField checkInDate = new JTextField();
        checkInDate.setEnabled(false);
        panel.add(checkInDate);

        JLabel checkOutLabel = new JLabel("Check-out Date:");
        panel.add(checkOutLabel);
        JTextField checkOutDate = new JTextField();
        checkOutDate.setEnabled(false);
        panel.add(checkOutDate);

        JLabel numberOfPeopleLabel = new JLabel("Number of People:");
        panel.add(numberOfPeopleLabel);
        JTextField numberOfPeople = new JTextField();
        numberOfPeople.setEnabled(false);
        panel.add(numberOfPeople);

        JLabel numberOfRoomsLabel = new JLabel("Number of Rooms and Room type(single,double):");
        panel.add(numberOfRoomsLabel);
        JTextField numberOfRooms = new JTextField();
        numberOfRooms.setEnabled(false);
        panel.add(numberOfRooms);

       // JLabel roomTypeLabel = new JLabel("Room Type:");
        //panel.add(roomTypeLabel);
        //String[] roomTypes = {"Single", "Double"};
        //JComboBox TypeBox = new JComboBox(roomTypes);
        //TypeBox.setEnabled(false);
        //panel.add(TypeBox);

        
        hotelCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isHotelSelected = hotelCheck.isSelected();
                checkInDate.setEnabled(isHotelSelected);
                checkOutDate.setEnabled(isHotelSelected);
                numberOfRooms.setEnabled(isHotelSelected);
                numberOfPeople.setEnabled(isHotelSelected);
              //  TypeBox.setEnabled(isHotelSelected);
            }
        });
        
        

        JLabel guideDetailsLabel = new JLabel("Guide Details (if Guide For Tour selected): Budget, Days");
        panel.add(guideDetailsLabel);
        JTextField tourDetails = new JTextField();
        tourDetails.setEnabled(false);
        panel.add(tourDetails);
        
        guidedToursCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isGuidedTourSelected = guidedToursCheck.isSelected();
                tourDetails.setEnabled(isGuidedTourSelected);
            }
        });
        
        

        JLabel petDetailsLabel = new JLabel("Pet Details (if Pet Accommodation selected):");
        panel.add(petDetailsLabel);
        JTextField petDetails = new JTextField();
        petDetails.setEnabled(false);
        panel.add(petDetails);

        petAccommodationCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPetAccommodationSelected = petAccommodationCheck.isSelected();
                petDetails.setEnabled(isPetAccommodationSelected);
            }
        });

        
        
        JLabel mealLabel = new JLabel("Meal Preference (if Meal selected):");
        panel.add(mealLabel);
        
        JRadioButton vegRadio = new JRadioButton("Vegetarian");
        JRadioButton nonVegRadio = new JRadioButton("Non-Vegetarian");
        JRadioButton veganRadio = new JRadioButton("Vegan");
        JRadioButton Anymeal = new JRadioButton("Anymeal");
        vegRadio.setEnabled(false);
        nonVegRadio.setEnabled(false);
        veganRadio.setEnabled(false);
        Anymeal.setEnabled(false);
        panel.add(vegRadio);
        panel.add(nonVegRadio);
        panel.add(veganRadio);
        panel.add(Anymeal); 
            
        
        
        mealCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isMealSelected = mealCheck.isSelected();
                vegRadio.setEnabled(isMealSelected);
                nonVegRadio.setEnabled(isMealSelected);
                veganRadio.setEnabled(isMealSelected);
                Anymeal.setEnabled(isMealSelected);
            }
        });
        
        

        JButton bookButton = new JButton("Confirm Booking");
        bookButton.setBackground(new Color(70, 130, 180));
        bookButton.setForeground(Color.WHITE);
        
        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(new Color(85, 85, 85));
        exitButton.setForeground(Color.WHITE);

        JButton resetButton = new JButton("Reset");
        resetButton.setBackground(new Color(50, 159, 200));  
        resetButton.setForeground(Color.WHITE);
            
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(0, 0, 0, 0));
        buttonPanel.add(bookButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);
        panel.add(buttonPanel);  
        

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                contactField.setText("");
                contactTypeBox.setSelectedIndex(0);
                group.clearSelection();
                BookingDate.setText("");
                returnFlightDate.setText("");
                destination.setSelectedIndex(0);
                hotelCheck.setSelected(false);
                guidedToursCheck.setSelected(false);
                petAccommodationCheck.setSelected(false);
                mealCheck.setSelected(false);
                checkInDate.setText("");
                checkOutDate.setText("");
                numberOfPeople.setText("");
                numberOfRooms.setText("");
              //  TypeBox.setSelectedIndex(0);
                tourDetails.setText("");
                petDetails.setText("");
                vegRadio.setEnabled(false);
                nonVegRadio.setEnabled(false);
                veganRadio.setEnabled(false);
                Anymeal.setEnabled(false);
            }
        });
        
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String warningMessage = "Please correct the following issues:\n";
                boolean hasErrors = false;

                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    warningMessage += ("- Name is required.\n");
                    hasErrors = true;
                }

                String contactType = (String) contactTypeBox.getSelectedItem();
                String contactDetails = contactField.getText().trim();
                if (contactType.equals("Select a type") || contactDetails.isEmpty()) {
                    warningMessage += "- Contact type and details are required.\n";
                    hasErrors = true;
                }

               
                String travelType = null;
                if (flightRadio.isSelected()) {
                    travelType = "Flight";
                } else if (trainRadio.isSelected()) {
                    travelType = "Train";
                } else if (busRadio.isSelected()) {
                    travelType = "Bus";
                }
                
                if (travelType == null) {
                    warningMessage += ("- Travel type must be selected.\n");
                    hasErrors = true;
                }

             
                String bookingDate = BookingDate.getText().trim();
                String returnDate = returnFlightDate.getText().trim();
                if (bookingDate.isEmpty() || returnDate.isEmpty()) {
                    warningMessage += ("- Booking and return dates are required.\n");
                    hasErrors = true;
                }

             
                String selectedDestination = (String) destination.getSelectedItem();
                if (selectedDestination.equals("Select a destination")) {
                    warningMessage += "- Destination must be selected.\n";
                    hasErrors = true;
                }

               
                StringBuilder additionalDetails = new StringBuilder();


                String checkIn = "", checkOut = "", numPeople = "", numRooms = "", roomType = "";
                if (hotelCheck.isSelected()) {
                    checkIn = checkInDate.getText().trim();
                    checkOut = checkOutDate.getText().trim();
                    numPeople = numberOfPeople.getText().trim();
                    numRooms = numberOfRooms.getText().trim();
               //     roomType = (String) TypeBox.getSelectedItem();

                    if (checkIn.isEmpty()) {
                        warningMessage += "- Check-in date must be provided if hotel is checked.\n";
                        hasErrors = true;
                    } else {
                        appendDetail(additionalDetails, "Check-in Date", checkIn);
                    }

                    if (checkOut.isEmpty()) {
                        warningMessage += "- Check-out date must be provided if hotel is checked.\n";
                        hasErrors = true;
                    } else {
                        appendDetail(additionalDetails, "Check-out Date", checkOut);
                    }

                    if (numPeople.isEmpty()) {
                        warningMessage += "- Number of people must be provided if hotel is checked.\n";
                        hasErrors = true;
                    } else {
                        appendDetail(additionalDetails, "Number of People", numPeople);
                    }

                    if (numRooms.isEmpty()) {
                        warningMessage += "- Number of rooms must be provided if hotel is checked.\n";
                        hasErrors = true;
                    } else {
                        appendDetail(additionalDetails, "Number of Rooms", numRooms);
                    }

                  //  if (roomType == null || roomType.equals("Select Room Type")) {
                  //      warningMessage += "- Room type must be selected if hotel is checked.\n";
                    //    hasErrors = true;
                   // } else {
                     //   appendDetail(additionalDetails, "Room Type", roomType);
                    //}

                    additionalDetails.append("\n");
                }

               
                if (guidedToursCheck.isSelected()) {
                    String tourDetail = tourDetails.getText().trim();
                    if (tourDetail.isEmpty()) {
                        warningMessage += "- Tour details must be provided if guided tours are selected.\n";
                        hasErrors = true;
                    } else {
                        additionalDetails.append("Guided Tours:\n");
                        appendDetail(additionalDetails, "Tour Details", tourDetail);
                        additionalDetails.append("\n");
                    }
                }

             
                if (petAccommodationCheck.isSelected()) {
                    String petDetail = petDetails.getText().trim();
                    if (petDetail.isEmpty()) {
                        warningMessage += "- Pet details must be provided if pet accommodation is selected.\n";
                        hasErrors = true;
                    } else {
                        additionalDetails.append("Pet Accommodation:\n");
                        appendDetail(additionalDetails, "Pet Details", petDetail);
                        additionalDetails.append("\n");
                    }
                }

                
            
              
                String mealPreference = "";

                if (mealCheck.isSelected()) {
                    StringBuilder mealBuilder = new StringBuilder();

                    if (vegRadio.isSelected()) mealBuilder.append("Vegetarian, ");
                    if (nonVegRadio.isSelected()) mealBuilder.append("Non-Vegetarian, ");
                    if (veganRadio.isSelected()) mealBuilder.append("Vegan, ");
                    if (Anymeal.isSelected()) mealBuilder.append("Any, ");

                    if (mealBuilder.length() == 0) {
                        warningMessage += "- At least one meal preference must be selected.\n";
                        hasErrors = true;
                    } else {
                        mealPreference = mealBuilder.substring(0, mealBuilder.length() - 2);
                    }
                }


                
                if (hasErrors) {
                    JOptionPane.showMessageDialog(null, warningMessage, "Errors", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                
                frame.dispose();
                
                
                BookingSuccess bookingSuccess = new BookingSuccess();
                bookingSuccess.displayBookingDetails(
                    name,
                    contactType,
                    contactDetails,
                    travelType,
                    selectedDestination,
                    bookingDate,
                    returnDate, 
                    checkIn, 
                    checkOut,
                    numPeople, 
                    numRooms, 
                    roomType,
                    tourDetails.getText().trim(), 
                    petDetails.getText().trim(), 
                    mealPreference,
                    hotelCheck.isSelected(), 
                    guidedToursCheck.isSelected(),
                    petAccommodationCheck.isSelected(), 
                    mealCheck.isSelected() 
                );
            }
        

        private void appendDetail(StringBuilder details, String label, String value) {
            details.append(label).append(": ").append(value).append("\n");
        }
});

        
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); 
            }
        });
        
        
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}

