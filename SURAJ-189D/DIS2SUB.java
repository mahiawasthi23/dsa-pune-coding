import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0) {
		    int N = sc.nextInt();
		    int[] A = new int[N];
		    
		 for(int i = 0; i <N ; i++) {
		     A[i] = sc.nextInt();
		 }
		 
		 int minLength = Integer.MAX_VALUE;
		 
		 
		 for(int i = 0; i < N; i++) {
		     Set<Integer> set = new HashSet<>();
		     for(int j = i; j < N; j++){
		         set.add(A[j]);
		         
		         if(set.size() > 2) break;
		         
		         if(set.size() == 2) {
		             minLength = Math.min(minLength, j - i + 1);
		         }
		     }
		 }
		 
		 if (minLength == Integer.MAX_VALUE) {
		     System.out.println(-1);
		 } else {
		     System.out.println(minLength);
		 }
		}
	}
}
