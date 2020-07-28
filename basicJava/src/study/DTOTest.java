package study;


class DTO{
	 int fieldA;
	 int fieldB;
	 int fieldC;
	public DTO(int fieldA,int fieldB,int fieldC) {
		setFieldA(fieldA);
		this.fieldB = fieldB;
		this.fieldC = fieldC;
	}
	public int getFieldA() {
		return fieldA;
	}
	public void setFieldA(int fieldA) {
		this.fieldA = fieldA;
	}

	
}


class DTOsub extends DTO{
	
		
	public DTOsub(int fieldA, int fieldB, int fieldC) {
		super(fieldA, fieldB, fieldC);
	}
	
	
	public void printField() {
		//System.out.println(fieldA);
		System.out.println(fieldB);
		System.out.println(fieldC);
		
		setFieldA(100);
		System.out.println(getFieldA());
	}
	
}







public class DTOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DTOsub dto = new DTOsub(1, 2, 3);
		
		// System.out.println(dto.fieldA);
		System.out.println(dto.fieldB);
		System.out.println(dto.fieldC);
		
		dto.printField();
		
	}

}
