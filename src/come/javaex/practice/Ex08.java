package come.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		int min;
		
		System.out.println("숫자3개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		System.out.print("숫자3: ");
		num3 = sc.nextInt();
			if (num1 <= num2 && num1 <= num3) {
				min = num1;
			} else if (num2 <= num1 && num2 <= num3) {
				min = num2;
			} else min = num3;
			System.out.print("가장 작은수는 "+ min + " 입니다.");
		sc.close();
	}
}
