package Arrays;

import java.util.Scanner;

public class peakelementinneighbours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		if ( a[0]>= a[1]) {
            System.out.println("Peak element: " + a[0]);
        }
		/* if (a[n - 1] >= a[n - 2]) {
            System.out.println("Peak element: " + a[n - 1]);
        } */
		for(int i=1;i<n-1;i++) {
			if(a[i] >=a [i-1] && a[i] >=a [i-1]) {
				System.out.println(a[i]);
			}
		}
		  
	        
		sc.close();
	}

}
