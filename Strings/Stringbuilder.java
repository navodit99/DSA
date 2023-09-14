package Strings;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder("Tony");
		StringBuilder sb1=new StringBuilder("Navodit ");
		System.out.println(sb);
		
		// char at index
		System.out.println(sb.charAt(0));
		System.out.println(sb.charAt(3));
		
		// set char at index
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		//insert char at index
		sb.insert(0, "S");
		sb.insert(3, "n");
		sb1.insert(8, "Nain");
		System.out.println(sb);
		System.out.println(sb1);
		
		// delete char at index
		sb.delete(3, 4);
		System.out.println(sb);
		sb1.delete(8, 12);
		System.out.println(sb1);
		
		// append
		sb1.append(""); 
		sb1.append("N");
		sb1.append("a");
		sb1.append("i");
		sb1.append("n");
		System.out.println(sb1);
		System.out.println(sb1.length());
		// without String builder 
		// str = str + "";
		// str = str + "N";
		// str = str + "a";
		// str = str + "i";
		// str = str + "n";
		// everytime it will create a new string unlike StringBuilder which modifies the same String 
	}

}
