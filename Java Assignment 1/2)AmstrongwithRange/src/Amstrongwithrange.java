public class Amstrongwithrange {
	public static void main(String[] args) {
		int i=100,b,a,n,temp;
        System.out.println("Amstrong Numbers between 100 to 999:");
        while(i<1000) {
        	n=i;
        	a=0;
        	while(n>0) {
    			b=n%10;
    			a=a+(b*b*b);
    			n=n/10; 			
    		}
        	if(a==i)
        		System.out.println(i);
        	i++;
        }
	}
}
