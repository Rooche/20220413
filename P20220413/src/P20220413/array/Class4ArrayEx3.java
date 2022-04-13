package P20220413.array;

public class Class4ArrayEx3 {
	public static void main(String[] args) {
		int[] intary = { 78, 83, 88, 92, 63,};

		// 합을 구하는 코드 작성
		// double 값에 avg 평균담기
		int sum = 0;

		for (int i = 0; i < intary.length; i++) { // length는 배열의 크기만큼
			// for (int i = 0; i < 5; i++) {
			// System.out.println(intary[i]);
			sum += intary[i];

		}

		System.out.println("합:" + sum);

		double avg = sum / 5;
		System.out.println("평균: " + avg);

		// 1,3,5번째만 합 구하기
		sum = 0;
		for (int i = 0; i <= 5; i += 2) {
			// System.out.println(intary[i]);
			sum += intary[i];
		}
		System.out.println("1,3,5합:" + sum);

		// 짝수인 데이터만
		sum = 0;
		for (int i = 0; i < 5; i++) {
			if (intary[i] % 2 == 0) {
				// System.out.println(intary[i]);
				sum += intary[i];
			}
		}
		System.out.println("짝수의 합:" + sum);

	}
}
