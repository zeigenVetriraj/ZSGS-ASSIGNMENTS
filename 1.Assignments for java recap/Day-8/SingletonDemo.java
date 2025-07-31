

//1. Illustrates with an example of using Singleton class.

public class SingletonDemo{
	public static void main(String[] args){
		SingletonClass cls1 = SingletonClass.singletonClass();
		SingletonClass cls2 = SingletonClass.singletonClass();
		
		System.out.println(cls1==cls2);
		cls1.display();
		cls2.display();
	}
}

class SingletonClass{
	private static SingletonClass instance = null;
	
	public static SingletonClass singletonClass(){
		if(instance == null){
			instance = new SingletonClass();
		}
		return instance;
	}
	
	public void display(){
		System.out.println("Inside the Singleton Class : "+instance);
	}
}
