package example;

import java.util.Scanner;

public class CheckGivenFactorialNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int x=sc.nextInt();
		int sum=1;
		for (int i=x;i>0;i--){
			sum=sum*i;
		}
		System.out.println(sum);
	}
}

