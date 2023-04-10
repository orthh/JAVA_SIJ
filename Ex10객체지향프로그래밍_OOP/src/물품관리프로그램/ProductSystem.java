package 물품관리프로그램;

import java.util.ArrayList;

public class ProductSystem {

	private ArrayList<Product> ps = new ArrayList<Product>();

	public void addPs(Product product) {
		ps.add(product);
	}

	public String getSaleList() {
		String temp = "";
		temp += "제품명\t단가\t수량\n";
		for (int i = 0; i < ps.size(); i++) {
			temp += ps.get(i).getName() + "\t";
			temp += ps.get(i).getUnitPrice() + "\t";
			temp += ps.get(i).getAmount() + "개\n";
		}
		// 마지막 개행 제거
		temp = temp.substring(0,temp.length()-1);
		return temp;
	}

	public int getEstimatedPrice() {
		int sum = 0;
		for (int i = 0; i < ps.size(); i++) {
			sum += ps.get(i).getAmount() * ps.get(i).getUnitPrice();
		}
		return sum;
	}

}
