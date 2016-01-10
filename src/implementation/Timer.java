package implementation;
//laziest singleton model
public class Timer {
	private long time;
	
	/* This takes advantage of language guarantees about class initialization, 
	 * and will therefore work correctly in all Java-compliant compilers and 
	 * virtual machines.*/
	public static class TimerSingle {
		private static final Timer TIMER = new Timer();
		
		public TimerSingle(){
		}
		
		public static Timer getInstance(){
			return TIMER;
		}
		
	}
	// no call to constructor from outside
	private Timer(){
		//does not require this, can help debug performance problems
		time = System.currentTimeMillis(); 
	}
	//will start the clock
	private void start(){ 					
		time = System.currentTimeMillis();
	}
	
	public long getTime(){
		return time;
	}
	
	//initialize timer
	public void init(){  
		start();
	}
	
	//print out the elapsed time
	public void elaspedTime(){
		long temp = System.currentTimeMillis() - time;
		System.out.println("Elasped Time Calculated is " + temp+"ms");
	}
	
}
