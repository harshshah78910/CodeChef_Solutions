/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;


/* Name of the class has to be "Main" only if the class is public. */
 class Codechef
{
	 
	public static void main (String[] args) throws java.lang.Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = 1;
		
		DecimalFormat df = new DecimalFormat("#");
		
		while(testCases-- > 0)
		{
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> l = new ArrayList<Integer>();
			
			for(int i =0; i<N; i++)
				l.add(Integer.parseInt(br.readLine()));
			
			Collections.sort(l);
			
			double max = l.remove(0) * N;
			
			for(int nu : l)
			{
				max = Math.max(max, nu * (N-1));
				N = N-1;
			}
			
			System.out.println(df.format(max));
			
		}
	}

	
	
	
}
