package example;

import java.util.Scanner;

public class ReverseAgivenNum {

	public static void main(String[] args) {
		Scanner val=new Scanner(System.in);
		System.out.println("Enter Any num");
		long x=val.nextLong();
		long sum=0;
		long r;
	    while(x>0){
	      r=x%10;
	      sum=(sum*10)+r;
	      x=x/10;
	    }
	      System.out.println(sum);
	}

}
