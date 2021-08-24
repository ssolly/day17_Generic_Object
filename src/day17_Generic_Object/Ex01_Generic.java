package day17_Generic_Object;

public class Ex01_Generic {

	public static void main(String[] args) {
		
		Print dbl = new Print();
		dbl.test(1.123, 2.234);
		Print str = new Print();
		str.test("abc", "def");
		Print it = new Print();
		it.test(20, 8);
		
	}
}

//overloading :  같은 이름의 메소드이지만 매개변수가 달라 다른 메소드로 인식
class Print {
	public void test(double n1, double n2) {
		System.out.println(n1+","+n2);
	}
	
	public void test(String s1, String s2) {
		System.out.println(s1+","+s2);
	}
	
	public void test(int n1, int n2) {
		System.out.println(n1+","+n2);
	}
}

