import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		//int C = A * 4;
	    int totalBoys = A + 1; // include Chef
        int totalSlices = (totalBoys * 4) + (B * 3);

        int pizzas = (int) Math.ceil(totalSlices / 8.0);
        System.out.println(pizzas);
		
		
	}
}
