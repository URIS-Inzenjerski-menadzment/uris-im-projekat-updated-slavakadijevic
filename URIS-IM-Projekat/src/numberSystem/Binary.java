package numberSystem;

public class Binary extends NumberSystem {
	private String number;
	
	public Binary() {
}
	
	public Binary (String number) {
		this.number  = number;
	}
	
	@Override
	public int convertToDecimal() {
		int decimalNumber = Integer.parseInt(this.number, 2);
		return decimalNumber;
	}
	
	@Override
	public String convertToHexadecimal() {
		int decimalNumber = convertToDecimal();
		String hexadecimalNumber = Integer.toHexString(decimalNumber);
		return hexadecimalNumber;
	}

	@Override
	public String convertToBinary() {
		return this.number;
	}
}
