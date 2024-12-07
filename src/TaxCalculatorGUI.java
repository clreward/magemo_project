import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TaxCalculatorGUI {

    // Method to calculate tax using a flat 18% rate
    public static double calculateTax(double income) {
        return income * 0.18; // 18% tax on the entire income
    }

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Tanzania Tax Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        frame.getContentPane().setBackground(new Color(240, 248, 255));  // Light blue background

        // Set the font for labels and fields
        Font font = new Font("Arial", Font.PLAIN, 16);

        // Labels
        JLabel incomeLabel = new JLabel("Enter your income (TZS): ");
        incomeLabel.setFont(font);
        incomeLabel.setForeground(new Color(0, 51, 102));  // Dark blue text

        JLabel taxLabel = new JLabel("Calculated Tax: ");
        taxLabel.setFont(font);
        taxLabel.setForeground(new Color(0, 51, 102));

        JLabel remainingLabel = new JLabel("Remaining Amount: ");
        remainingLabel.setFont(font);
        remainingLabel.setForeground(new Color(0, 51, 102));

        // Text fields
        JTextField incomeField = new JTextField(20);
        incomeField.setFont(new Font("Arial", Font.PLAIN, 14));
        incomeField.setBackground(new Color(255, 255, 255));  // White background
        incomeField.setForeground(new Color(0, 51, 102));  // Dark text color

        JTextField taxField = new JTextField(20);
        taxField.setFont(new Font("Arial", Font.PLAIN, 14));
        taxField.setEditable(false);  // Make it read-only
        taxField.setBackground(new Color(240, 240, 240));  // Light grey background
        taxField.setForeground(new Color(255, 69, 0));  // Red for tax

        JTextField remainingField = new JTextField(20);
        remainingField.setFont(new Font("Arial", Font.PLAIN, 14));
        remainingField.setEditable(false);  // Make it read-only
        remainingField.setBackground(new Color(240, 240, 240));  // Light grey background
        remainingField.setForeground(new Color(34, 139, 34));  // Green for remaining

        // Button to calculate tax
        JButton calculateButton = new JButton("Calculate Tax");
        calculateButton.setFont(new Font("Arial", Font.BOLD, 16));
        calculateButton.setBackground(new Color(0, 51, 204));  // Blue background
        calculateButton.setForeground(Color.WHITE);  // White text
        calculateButton.setPreferredSize(new Dimension(200, 40));  // Increase button size
        calculateButton.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 102), 2));

        // Action listener for the calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the income entered by the user
                    double income = Double.parseDouble(incomeField.getText());

                    // Calculate tax using 18% rate
                    double tax = calculateTax(income);
                    double remaining = income - tax;

                    // Display the tax and remaining income
                    taxField.setText(String.format("%.2f", tax));
                    remainingField.setText(String.format("%.2f", remaining));
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                }
            }
        });

        // Key listener to allow only numeric input
        incomeField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                // Allow only numbers, backspace, delete, and period (for decimal input)
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == '.')) {
                    e.consume();  // Ignore the input
                }
            }
        });

        // Add components to the frame
        frame.add(incomeLabel);
        frame.add(incomeField);
        frame.add(calculateButton);
        frame.add(taxLabel);
        frame.add(taxField);
        frame.add(remainingLabel);
        frame.add(remainingField);

        // Make the frame visible
        frame.setVisible(true);
    }
}
