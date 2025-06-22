package Singleton;

public class Logger {
	private static Logger instance =new Logger();
	private Logger() {
		
	}
	public static Logger getInstance(){
		return instance;
	}
	public static void main(String args[]) {
		Logger logger1=Logger.getInstance();
		Logger logger2=Logger.getInstance();
		if(logger1==logger2) {
			System.out.println("Singleton Patter Created");
		}
		else {
			System.out.println("Not a SIngleton Pattern");
		}
	}
}

