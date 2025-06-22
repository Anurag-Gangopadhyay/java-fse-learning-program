//week1 exercise 1- singleton pattern by logger class

import java.util.*;
class Logger {
    // static class
    private static Logger ob;
	public static int i = 0;
    private Logger()
    {
        System.out.println("Logger is Instantiated.");
    }
    public static Logger getInstance()
    {
        if (ob == null)
            ob = new Logger();
        return ob;
    }
    public static void logEntry()
    {
        
		System.out.println("Entry logged at Logger. count= " + i++);
    }
}

class SingletonPatternExample {
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int ch = 1;
        while(ch != 0){
			Logger.getInstance().logEntry();
			System.out.println("PRESS 0 TO EXIT, OR ANY NUMBER TO KEEP LOGGING");
			int c = sc.nextInt();
			ch = c;
		}
		System.out.println("****THANK YOU, LOG SESSION OVER, PROGRAM TERMINATED****");
			
    }
}