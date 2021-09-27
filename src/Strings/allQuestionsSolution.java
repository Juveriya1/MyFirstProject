package Strings;

public class allQuestionsSolution {

	public static void main(String[] args) {
		//1.Different ways creating a string
		String s1="Jala";					//creating string by string literal    
		String s2=new String("Tech");		//creating string by new keyword
		
		//2.Concatenating two strings using + operator
		String concat=s1+" "+s2;
		System.out.println(concat);
		
		//3.Finding the length of the string
		int len=concat.length();
		System.out.println("length of the string is "+len);
		
		//4.Extract a string using Substring
		System.out.println(concat.substring(2,4));
		
		//5.Searching in strings using indexOf()
		System.out.println(s2.indexOf('T'));
		
		//6.Matching a String Against a Regular Expression With matches()
		String str="JalaTechnolgy.com";
		System.out.println(str.matches(".*"));
		
		//7.Comparing strings using the methods equals()
		String str1="Hello";
		String str2="World";
		System.out.println(str1.equals(str2));
		
		//8.equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
		String s3="jala tech";
		System.out.println(concat.equalsIgnoreCase(s3));
		System.out.println(s3.startsWith("ja"));
		System.out.println(s3.endsWith("chlogy"));
		System.out.println(s1.compareTo(s2));
		
		//9.Trimming strings with trim()
		String s="    Hello     ";
		System.out.println(s.trim());		//it will trim both right&left side spaces
		
		//10.Replacing characters in strings with replace()
		System.out.println(s3.replace('j', 'J'));
		
		//11.Splitting strings with split()
		System.out.println(str.split(".com"));
		
		//12.Converting Numbers to Strings with valueOf()
		int a=10;
		String ch=String.valueOf(a);
		System.out.println("integer value converted using valueOf and now output will be in string="+ch);
		
		//13.Converting integer objects to Strings
		//1.using valueOf()
		//2.using toString()
		String chang=Integer.toString(a);
		System.out.println(chang);
		
		//14.Converting to uppercase and lowercase
		String up="HELLO";
		String low="world";
		System.out.println(up.toLowerCase());
		System.out.println(low.toUpperCase());
		

	}

}
