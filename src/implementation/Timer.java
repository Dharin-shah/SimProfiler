package implementation;

/**Laziest singleton model*/
public class Timer {
	private long time;
	
	/** This takes advantage of language guarantees about class initialization, 
	 * and will therefore work correctly in all Java-compliant compilers and 
	 * virtual machines.*/
	public static class TimerSingle {
		private static final Timer TIMER = new Timer();
		
		public TimerSingle(){
		}
		/** returns a single instance of Timer object*/
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
	
	/**returns current time in long*/
	public long getTime(){
		return time;
	}
	
	/**calls private function start() to start the timer*/
	public void init(){  
		start();
	}
	
    /**prints out time elapsed between init() and elapsedTime()*/
	public void elapsedTime(){
		long temp = System.currentTimeMillis() - time;
		System.out.println("Elasped Time Calculated is " + temp+"ms");
	}
	
}
