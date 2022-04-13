package P20220413.diemension;

import java.util.Scanner;

public class Class12ArrayEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 변수 vs 배열
		// 변수활용
		int num1, num2, num3, num4;
		System.out.println("첫번재 값입력>>");
		num1 = sc.nextInt();
		System.out.println("두번재 값입력>>");
		num2 = sc.nextInt();
		System.out.println("세번재 값입력>>");
		num3 = sc.nextInt();
		System.out.println("네번재 값입력>>");
		num4 = sc.nextInt();

		int[] inary = { num1, num2, num3, num4};
		for (int j = 0; j < inary.length - 1; j++) {

			for (int i = 0; i < inary.length - 1; i++) {
				if (inary[i] > inary[i + 1]) {
					int temp = inary[i];
					inary[i] = inary[i + 1];
					inary[i + 1] = temp;
				}
			}

			System.out.println(inary[0] + ", " + inary[1] + ", " + inary[2] +", " + inary[3]);
			// 제일 작은 수 ~ 제일 큰 수의 순으로 출력
			if (num1 > num2) {
				if (num1 > num3) {
					System.out.println(num3 + num2 + num1);
				} else {
					if (num1 > num3) {
						System.out.println(num2 + num3 + num1);
					}
				}

			}

		}
	}
}
