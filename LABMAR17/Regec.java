package LABMAR17;

import java.util.Scanner;

public class Regec {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ip address");
        while(in.hasNext()){
            String IP = in.next();
            new MyReg();
			System.out.println(IP.matches(MyReg.pattern));
        }

    }
}

class MyReg {
    public static String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
    public static String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
}
}
