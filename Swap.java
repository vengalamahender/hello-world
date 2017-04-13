package assinments2;

public class Swap {

public  int[] Swapmethod (int a ,int b){
	
	System.out.println("the value of swapping a: " +a+ " b:" +b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("result after swaping  a: " +a+ " b:" +b);
	int[] swappedNumbers  = new int[2];
	swappedNumbers[0]=a;
	swappedNumbers[1] = b;
	return swappedNumbers;	
} 

}