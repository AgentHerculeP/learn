import java.util.*;

public class practise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	    
		int[] arr=new int[args.length];
		int i=0;
	    while(sc.hasNext()) {
	    	arr[i]=sc.nextInt();
	    	i++;
	    	System.out.print(sc.nextInt()+" ");
	    }
	    
	
		System.out.println("*** Initial Array ***");
		
		System.out.println("*** Max number in array ***");
		System.out.println(findMaxIntInArray(arr));
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<intArray.length;i++) {
			if(max<intArray[i]) {
				max=intArray[i];
			}
		}
		return max;
	}

}
