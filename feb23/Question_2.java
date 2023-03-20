package feb23;


class Employee{
		int IncremenSalry() {  // method 1
			return 0;
		}
	}
	class Developer extends Employee {	
		int IncremenSalry() {  //method 2
			return 5;
		}
	}
	class Manager extends Employee {
		int IncremenSalry() {  // method 3
			return 6;
	}
		public class Question_2 {
		public static void main(String[] args) {
			Employee emp;
			emp = new Employee();
			System.out.println(emp.IncremenSalry()+"% is incresed");
			emp = new Developer();
			System.out.println(emp.IncremenSalry()+"% is incresed");
			emp = new Manager();
			System.out.println(emp.IncremenSalry()+"% is incresed");
}}}
