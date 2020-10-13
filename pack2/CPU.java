package pack2;

public class CPU {
	private int speed;
	private int type;
	public CPU(int speed,int type){
		this.speed = speed;                       
		this.type = type;
	}	
	public CPU(){

	}
	public int getSpeed(){
		return speed;                       //返回speed值
	}
	public int getType() {
		return type;
	}
	
	public void settype(int type) {
		this.type =type;
	}
	public void setSpeed(int m){
		this.speed = m;                  //m的值赋值给speed  
	} 
}
