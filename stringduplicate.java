package assinments2;
public class stringduplicate {
	

public static String removedup(String s) 
{         
   
   int i;
   int j;
   String rdup = "";
for (i = 0; i< s.length(); i++) {
       int count = 1;

       for (j = i+1; j < s.length(); j++) {
           if (s.charAt(i) == s.charAt(j)) {
                count++;
           }
       }
       if (count == 1){
           rdup += s.charAt(i);
       }
   } 
     //  System.out.print(rdup);
   System.out.println();
   return rdup;
}}