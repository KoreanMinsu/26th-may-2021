package come.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int age;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("나이를 입력해주세용");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다");
		sc.close();
// 20세 초과의 나이는 1번그룹 / 20세 이하의 나이는 2번그룹으로 배정된다
	}
}
