

//7. Develop a Java program to illustrate the usage of toString() method.

public class ToString{
    public static void main(String[] args) {
		StringDemo st = new StringDemo();
		StringDem std = new StringDem();
		
		System.out.println("without toString() method : "+std);// without toString() method
		System.out.println("with toString() method    : "+st); // with toString() method
	}
}

class StringDemo{
	int[] arr = {1,2,3,4};
	
	public String toString(){
	return "[ "+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+" ]";
	}
}
class StringDem{
	int[] arr = {1,2,3,4};
}
