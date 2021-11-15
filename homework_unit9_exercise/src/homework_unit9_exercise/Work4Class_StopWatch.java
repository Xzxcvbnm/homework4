package homework_unit9_exercise;

public class Work4Class_StopWatch {
	private long startTime;
	private long endTime;
	
	public Work4Class_StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElaspsedTime() {
		return this.endTime-this.startTime;
	}

}
