package day17_Generic_Object;

public class Ex02_Generic {

	public static void main(String[] args) {
		
		//자료형을 명시하지 않았기 때문에 경고가 뜬 것
		Print02 dbl = new Print02();
		dbl.test(1.123, 2.234);
		Print02 str = new Print02();
		str.test("abc", "def");
		Print02 it = new Print02();
		it.test(20, 8);
		
		Print02<Double> db = new Print02<Double>();
		db.test(0.28, 2.8);
		Print02<String> st = new Print02<String>();
		st.test("gene", "ric");
		Print02<Integer> in = new Print02<Integer>();
		in.test(283, 398405);
		
	}
}

class Print02<T> {	// <T> : 자료형(가변적)
	public void test(T t1, T t2) {
		System.out.print(t1+","+t2);
		System.out.println(" ("+t1.getClass()+")");
	}
}
