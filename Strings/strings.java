package Strings;

import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//String name=sc.next(); to take input of single word
		
		System.out.println("enter name: ");
		String name=sc.nextLine();
		System.out.println(name);
		
		//concatination
		System.out.println("enter first name: ");
		String fname=sc.nextLine();
		System.out.println("enter last name: ");
		String lname=sc.nextLine();
		String fullname= fname + " " + lname;
		System.out.println("fullname is: " + fullname);
		
		 
		
		//length of string
		System.out.println("length of string is: " + fullname.length());
		
		//charAt
		for(int i=0;i<fullname.length();i++) {
			System.out.print(fullname.charAt(i) + " "); //goes to position of full name starting from 0 and print
			
		}
		System.out.println();
		
		// compareTo
		if (name.compareTo(fname) == 0) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
		
		String i="hello";
		String j="wello";
		if(i.compareTo(j)>0) {
			System.out.println("hello is greater");
		} {
            System.out.println("wello is greater");
        }
		
		// "==" operator 
		if(name==fname) {
			System.out.println("strings are equal");
		} else {
			System.out.println("not equal");
		} // fails in most test cases because String are objects in java unlike other primitive data types
		
		// another example of "==" operator
		if(new String("tony")==new String("tony")) {
			System.out.println("strings are equal"); 
		} else {
			System.out.println("not equal"); 
		}
		
		//substrings
		
		String sentence="My name is Navodit";
		// substring(beg index, end index)
		String name2=sentence.substring(11,sentence.length());
		String name3=sentence.substring(0,11);
		String name4=sentence.substring(11);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		// parseint
		String str="123";
		int num=Integer.parseInt(str);
		System.out.println(num);
		
		//to string
		int number=123;
		String strr=Integer.toString(number);
		System.out.println(strr);
		
		
		
		sc.close();
	}

}
