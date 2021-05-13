public class amstrong {
	public static void main(String[] args) {
		int a=0,b,temp;
		int n=220;
		temp=n;
		while(n>0) {
			b=n%10;
			a=a+(b*b*b);
			n=n/10; 			
		}
		if(temp==a) {
			System.out.println("amstrong number");
		}
		else {
			System.out.println("Not amstrong number");
		}
	}
}
