package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class ClassE {

	public static void main(String[] args) {
		
		// duplicate values
		
		int[] a = {20, 10, 50, 10, 50};  
		
		System.out.println(Arrays.toString(a));
		
		
		
		for(int i=0; i<a.length; ++i)
		{
			int count = 0;
			for(int j=i+1; j<a.length; ++j)
			{
				if(a[i] == a[j])
				{
					++count;
				}
			}
			
			System.out.println(a[i] + " repeated " + count + " times");
		}
		
		
		
		
		
		
	
	}
}
