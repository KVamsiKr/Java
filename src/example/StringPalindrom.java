package example;

public class StringPalindrom {
	
	public static void main(String[] args) {
		String x="hello how woho lleh";
		System.out.println(x);
		System.out.println(x.length());
		String [] y = x.split(" ");
		String z=y[0]+y[1]+y[2]+y[3];
		System.out.println(z);
		String a="";
		for(int i=x.length()-1;i>=0;i--){
			a=a+x.charAt(i);
		}
		System.out.println(a);
		String [] b = a.split(" ");
		String c=b[0]+b[1]+b[2]+b[3];
		System.out.println(c);
		if (c.equals(z)){
			System.out.println(x+" --> is a palindrom");
		}

	}

}
