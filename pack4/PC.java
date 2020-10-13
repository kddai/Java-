package pack4;

import pack2.CPU;
import pack3.Harddisk;
public class PC {
	private CPU cpu;
	private Harddisk HD;
	public PC(){
		
	}
	public void setCpu(CPU cpu){
		this.cpu=cpu;                           //赋值给CPU
	}
	public void setHarddisk(Harddisk HD){
		this.HD=HD;                             //赋值给HD
	}
	public void show(){                                     //show()
		System.out.println("cpu速度为："+cpu.getSpeed());
		System.out.println("硬盘容量为："+HD.getAmount());  
		System.out.println("cpu类型为："+cpu.getType());  
		System.out.println("硬盘品牌为："+HD.getBrand());  
		
	}
}
