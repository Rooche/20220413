package P20220413.array;

public class Class3ArrayEx2 {
	public static void main(String[] args) {
		int[] intary = { 10, 20, 30, 40, 50 };
//		intary[1]
		int maxval = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(intary[i]);
			if (maxval < intary[i]) {
				maxval = intary[i];
			}
			sum += intary[i];
		}

		System.out.println("최대값: " + maxval);
		System.out.println("합계: " + sum);
	}

}
