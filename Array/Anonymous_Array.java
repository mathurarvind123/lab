package Array;

public class Anonymous_Array {
	static void print(int arr[]) { //method receives an array as argument / parameter
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);	
	}
	public static void main(String[] args) {
		print(new int [] {10,20,30,40,50,60,70}); // passing anonymous array to method print
		
	
}
}
