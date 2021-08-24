package day17_Generic_Object;

import java.util.ArrayList;

public class Ex03_Generic {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		arr.add(1111);
		arr.add(1.234);
		arr.add('a');
		
		//double dbl = arr.get(3)+8.29;
		
		ArrayList<String> strarr = new ArrayList<String>();
		strarr.add("문자열만");
		strarr.add("추가");
		strarr.add("가능");
		//strarr.add(123);	int형태는 저장 불가능
		
		System.out.println(strarr.get(0)+strarr.get(1)+strarr.get(2)+"하다");
		
	}
}
