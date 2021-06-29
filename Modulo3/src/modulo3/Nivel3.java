package modulo3;

import java.util.*;

public class Nivel3 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce un número");
int num = sc.nextInt();
			
fibonacci(num);
    }

public static void fibonacci(int num) {
	int i = 0;
    ArrayList<Integer> fibonacci = new ArrayList<Integer>();
   
   
   for (i = 0; i < num; i++) {
	   if (i == 0) {
		   fibonacci.add(i);
	   } else if (i == 1) {
		   fibonacci.add(i);
	   } else {
		   fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
       }
   }

   	  System.out.println(fibonacci);	
}

}


