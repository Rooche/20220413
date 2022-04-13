package P20220413.array;

public class Class8ArrayEx7 {
	public static void main(String[] args) {

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int month = 6;
		
		int lnth = getLastday(month);
		int[] intary = new int[lnth];

		// 배열의 값을 지정
		for (int i = 0; i < intary.length; i++) {
			intary[i] = i + 1;
		}
		// 요일출력부분
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]); // 문자열일때는 s를 사용
		}
		System.out.println(); //줄바꿈
		int spcaces = getDayInfo(month);
		for (int i = 0; i < spcaces; i++) {
			System.out.printf("%4s", " ");
		}
		// 날짜 출력
		for (int i = 0; i < intary.length; i++) {
			System.out.printf("%4d", intary[i]); // 숫자일땐 d값을 3자리 공간만큼 쓰겠다
			if ((i + spcaces) % 7 == 6) {
				System.out.println(); // 줄바꿈
			}
		}
		
		
	} // end of main

	public static int getLastday(int month) {

		switch (month) {
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30; // 4월은 30일까지
		case 5:
			return 31; // 5월은 31일까지
		case 6:
			return 30;
		default: // 아무조건도 아닐때 디폴트값을 사용
			return 0;
		}
	}

	public static int getDayInfo(int month) {

		switch (month) {
		case 2:
			return 2;
		case 3:
			return 2;
		case 4:
			return 5; // 요일의 빈공간 정보 4월은 빈공간이 5개로 시작
		case 5:
			return 0;
		case 6:
			return 3;
		default: // 아무조건도 아닐때 디폴트값을 사용
			return 0;
		}

	}

}
