package P20220413.diemension;

import java.util.Scanner;

public class Class14StudentEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("학생이름 점수 나이"); //홍길동 80 20
		s1.studName = sc.next();
		s1.score = Integer.parseInt(sc.next());
		s1.age = Integer.parseInt(sc.next());
		
		Student[] students = {new Student(), new Student(), new Student()};
		students[0].studName = sc.next();
		students[0].score = Integer.parseInt(sc.next());
		students[0].age = Integer.parseInt(sc.next());
		
		//조회하고 싶은 이름입력..
		// 해당이름 홍길동은 20살이고 점수는 80점입니다
		//이름 점수 나이를 받을수있도록 코드를 만들기
	}

}
