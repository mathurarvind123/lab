package lab30;
class LoaderThread implements Runnable {  // implementing runnablke interferance
    ListLoader listLoader; // reference created for ListLoader class
    // instance variable
    int startNumber; 
    int lastNumber;
//overloading constructor with instance variable
   public LoaderThread(ListLoader listLoader, int startNumber, int lastNumber) {
       this.listLoader = listLoader;
       this.startNumber = startNumber;
       this.lastNumber = lastNumber;
   }

   public void run() { // runnnable interferance run()
       listLoader.loadList(startNumber, lastNumber); // 
   } 
}
public class MainThread extends Thread { // main class 
	public static void main(String[] args) throws Exception { // main method throws Exception
		ListLoader obj = new ListLoader();
	
		// creating object of thread class using Thread(runnable object, startNumber , lastNumber  )			
		LoaderThread thread1 = new LoaderThread(obj, 0, 50);  
		LoaderThread thread2 = new LoaderThread(obj, 50, 100);
		// thread object created 
		Thread t1 =new Thread(thread1);
		Thread t2 =new Thread(thread2);
	t1.start(); // start() for thread 1
	try {
		t1.join();
	} catch (Exception e){ System.out.println(e);}
	t2.start(); // start() for thread 2
	try {
		t2.join();
	} catch (Exception e){ System.out.println(e);}
	}
}



