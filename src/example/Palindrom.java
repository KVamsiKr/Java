package example;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner val=new Scanner(System.in);
		System.out.println("Enter Any num");
		int actual=val.nextInt();
		int x= actual;
		int exp=0;
		int r;
	    while(x>0){
	      r=x%10;
	      exp=(exp*10)+r;
	      x=x/10;
	    } 
	    if (exp==actual){
	    	System.out.println(actual+" is a palindrom num");
	    }
	    else{
	    	System.out.println(actual+" is not a palindrom num");
	    }
	    System.out.println("bcoz expected is :"+exp);
	}

}
