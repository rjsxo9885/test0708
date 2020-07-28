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
			Student studentLee = new Student(100,"이상원");
			Student studentLee2 = studentLee;
			Student studentSang = new Student(100,"이상원");
			
			System.out.println(studentLee == studentLee2);
			System.out.println(studentLee == studentSang);
			
			if(studentLee== studentLee2) {
				System.out.println("studentLee 와 studentLee2의 주소는 같습니다");
			}else {
				System.out.println("studentLee 와 studentLee2의 주소는 다릅니다");
			}
			
			if(studentLee.equals(studentLee2)) {
				System.out.println("studentLee 와 studentLee2는 동일합니다");
			}else {
				System.out.println("studentLee 와 studentLee2는 동일하지않습니다");
			}
			
			if(studentLee==studentSang) {
				System.out.println("studentLee 와 studentSang의 주소는 같습니다");
			}else {
				System.out.println("studentLee 와 studentSang의 주소는 다릅니다");
			}
			if(studentLee.equals(studentSang)) {
				System.out.println("studentLee 와 studentSang는 동일합니다");
			}else {
				System.out.println("studentLee 와 studentSang는 동일하지않습니다");
			}
			
	}

}
