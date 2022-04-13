package P20220413.array;

public class Class9ForEx {
	public static void main(String[] args) {
		// 주사위게임 2개를 던짐
		// 2개의 숫자의 합이 6이되는 경우
		// 예를 들면 1,5 / 2,4 / 3,3 / 4,2 / 5,1
		// 이런 조합을 만들어주는 반복문

		// int[] array = new int[6];
		// int[] arry = new int[6];

		System.out.println("숫자의 합이 되는 6의 조합");
		for (int i = 1; i <= 6; i++) {
			// int ran = (int) (Math.random() * 6) + 1;
			for (int j = 1; j <= 6; j++) {
				if (1 + j == 6) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
	}

}
