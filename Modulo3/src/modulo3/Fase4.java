package modulo3;

import java.util.ArrayList;

public class Fase4 {

	public static void main(String[] args) {

String city1 = "Barcelona", city2 = "Madrid", city3 = "Cuenca", city4 = "Santander", city5 = "Huesca", city6 = "Sevilla";

char[] ciutat1 = new char[city1.length()];
char[] ciutat2 = new char[city2.length()];
char[] ciutat3 = new char[city3.length()];
char[] ciutat4 = new char[city4.length()];
char[] ciutat5 = new char[city5.length()];
char[] ciutat6 = new char[city6.length()];


		for(int i = city1.length() - 1; i >= 0  ; i--) {
			ciutat1[i] = city1.charAt(i);
			System.out.print(city1.charAt(i));
		}
		    System.out.println();
		for (int i = city2.length() - 1; i >= 0 ; i--) {
			ciutat2[i] = city2.charAt(i);
			System.out.print(city2.charAt(i));
		}	
		    System.out.println();
		for (int i = city3.length() - 1; i >= 0; i--) {
			ciutat3[i] = city3.charAt(i);
			System.out.print(city3.charAt(i));
		}
		    System.out.println();
		for (int i = city4.length() - 1; i >= 0; i--) {
			ciutat4[i] = city4.charAt(i);
			System.out.print(city4.charAt(i));
		}
		    System.out.println();
		for (int i = city5.length() - 1; i >= 0; i--) {
			ciutat5[i] = city5.charAt(i);
			System.out.print(city5.charAt(i));
		} 
		    System.out.println();
		for (int i = city6.length() - 1; i >= 0; i--) {
			ciutat6[i] = city6.charAt(i);
			System.out.print(city6.charAt(i));
		}
		    System.out.println();

//Opción Collections.reverse();		    
	}

}


