package mar2;

import java.util.Scanner;

public class Question_3 {
	public class Sum_Odd {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in); // creating scanner class
			System.out.print("Enter numbers where upto odd numbers sum is needed : ");
			int num = in.nextInt();
			int sum = 0;
			for (int i = 1; i <= num; i++) {      
			    if (i % 2 != 0) { // logic for odd number
			        sum = sum + i;
			    }
			}
			System.out.println(sum); // print sum of odd  numbers
		}
	}
}
