# Java-
Java课程作业项目仓库

# 阅读程序

## 实验目的  
### 基本任务
1.用类描述计算机中CPU，的速度和硬盘的容量，要求Java应用程序有4个类，名字分别为PC、CPU、HardDisk和Test。其中Test是主类。  
  CPU类：要求getSpeed()返回speed值，要求setSpeed(int m)方法将参数m的值赋给speed;  
  HardDisk类：要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋给amount；  
  PC类：要求setCPU(CPU c)将参数c的值赋给cpuu,要求setHarddisk(HardDisk h)方法将参数h的值赋给HD，要求shou()方法能显示cpu的速度和硬盘的容量；  
#### 主类Test要求：  
  （1）main方法中创建一个CPUU对象cpu,cpu将自己的speed设置为2200。  
  （2）main方法中创建一个HardDisk对象disk,disk讲自己的amount设置为200。  
  （3) main方法中创建一个PC对象pc。  
  （4）pc调用setCPU(CPU c)方法，调用时实参是cpu。  
  （5）pc调用setHardDisk（HardDisk)方法，调用时实参是disk。  
  （6）px调用show()方法。  

## 附加任务    
  （1） 类中定义不少于两个构造方法；  
  （2） 每个类定义不少于2个属性且属性类型多养护U啊；  
  （3） 尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性"的形式访问属性值；且定义的方法应该符合常理的逻辑判断；  
  （4） 尝试把本次实验的多个类放在不同的包中，体会修饰private的用法。  
  
## 实验过程  
  1.创建Java项目命名kevin，创建包命名pack1-pack4,创建类名为Test，CPU，HardDisk,PC;  
  2.以Test为主类对其它三类根据书中要求依次编写调用。  
  
## 核心方法  
  方法1.构造方法：public Harddisk(){  
                }    
  方法2.调用外包数据：import pack2.CPU;  
  方法3.创建对象/设置数值：CPU cpu =new CPU(); / cpu.setSpeed(2200);  
  方法4.private私密设置：private int speed;  
	                      private int type;  
  方法5.this关键字：this.speed = speed;                         
		               this.type = type;  
  方法6.retuurn返回值：public int getSpeed(){  
		                      return speed;                      
	                           }   
  方法7.输出结果public void show(){                                         
		              System.out.println("cpu速度为："+cpu.getSpeed());    
		               }  
## 实验结果  
最终结果：  
```
cpu速度为：2200  
硬盘容量为：200  
cpu类型为：酷睿  
硬盘品牌为：3650  
```
创建对象对象设置参数  
```
public class Test {
	public static void main(String args[]){  
		CPU cpu =new CPU();                    
		Harddisk HD=new Harddisk();               
		cpu.setSpeed(2200);                       
		HD.setAmount(200);                        
		cpu.settype("酷睿");  
		HD.setbrand(3650);  
		PC pc=new PC();                           
		pc.setCpu(cpu);  
		pc.setHarddisk(HD);  
		pc.show();  
	}  
}  
```
getAmount()返回amount值
```
public int getAmount(){
		return amount;	                          
	}
```
字符型类型返回值
```
public String getType() {
		return type;
	}
```
参数h值赋给HD
```
public void setHarddisk(Harddisk h){
		this.HD=h;                             
	}
```
输出信息  
```
public void show(){                                    
		System.out.println("cpu速度为："+cpu.getSpeed());
		System.out.println("硬盘容量为："+HD.getAmount());  
		System.out.println("cpu类型为："+cpu.getType());  
		System.out.println("硬盘品牌为："+HD.getBrand());  
		
	}
```
## 实验感想  
了解了this语句赋值，调用实参get返回值。附加任务尝试了多包调用，private语法，不是很熟练。  
在pc调用setCPU和setHarddisk时调用的实参和命名常常弄混淆。  
以后还需多加联系。  








  
