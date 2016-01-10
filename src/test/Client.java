package test;
import java.util.Scanner;

import implementation.Timer;
import implementation.Timer.TimerSingle;

public class Client {
	 Timer timer;
	private static Scanner sc; //just for testing
public static void main(String abc[]){
	
	//implicit constructor, TIMER object loaded when class instantiated
	TimerSingle.getInstance().init(); 
	
	//test code
	int temp = (3000000 * 435263 * 2)/45021;
	System.out.println(temp);
	sc = new Scanner(System.in);
	sc.next();
	
	TimerSingle.getInstance().elaspedTime();
}
}
