package day3;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class -end 
		/*연산자(operator) :연산기능을표현하는 기호
		
		--->연산대사의 갯수,피연산자,항,operand
		
		0.(골호)
		1.단항연산자 ~a,-a,++a,a--,!a,(int)a
		2.이항연산자 a+b,a-b ,a&&b,a&b,a|b,a=b,a==b,a<b
		3.삼향연산자 항1? 항2 : 항3
		
		====이항연산자의 우선순위
		
		shift 비트 연산자                        논리비트연산자
		  <<,>>,>>>					& -> ^ -> |
		
		() -->산술연산자-->관계연산자 ->       논리연산자
		
		괄호       *,/,+...   <,>,>=..		not->and ->or 
										 !	 &&	   ||
		나눗셈 5  /  2 ->   2 
		     int   int	int
			5.0 / 2.0 ->2.5
			double형
		5>2 > true
		5<2 >false
		5 ==2 >false
		5!= > true
		
		*/
		int num1 =5;
		int num2 =2;
		int result =num1 + num2;
		System.out.println("덧셈 :"+result);
		System.out.println("덧셈 :"+num1 + num2);
		System.out.println("덧셈 :"+(num1+num2));
		System.out.println("뺄셈:"+(num1-num2));
		System.out.println("곱셈:"+(num1+num2));
		System.out.println("나눗셈 몫:"+(num1/num2));
		System.out.println("나눗셈 몫:"+(double)num1/(double)num2);
		System.out.println("나눗셈(나머지)"+(num1)%(num2));
		
		
	}
}


