import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonProfileApp {
    private JFrame frame;
    private JPanel createProfilePanel, viewProfilePanel;
    private JTextField firstNameField, lastNameField, emailField, phoneField, driversLicenseField,
            socialSecurityNumberField, addressLine1Field, addressLine2Field, cityField, stateField, zipField, 
            telephoneNumberField, faxNumberField;
    private JLabel profileLabel;

    public PersonProfileApp() {
        // Setup JFrame
        frame = new JFrame("Person Profile Application");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new CardLayout());

        // Create Profile Panel
        createProfilePanel = new JPanel(new GridLayout(16, 2)); // 14 default + 6 custom fields
        addFieldsToCreateProfilePanel();

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        createProfilePanel.add(submitButton);

        // View Profile Panel
        viewProfilePanel = new JPanel();
        profileLabel = new JLabel();
        viewProfilePanel.add(profileLabel);

        // Add panels to JFrame
        frame.add(createProfilePanel, "CreateProfile");
        frame.add(viewProfilePanel, "ViewProfile");

        // Show the Create Profile Panel first
        frame.setVisible(true);
    }

    private void addFieldsToCreateProfilePanel() {
        // Adding fields for person profile
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();
        driversLicenseField = new JTextField();
        socialSecurityNumberField = new JTextField();
        addressLine1Field = new JTextField();
        addressLine2Field = new JTextField();
        cityField = new JTextField();
        stateField = new JTextField();
        zipField = new JTextField();
        telephoneNumberField = new JTextField();
        faxNumberField = new JTextField();

        // Add labels and fields to the panel
        createProfilePanel.add(new JLabel("First Name:"));
        createProfilePanel.add(firstNameField);
        createProfilePanel.add(new JLabel("Last Name:"));
        createProfilePanel.add(lastNameField);
        createProfilePanel.add(new JLabel("Email:"));
        createProfilePanel.add(emailField);
        createProfilePanel.add(new JLabel("Phone:"));
        createProfilePanel.add(phoneField);
        createProfilePanel.add(new JLabel("Drivers License:"));
        createProfilePanel.add(driversLicenseField);
        createProfilePanel.add(new JLabel("SSN:"));
        createProfilePanel.add(socialSecurityNumberField);
        createProfilePanel.add(new JLabel("Address Line 1:"));
        createProfilePanel.add(addressLine1Field);
        createProfilePanel.add(new JLabel("Address Line 2:"));
        createProfilePanel.add(addressLine2Field);
        createProfilePanel.add(new JLabel("City:"));
        createProfilePanel.add(cityField);
        createProfilePanel.add(new JLabel("State:"));
        createProfilePanel.add(stateField);
        createProfilePanel.add(new JLabel("ZIP:"));
        createProfilePanel.add(zipField);
        createProfilePanel.add(new JLabel("Telephone:"));
        createProfilePanel.add(telephoneNumberField);
        createProfilePanel.add(new JLabel("Fax:"));
        createProfilePanel.add(faxNumberField);
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the text from the fields and create a string representing the profile
            String profile = "<html>First Name: " + firstNameField.getText() + "<br/>"
                    + "Last Name: " + lastNameField.getText() + "<br/>"
                    + "Email: " + emailField.getText() + "<br/>"
                    + "Phone: " + phoneField.getText() + "<br/>"
                    + "Drivers License: " + driversLicenseField.getText() + "<br/>"
                    + "SSN: " + socialSecurityNumberField.getText() + "<br/>"
                    + "Address Line 1: " + addressLine1Field.getText() + "<br/>"
                    + "Address Line 2: " + addressLine2Field.getText() + "<br/>"
                    + "City: " + cityField.getText() + "<br/>"
                    + "State: " + stateField.getText() + "<br/>"
                    + "ZIP: " + zipField.getText() + "<br/>"
                    + "Telephone: " + telephoneNumberField.getText() + "<br/>"
                    + "Fax: " + faxNumberField.getText() + "<br/></html>";

            profileLabel.setText(profile);
            CardLayout cl = (CardLayout) frame.getContentPane().getLayout();
            cl.show(frame.getContentPane(), "ViewProfile");
        }
    }

    public static void main(String[] args) {
        new PersonProfileApp();
    }
}
