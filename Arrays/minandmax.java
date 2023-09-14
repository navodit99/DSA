package Arrays;

import java.util.Scanner;

public class minandmax {
	
	static int findmin(int[] arr,int n) {
		int min=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min = arr[i];
				
			}
			
		}
		return min;
	}
		static int findmax(int[] arr,int n) {
			
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
		
			} 
		} 
		return max;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(findmin(arr,n) + " ");
		System.out.print(findmax(arr,n));
		sc.close();
	}

}
