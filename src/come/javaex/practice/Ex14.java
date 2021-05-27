package come.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해주쇼(단위: 만원)");
		System.out.print("금익: ");
		double wage = sc.nextDouble();
		double tax;
		if (wage >= 8000) {
			tax = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (wage - 8000);
			System.out.println("소득세는 " + tax + "입니다.");
		} else if (wage > 4000) {
			tax = 1000 * 0.09 + 3000 * 0.18 + 0.27 * (wage - 4000);
			System.out.println("소득세는 " + tax + "입니다.");
		} else if (wage > 1000) {
			tax = 1000 * 0.09 + 0.18 * (wage - 1000);
			System.out.println("소득세는 " + tax + "입니다.");
		} else if (wage > 0 && wage <= 1000) {
			tax = 0.09 * wage;
			System.out.println("소득세는 " + tax + "입니다.");
		} else {
			System.out.println("잘못 입력했슈.");
		}
		sc.close();

	}
}
