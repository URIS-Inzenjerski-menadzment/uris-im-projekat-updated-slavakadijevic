package numberSystem;

public class Decimal extends NumberSystem {
	private int number;
	
	public Decimal() {
		
	}
	
	public Decimal(int number) {
		this.number = number;
	}
	
	@Override
	public String convertToBinary() {
		String binaryNumber = Integer.toBinaryString(this.number);
		return binaryNumber;
	}
	
	@Override
	public String convertToHexadecimal() {
		String hexadecimalNumber = Integer.toHexString(this.number);
		return hexadecimalNumber;
	}

	@Override
	public int convertToDecimal() {
		return this.number;
	}}
