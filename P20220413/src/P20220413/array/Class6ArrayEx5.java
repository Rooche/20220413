package P20220413.array;

import java.util.Scanner;

public class Class6ArrayEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 학생 5명의 수학점수를 담아보시오 ~
		int[] scores = new int[5];
		int max = 0;
		int min = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생 점수를 입력하세요");
			scores[i] = sc.nextInt();
		}
		max = min = scores[0]; // min에 0으로 해두면 무조건 0이로 나와서 scores첫번째 작은 값을 min에 넣어준다

		for (int i = 0; i < scores.length; i++) {

			if (max < scores[i]) {
				max = scores[i];
			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}

		// 학생중에서 최고점은 몇점, 최저점은 몇점,
		System.out.println("최고점은: " + max + "최저점은 " + min);
	}

}
