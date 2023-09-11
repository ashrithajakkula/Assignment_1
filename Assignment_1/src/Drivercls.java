
public class Drivercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objcls1 obj1;
		objcls2 obj2;
		objcls3 obj3;
		objcls4 obj4;
 obj1=new objcls1();
 obj2=new objcls2();
 obj3=new objcls3();
 obj4=new objcls4();
 obj1.f1();
 int a=obj2.f1();
 System.out.println("REturn value from f1: "+a);
 obj3.f1("Task");
 int b=obj4.f1(5, 4);
 System.out.println("return value from f1 : "+b);
 
 
	}

}
