package P20220413.array;

public class Class5ArrayEx4 {
	public static void main(String[] args) {
		int[] intary = new int[5];
		int sum = 0;
		// 1 ~ 30까지 임의 값

		// 반복문 활용해서 임의의 값 5개 저장
		for (int i = 0; i < 5; i++) {
			// System.out.println("랜덤값 1 ~ 30");
			int ran = (int) (Math.random() * 30) + 1;
			intary[i] = ran;
			if (intary[i] > 15) {
				sum += intary[i];
			}
		}
		System.out.println(intary[0] + "," + intary[1] + "," + intary[2] + "," + intary[3] + "," + intary[4]);
		System.out.println("합계 " + sum);

		// 15보다 큰 값만 합계를 내고 평균을 구하시오
	}

}
