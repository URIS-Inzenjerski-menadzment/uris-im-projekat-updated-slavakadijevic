package numberSystem;

public class Hexadecimal extends NumberSystem {
	private String number;
	
	public Hexadecimal () {
	}
	
	public Hexadecimal(String number) {
		this.number = number;
	}
	
	@Override
	public int convertToDecimal() {
		int decimalNumber = Integer.parseInt(this.number, 16);
		return decimalNumber;
	}
	
	@Override
	public String convertToBinary() {
		int decimalNumber =  convertToDecimal();
		String binarynumber = Integer.toBinaryString(decimalNumber);
		return binarynumber;
	}

	@Override
	public String convertToHexadecimal() {
		return this.number;
	}

}