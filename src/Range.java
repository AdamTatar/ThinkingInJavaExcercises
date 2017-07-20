
public class Range {
	public static int[] range(int n){
		int[] result = new int[n];
		for(int i = 0; i<n; i++)
			result[i]=i;
		return result;		
	}

	public static int[] range(int start, int end){
		int[] result = new int[end - start];
		for(int i = 0; i<end - start; i++)
			result[i]=start + i;
		return result;		
	}


public static void main(String args){
	System.out.println(range(20));
	System.out.println(range(10,20));
}
}