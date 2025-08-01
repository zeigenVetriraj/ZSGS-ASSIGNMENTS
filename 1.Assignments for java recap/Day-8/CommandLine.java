
//4. Get some strings through the command-line prompt and use an array to store and display them.

public class CommandLine{

    public static void main(String[] args) {
		String[] arr = new String[args.length];
		
		for(int i=0; i<args.length; i++){
			arr[i] = args[i];
		}
		
		for(String s : arr){
			System.out.println(s);
		}
	}
	
}
