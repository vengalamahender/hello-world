package assinments2;


	import java.lang.Math;
	 
	public class prime {
	    public static int[] primeFactors(int n)
	    {
	    	int[] primeFactors = new int[3];
	    	int index = 0;
	        while (n%2==0)
	        {
	            System.out.print(2 + " ");
	            n /= 2;
	            primeFactors[index] = 2;
	            index++;
	        }
	        for (int i = 3; i <= Math.sqrt(n); i+= 2)
	        {
	            while (n%i == 0)
	            {
	                System.out.print(i + " ");	                
	                primeFactors[index] = i;
	                index++;
	                n /= i;
	            }
	        }
	        if (n > 2){
	            System.out.print(n);
	            primeFactors[index] = n;
	            index++;
	        }
	        return primeFactors;
	    }
	    }
	
