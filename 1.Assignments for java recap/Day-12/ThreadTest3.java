

/*
3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20.
Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).
*/

public class ThreadTest3{
	public static void main(String[] args) {
        Printer print = new Printer();
        EvenThread even = new EvenThread(print);
        OddThread odd = new OddThread(print);

        odd.start();
        even.start();
    }
}

class Printer{
    boolean evenTern = false;

    public synchronized void printOdd(int n) throws InterruptedException{
        while(evenTern){
            wait();
        }
        System.out.println("Even : "+n);
        evenTern = true;
        notifyAll();
    }
    public synchronized void printEven(int n) throws InterruptedException{
        while(!evenTern){
            wait();
        }
        System.out.println("Odd : "+n);
        evenTern = false;
        notifyAll();
    }
}
class EvenThread extends  Thread{
    private Printer printer;

    public EvenThread(Printer printer){
        this.printer = printer;
    }
    @Override
    public void run(){
        try{
            for(int i=2; i<=20; i+=2){
                printer.printEven(i);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class OddThread extends  Thread{
    private Printer printer;

    public OddThread(Printer printer){
        this.printer = printer;
    }
    @Override
    public void run(){
        try{
            for(int i=1; i<=20; i+=2){
                printer.printOdd(i);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
