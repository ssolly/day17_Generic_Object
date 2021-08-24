package day17_Generic_Object;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_StinfoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Ex04_StInfo> arr = new ArrayList<Ex04_StInfo>(); //StInfo 형태의 객체만 저장
		
		String name;
		int age;
		
		while (true) {
			System.out.println("1.등록 2.확인 3.종료");
			System.out.print(">> ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : 
				Ex04_StInfo stinfo = new Ex04_StInfo();
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("나이 입력 : ");
				age = sc.nextInt();
				stinfo.setName(name);
				stinfo.setAge(age);
				arr.add(stinfo);
				System.out.println("등록 완료");
				break;
			case 2 :
				for (int i=0; i<arr.size(); i++) {
					Ex04_StInfo st = arr.get(i);
					System.out.println(i + ") 이름 : " + st.getName() + ", 나이 : " + st.getAge());
				}
				break;
			case 3 :
				return;
			}
		}
		
		/*
		ArrayList<String> str = new ArrayList<String>();
		String s = "test";
		str.add(s);
		StInfo st = new StInfo();
		arr.add(st);
		*/
	}
}
