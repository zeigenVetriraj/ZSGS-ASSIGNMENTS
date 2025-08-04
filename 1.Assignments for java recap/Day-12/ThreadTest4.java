
/*
4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times.
Use synchronization to avoid race conditions and display the final value.
*/

public class ThreadTest4{
	public static void main(String[] args) {
        Counter count = new Counter();

        WorkThread w1 = new WorkThread(count);
        WorkThread w2 = new WorkThread(count);
        WorkThread w3 = new WorkThread(count);

        w1.start();
        w2.start();
        w3.start();

        try{
            w1.join();
            w2.join();
            w3.join();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("The total count : "+count.getValue());
    }
}

class Counter{
    private int count=0;

    public synchronized void count(){
        count++;
    }
    public int getValue(){
        return count;
    }
}

class WorkThread extends Thread{
    Counter counter;
    public WorkThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i=1; i<=1000; i++){
            counter.count();
        }
    }
}
