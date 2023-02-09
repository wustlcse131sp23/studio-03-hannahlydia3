package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the highest number in the range?");
		
		int maxValue = scan.nextInt();
		int i,j;
		boolean[] range = new boolean [maxValue];
			for(i=0; i<maxValue; i++)
			{range[i] = true;
			}
		
		for (i=2; i<= Math.pow(maxValue, 0.5); i++)
		{if (range[i])
		{j = (int) Math.pow(i,2);
		for (; j < maxValue; j = j+i)
		{range[j] = false;	
		}
		}
		}
		
		for (i=2; i<maxValue; i++)
		{if (range[i])
		{System.out.println(i );			
		}
				
		}
	}

}
