package day21;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return  studentId+","+studentName;
	}
}

	
public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student studentLee = new Student(100,"�̻��");
			Student studentLee2 = studentLee;
			Student studentSang = new Student(100,"�̻��");
			
			System.out.println(studentLee == studentLee2);
			System.out.println(studentLee == studentSang);
			
			if(studentLee== studentLee2) {
				System.out.println("studentLee �� studentLee2�� �ּҴ� �����ϴ�");
			}else {
				System.out.println("studentLee �� studentLee2�� �ּҴ� �ٸ��ϴ�");
			}
			
			if(studentLee.equals(studentLee2)) {
				System.out.println("studentLee �� studentLee2�� �����մϴ�");
			}else {
				System.out.println("studentLee �� studentLee2�� ���������ʽ��ϴ�");
			}
			
			if(studentLee==studentSang) {
				System.out.println("studentLee �� studentSang�� �ּҴ� �����ϴ�");
			}else {
				System.out.println("studentLee �� studentSang�� �ּҴ� �ٸ��ϴ�");
			}
			if(studentLee.equals(studentSang)) {
				System.out.println("studentLee �� studentSang�� �����մϴ�");
			}else {
				System.out.println("studentLee �� studentSang�� ���������ʽ��ϴ�");
			}
			
	}

}
