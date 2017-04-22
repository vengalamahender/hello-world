package main;

public class LinearSearch {
public static int linearsearch(int[] array,int key){
	for (int i=0;i<array.length;i++)
		{
		if(key==array[i])
			return i;
		}
	return-1;
}

}






