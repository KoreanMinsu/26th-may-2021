package come.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원번호(정수)입력해주쇼");
		System.out.print("사번: ");
		
		int eNum = sc.nextInt();
		if(eNum%3==0 && eNum>=0) {
			System.out.println("A팁이유");
		} else if(eNum%3==1) {
			System.out.println("B팁이유");
		} else if(eNum%3==2) {
			System.out.println("C팁이유");
		} else {
			System.out.println("잘못입력했슈");
		}
		sc.close();
		
	}
}
