package 물품관리프로그램;

public class Product {
	// 필드
	private String name;
	private int unitPrice;
	private int amount;
	
	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getAmount() {
		return amount;
	}
	
	
	
	
}
