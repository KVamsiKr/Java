package example;

import java.util.Scanner;

public class CheckPrimeNO {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter any Num");
		int y = x.nextInt();
		int temp=0;
		for(int i=2;i<=(y-1);i++){
			if(y%i==0){
				temp=temp+1;
			}
		}
			if(temp==0){
				System.out.println(y+" is a prime number");
			}
			else{
				System.out.println(y+" is not a prime number");
		}

	}

}
