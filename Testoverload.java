import java.util.*;
public class Testoverload {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	public String add(String s1,String s2) {
		return s1+s2;
	}
	public static void main(String args[]) {
		Testoverload object1=new Testoverload();
		System.out.println(object1.add(10,20));
		System.out.println(object1.add(1.4,2.3,4.56 ));
		System.out.println(object1.add("Melapu", "Swathi"));
	}
}
