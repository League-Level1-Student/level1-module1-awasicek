package _07_binary_converter;

public class BinaryConverterDriver {

	public static void main(String[] args) {
		final BinaryConverterView view = new BinaryConverterView();
		final BinaryConverter converter = new BinaryConverter();
		new BinaryConverterPresenter(view, converter);
	}

}
