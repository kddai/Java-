package pack4;

import pack2.CPU;
import pack3.Harddisk;
public class PC {
	private CPU cpu;
	private Harddisk HD;
	public PC(){
		
	}
	public PC(CPU cpu,Harddisk HD) {
		this.cpu = cpu;
		this.HD = HD;
	}
	public void setCpu(CPU c){
		this.cpu=c;                           //��ֵ��CPU
	}
	public void setHarddisk(Harddisk h){
		this.HD=h;                             //��ֵ��HD
	}
	public void show(){                                     //show()
		System.out.println("cpu�ٶ�Ϊ��"+cpu.getSpeed());
		System.out.println("Ӳ������Ϊ��"+HD.getAmount());  
		System.out.println("cpu����Ϊ��"+cpu.getType());  
		System.out.println("Ӳ��Ʒ��Ϊ��"+HD.getBrand());  
		
	}
}
