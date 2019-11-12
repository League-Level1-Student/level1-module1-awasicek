package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	private static final int FIELD_WIDTH = 20;
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton convertButton = new JButton("Convert");
	private JTextField textField = new JTextField(FIELD_WIDTH);
	private JLabel outputLabel = new JLabel("-");
	
	public void initialize() {
		frame.setTitle("Binary Converter v1.0");
		frame.setLocationRelativeTo(null); // center on screen
		
		frame.add(panel);
		panel.add(textField);
		panel.add(convertButton);
		panel.add(outputLabel);
		
		convertButton.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	private String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == convertButton) {
			String convertedValue = convert(textField.getText());
			outputLabel.setText(convertedValue);
		}
	}
}
