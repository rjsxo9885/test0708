package day17;

   class BankStatic{
	
	   private  String name;
	   private  double balance;
	   private static double rate;
	   public int a ;
	   public double count;
	   public BankStatic(String name,double balance) {
		   
		   this.balance = balance;
		 
		   this.name = name;
		   
		   	count = (balance*rate);
	   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public  void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getRate() {
		   return rate;
	}

	public static void setRate(double rate) {
		  BankStatic.rate = rate;
	}
	
	
	
	public void print_account() {
		  System.out.println(name + "\t" + balance+count + "��\t" + rate + "%");
		   }
	
	public void MoneyUp() {
		
		double a  = this.balance*rate;
		
		
		
	}
	
	
}









public class JavaEx024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 System.out.println("-- 2000�� --");
		  
		  BankStatic.setRate(4.5);
		  BankStatic hong = new BankStatic("ȫ�浿", 10000);
		  hong.print_account();
		  
		  System.out.println("-- 2019�� --");
		  BankStatic.setRate(2.5);
		  BankStatic kim = new BankStatic("��ö��", 20000);
		  hong.print_account();
		  kim.print_account();
		  
		  System.out.println("-- 2020�� --");
		  BankStatic.setRate(1.5);
		  BankStatic lee = new BankStatic("�̿���", 30000);
		  hong.print_account();
		  kim.print_account();
		  lee.print_account();

	}

}
