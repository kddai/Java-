package pack4;

import pack2.CPU;
import pack3.Harddisk;
public class PC {
	private CPU cpu;
	private Harddisk HD;
	public PC(){
		
	}
	public void setCpu(CPU cpu){
		this.cpu=cpu;                           //��ֵ��CPU
	}
	public void setHarddisk(Harddisk HD){
		this.HD=HD;                             //��ֵ��HD
	}
	public void show(){                                     //show()
		System.out.println("cpu�ٶ�Ϊ��"+cpu.getSpeed());
		System.out.println("Ӳ������Ϊ��"+HD.getAmount());  
		System.out.println("cpu����Ϊ��"+cpu.getType());  
		System.out.println("Ӳ��Ʒ��Ϊ��"+HD.getBrand());  
		
	}
}
