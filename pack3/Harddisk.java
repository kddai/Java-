package pack3;

public class Harddisk {
	private int amount;
	private int brand;
	public Harddisk(int amount,int brand){
		this.amount = amount;                      
		this.brand = brand;
	}	
	public Harddisk(){
		
	}	
	public int getAmount(){
		return amount;	                          //����amountֵ
	}
	public int getBrand() {
		return brand;
	}
	public void setbrand(int brand) {
		this.brand = brand;
	}
	public void setAmount(int m){
		this.amount = m;                             //m��ֵ����amount
	}
}