
/*
5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }
*/
public class EqualArray{
	public static void main(String[] args){
		int[] X = {'m','n','o','p'};
		int[] Y = {'m','n','o','p'};
		
		boolean isSame = true;
		
		//check if two has same length
		if(X.length != Y.length){
			isSame = false;
		}else{
			for(int i=0; i<X.length; i++){
				if(X[i]!=Y[i]){
					isSame = false;
					break;
				}
			}
		}
		
		//printing if same or not
		if(isSame) System.out.print("Both of the Array's are Same");
		else System.out.print("Two Different Arrays");
	}
	
}