package day3;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class -end 
		/*������(operator) :��������ǥ���ϴ� ��ȣ
		
		--->�������� ����,�ǿ�����,��,operand
		
		0.(��ȣ)
		1.���׿����� ~a,-a,++a,a--,!a,(int)a
		2.���׿����� a+b,a-b ,a&&b,a&b,a|b,a=b,a==b,a<b
		3.���⿬���� ��1? ��2 : ��3
		
		====���׿������� �켱����
		
		shift ��Ʈ ������                        ����Ʈ������
		  <<,>>,>>>					& -> ^ -> |
		
		() -->���������-->���迬���� ->       ��������
		
		��ȣ       *,/,+...   <,>,>=..		not->and ->or 
										 !	 &&	   ||
		������ 5  /  2 ->   2 
		     int   int	int
			5.0 / 2.0 ->2.5
			double��
		5>2 > true
		5<2 >false
		5 ==2 >false
		5!= > true
		
		*/
		int num1 =5;
		int num2 =2;
		int result =num1 + num2;
		System.out.println("���� :"+result);
		System.out.println("���� :"+num1 + num2);
		System.out.println("���� :"+(num1+num2));
		System.out.println("����:"+(num1-num2));
		System.out.println("����:"+(num1+num2));
		System.out.println("������ ��:"+(num1/num2));
		System.out.println("������ ��:"+(double)num1/(double)num2);
		System.out.println("������(������)"+(num1)%(num2));
		
		
	}
}


