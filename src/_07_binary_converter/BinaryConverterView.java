package _07_binary_converter;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverterView {
	private static final int FIELD_WIDTH = 20;
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton convertButton = new JButton("Convert");
	private JTextField textField = new JTextField(FIELD_WIDTH);
	private JLabel outputLabel = new JLabel("-");
	
	public BinaryConverterView() {
		frame.setTitle("Binary Converter v1.0");
		frame.setLocationRelativeTo(null); // center on screen
		
		frame.add(panel);
		panel.add(textField);
		panel.add(convertButton);
		panel.add(outputLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public String getInputText() {
		return textField.getText();
	}
	
	public void setDisplayText(String text) {
		outputLabel.setText(text);
	}
	
	public void addListener(ActionListener listener) {
		convertButton.addActionListener(listener);
	}
}
