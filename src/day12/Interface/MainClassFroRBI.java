package day12.Interface;

public class MainClassFroRBI {
	public static void main(String[] args) {
		
		RBIbank.message();
		
		
		HDFC hdfc = new HDFC();
		hdfc.rateOfIntrest();
		
		BOM bom = new BOM();
		bom.rateOfIntrest();
	}
}
