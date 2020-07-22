package day17;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student();
		
		studentLee.setStudentName("이길동");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		System.out.println("----------------------------");
		Student studentSon = new Student();
		studentSon.setStudentName("손길동");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++; 
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		studentLee.serialNum--;
	}
/*
 * static  변수 :(인 ) 정적인 변수 ,클래스 변수
 * JYM으로 소스 로딩시 , 메모리 할당
 * 프로그램 실행시 최소 한번만 메로리 할당 받음
 * 메모리  주소가 공유
 * 자주 생성이 필요한 객체의 경우,STATIC 객체 형식으로 생성하면 처리속도를 많이 향상 
 * 시킬수  있다.
 * 2.static 메소드():클래스 함수
 */
}
