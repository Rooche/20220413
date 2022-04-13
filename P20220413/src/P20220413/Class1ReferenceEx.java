package P20220413;

public class Class1ReferenceEx {
	public static void main(String[] args) {

		// 기본타입
		int num1 = 100;
		int num2 = 100;
		if (num1 == num2) { //Syntax 오류는 문법오류
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}

		// 참조타입 , 참조타입은 주소값을 가지고있음
//		new Scanner("");
		String str1 = new String("홍길동"); // 인스턴스
		String str2 = new String("홍길동"); // 인스턴스
		str1 = null; // 널값을 참조타입의 연결을 끊음
		str1 = "김길동"; //그래서 김길동을 적고 컴파일하면 다른값으로 나옴
		
		// if (str1 == str2) { //참조변수를 == 로 비교를 하면 주소값으로 비교를 하여서 다른값이 나옴
		if (str1.equals(str2)) { // 값으로 비교하려면 equals메소드로 비교해야함
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		} // (if (str1 == str2) {)홍길동은 다른값이라고 뜸

	}

}
