package example;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Num");
		int j=sc.nextInt();
		//for(int j=1;j<=5;j++){
		 for(int i=1;i<=10;i++){
			int y=j*i;
			System.out.println(j+"*"+i+"="+y);
		 //}
	   }
	}
}
