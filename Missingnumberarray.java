package assinments2;

public class Missingnumberarray {
		 
		public static  int[] Findnumber(int[] number){
		int k[] = new int[number[number.length-1]];
		        
		  int m=0;
		 
		  if(number[0]!=1){
		   for (int x = 1; x < number[0]; x++) {
		       k[m] =  x;
		       m++;
		       }
		  }
		        
		 for (int i = 0; i < number.length -1; i++) {
		    
		    int j = i+1;
		    int difference = number[j] - number[i] ;
		   if(difference != 1 ){
		  for (int x = 1; x < difference; x++) {
		 
		          k[m] = number[i] + x;
		           m++;
		    
		}
		            
		 }
		 }
		        
		System.out.println("missing numbers in array ::");
		        
		for (int l = 0; l < m ; l++) {
		    System.out.println( k[l]+" ");
		}
		return k;
		}
		}
		

