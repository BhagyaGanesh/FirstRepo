package mavenpackageone;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Meera";
		String s1 = new String("Welcome");
		System.out.println(s);
		System.out.println(s1);
		char arr[]= {'a','b','c','d'};
		String s3= new String(arr);// converting char array to string
		System.out.println(s3);
		//length
		System.out.println(s.length());
		//charAt -to get character in a string at a particular index
		char c=s.charAt(3);
		System.out.println(c);
		//concat- two combine
		System.out.println(s.concat(s1));
		System.out.println(s.concat(" "+s1));
		System.out.println(s.concat(" Hey"));
		//contains- to check if there is anything inside string
		String a="My name is meera";
		System.out.println(a.contains("name"));
		System.out.println(a.contains("Mike"));
		
		String b="java";
		String d="java";
		String e="Java";
		String g="selenium";
		//equals
		System.out.println(b.equals(d));
		System.out.println(b.equals(e));
		System.out.println(e.equals(g));
		//equalsignorecase- to ignore case
		System.out.println(b.equalsIgnoreCase(e));
		//touppercase
		System.out.println(s.toUpperCase());
		//tolowercase
		System.out.println(s.toLowerCase());
		//isempty -to check if it is empty or not
		String h=" ";
		System.out.println(h.isEmpty());
		//valueof- to convert any datatype value to string
		int i=5;
		String m=String.valueOf(i);
		System.out.println(m);
		//== operator to compare
		System.out.println(b==d);
		String k=new String("java");
		System.out.println(b==k);
		System.out.println(b.equals(k));
	}

}
