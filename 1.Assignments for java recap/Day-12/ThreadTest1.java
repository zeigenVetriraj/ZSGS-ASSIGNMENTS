

/*
1. Write a Java program to demonstrate multi-threading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds
between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.
*/

public class ThreadTest1{
	public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);

        t1.start();
        t2.start();
    }
}

class MyThread extends  Thread{
    int thread;
    public MyThread(int t){
        thread = t;
    }
    @Override
    public void run(){
        try{
            int i = 5;
            while(i-- > 0){
                String name = Thread.currentThread().getName();
                System.out.println(name+" : "+thread);
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
