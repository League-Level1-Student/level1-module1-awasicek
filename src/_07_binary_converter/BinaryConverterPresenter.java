package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryConverterPresenter implements ActionListener {
	private final BinaryConverterView view;
	private final BinaryConverter converter;
	
	BinaryConverterPresenter(BinaryConverterView view, BinaryConverter converter) {
		this.view = view;
		view.addListener(this);
		this.converter = converter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String convertedValue = converter.convert(view.getInputText());
		view.setDisplayText(convertedValue);
	}
}
