package example;

import java.util.Scanner;

public class StringShuffle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eente any Sentence");
		String a=sc.next();
		String [] x=a.split("z");
		System.out.println(x[1]+" "+x[2]+" "+x[0]);
		System.out.println(x[0]);
		System.out.println(x[1]);
	}

}
