package pack1;
import pack2.CPU;
import pack3.Harddisk;
import pack4.PC;

public class Test {
	public static void main(String args[]){
		CPU cpu =new CPU();                     //����һ��CPU����
		Harddisk HD=new Harddisk();             //����һ��HD���� 
		cpu.setSpeed(2200);                     //cpu��speed����Ϊ2200
		HD.setAmount(200);                      //disk��amount����Ϊ200
		cpu.settype(2500);
		HD.setbrand(3650);
		PC pc=new PC();                         //����pc
		pc.setCpu(cpu);
		pc.setHarddisk(HD);
		pc.show();
	}
}