package feb23;

class Bank {
	  float getrateofinterest() {
		  return 0;
		  }}
	class SBI extends Bank {
		float getrateofinterest() {
				return  5;
			
		}}
	class ICICI extends Bank  {
		float getrateofinterest() {
			return 7;
		}}
	class Axis  extends Bank  {
			float getrateofinterest() {
					return 8;	
		}}
		public class Question_1 {
		 	public static void main(String[] args) {
		 		Bank Bank;
		 	Bank=new SBI();
		 	System.out.println(Bank.getrateofinterest()+"%");
		 	Bank=new ICICI();
		 	System.out.println(Bank.getrateofinterest()+"%");
		 	Bank=new Axis();
		 	System.out.println(Bank.getrateofinterest()+"%");
		 	}
	}