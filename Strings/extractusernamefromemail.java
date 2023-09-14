package Strings;

import java.util.Scanner;

public class extractusernamefromemail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String username="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '@') {
				break;
			} else {
				username+=str.charAt(i);
			}
		}
		System.out.println(username);
		sc.close();
	}
	}


