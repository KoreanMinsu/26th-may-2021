package come.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		char sign = sc.next().charAt(0);
		
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		if(sign == '+') {
			System.out.println("결과는: "+ (num1 + num2));
		} else if(sign == '-') {
			System.out.println("결과는: "+ (num1 - num2));
		}  else if(sign == '*') {
			System.out.println("결과는: "+ (num1 * num2));
		} else if(sign == '/') {
			
			if(num1 == 0 || num2 == 0) 
				System.out.println("게산할 수 없습니다.");
			else 
			System.out.println("결과는: " + num1 / num2);
			
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		sc.close();
	}
}
