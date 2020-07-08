import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class aaaaaaa {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("계산 수식 : ");
 
        String susik = scanner.nextLine(); 
 
        String[] operand = susik.split("\\+|\\-"); 
        Queue<Character> operator = new LinkedList<Character>();
 
        for (int i = 0; i < susik.length(); i++) {
            if(susik.charAt(i)=='+') { 
                operator.add('+');
                continue;
            }    
            else if(susik.charAt(i)=='-') {
                operator.add('-');
                continue;
            }else {
                continue;    
            }
        }
        
        int plusSum = 0;    int minusSum = 0;    int result = 0;
        plusSum = Integer.parseInt(operand[0]); 
        
        for (int i = 1; i < operand.length; i++) {
            try {
                char ch = operator.poll(); 
                if(ch == '+') {
                    plusSum += Integer.parseInt(operand[i]);
                    continue;
                }else if(ch == '-') {
                    minusSum += Integer.parseInt(operand[i]);
                    continue;
                }
            } catch (NullPointerException e) {
                break;
            }
        }
        result = (plusSum - minusSum);
        System.out.println("결과 : "+result);
    }
}
 

