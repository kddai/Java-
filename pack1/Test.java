package pack1;
import pack2.CPU;
import pack3.Harddisk;
import pack4.PC;

public class Test {
	public static void main(String args[]){
		CPU cpu =new CPU();                     //创建一个CPU对象
		Harddisk HD=new Harddisk();             //创建一个HD对象 
		cpu.setSpeed(2200);                     //cpu的speed设置为2200
		HD.setAmount(200);                      //disk的amount设置为200
		cpu.settype(2500);
		HD.setbrand(3650);
		PC pc=new PC();                         //创建pc
		pc.setCpu(cpu);
		pc.setHarddisk(HD);
		pc.show();
	}
}