package example;

public class Fibbonicseries {

	public static void main(String[] args) {
		int a=6;
		int b=7;
		int c=a+b;
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		while(c<150){
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+" ");
		}

	}

}
