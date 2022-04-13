package P20220413.array;

import java.util.Scanner;

public class Class7ArrayEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = new String[3]; // 학생의 이름저장
		int[] scores = new int[3]; // 학생의 점수 저장

		for (int i = 0; i < names.length; i++) {
			System.out.println("학생의 이름을 입력하세요>>>");
			names[i] = sc.nextLine();

			System.out.println("학생의 점수를 입력하세요>>>");
			scores[i] = sc.nextInt(); // nextInt는 사용자가 50점을 넣고 엔터를 누르면 50점만 가져감
			sc.nextLine();
			// 홍길동 , 김길동 , 박길동
			// 40 , 50 , 60
		}
		System.out.println("조회할 학생의 이름을 입력>>>");
		String serchName = sc.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(serchName)) {
				System.out.println(serchName + "의 점수는:" + scores[i]); //
			}
		}
		System.out.println("프로그램이 끝났습니다");
	}

}
