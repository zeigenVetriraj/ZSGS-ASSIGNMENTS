

/*
2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.

*/

public class ThreadTest2{
	public static void main(String[] args) {
        Thread t1 = new Thread(new TaskRunner());
        Thread t2 = new Thread(new TaskRunner());

        t1.start();
        t2.start();
    }
}

class TaskRunner implements Runnable{
    
    @Override
    public void run(){
        try{
            int i = 10;
            while(i-- > 0){
                String name = Thread.currentThread().getName();
                System.out.println(name);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
