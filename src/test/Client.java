package test;
import java.util.*;

import implementation.Timer;
import implementation.Timer.TimerSingle;

public class Client {
	 Timer timer;
public static void main(String abc[]){
	TimerSingle.getInstance().init();
	int temp = (3000000 * 435263 * 2)/45021;
	System.out.println(temp);
	Scanner sc = new Scanner(System.in);
	sc.next();
	TimerSingle.getInstance().elaspedTime();
}
}
