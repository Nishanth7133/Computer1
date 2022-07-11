package org.computer;

public class Addf {
public static void main(String[] args) {
	char a='A';
	int b = (int)a;
	char c = (char)(b+1);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	char a1=' ';
	char a2=' ';
	System.out.println(a1+a2);
	String s1 = "java";
	String s2 = "java";
	String s3 = new String("java");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1==s3);
	System.out.println(s2.equals(s3));
	
	
}
}
