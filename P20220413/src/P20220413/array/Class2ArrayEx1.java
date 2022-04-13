package P20220413.array;

public class Class2ArrayEx1 {
	public static void main(String[] args) {
		// 학생의 점수 30명점수를 저장하고싶다
		int score1 = 80;
		// ....
		int score30 = 78;

		// 여러개의 같은 유형의 값을 저장하고싶을때
		int[] intAry = new int[30]; // 정수int를 30개 담을수있는 공간을 생성

		intAry[0] = 30; // 0부터 시작하기때문에 0번째 방이 1의 위치가 됨
		intAry[4] = 40; // 0부터 시작하기때문에 4번째 방이 5의 위치가 됨
		intAry[29] = 55; // 0부터 시작하기때문에 29번째 방이 30의 위치가 됨

		System.out.println(intAry[0]);
		System.out.println(intAry[1]);

		double[] dblAry = new double[10]; // 지수 double을 10개 담을수있는 공간을 생성

		String[] strAry = new String[5]; // 참조타입변수 => null
		System.out.println(strAry[0]);

		int[] otherAry = { 10, 20, 30, 40 }; // 초기값을 지정할때는 {}중괄호를 씀
		int[] theOtherAry = { 10, 20, 30, 40 }; // 초기값을 지정할때는 {}중괄호를 씀
		System.out.println(otherAry[0]); // 이때 0은 참조값이 아니라 실제 값임 ex) 0이라고 적었지만 중괄호에 있는 첫번째 방 10이 출력됨

		if (otherAry[0] == theOtherAry[0]) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
	}

}
