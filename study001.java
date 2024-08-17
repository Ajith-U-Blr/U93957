package myFirst;
import java.util.stream.*; 


public class study001 {
	
	static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count)
	 {    
	    if(count>0)
	    {    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    	
	    }

	 static void printPyramid()
	 {
		 char last = 'E', alphabet = 'A';

		    for (int i = 1; i <= (last - 'A' + 1); ++i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print(alphabet + " ");
		      }
		      ++alphabet;

		      System.out.println();
	 }
		    }
	 public static void main(String args[]){    
		  int count=10;    
		  //System.out.print(n1+" "+n2);//printing 0 and 1    
		 // printFibonacci(count-2);//n-2 because 2 numbers are already printed  
		  printPyramid();
		 }  
}
