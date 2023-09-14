package Strings;

import java.util.Scanner;

public class combinedlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int n=sc.nextInt();
		//sc.nextLine();
		String[] array=new String[n];
		int l=0;
		for(int i=0;i<n;i++) {
			array[i]=sc.next();
			l+=array[i].length();
			}
			System.out.println(l);
			sc.close();
		}
	}
