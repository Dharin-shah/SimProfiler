package implementation;

public class Timer {
	private long time;
	
	public static class TimerSingle {
		private static final Timer TIMER = new Timer();
		
		public TimerSingle(){
		}
		
		public static Timer getInstance(){
			return TIMER;
		}
		
	}
	
	private Timer(){
		time = System.currentTimeMillis();
	}
	
	private void start(){
		time = System.currentTimeMillis();
	}
	
	public long getTime(){
		return time;
	}
	
	public void init(){
		start();
	}
	
	public void elaspedTime(){
		long temp = System.currentTimeMillis() - time;
		System.out.println("Elasped Time Calculated is " + temp+"ms");
	}
	
}
