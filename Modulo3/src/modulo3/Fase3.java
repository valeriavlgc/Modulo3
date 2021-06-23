package modulo3;

import java.util.ArrayList;
import java.util.Collections;

public class Fase3 {

	public static void main(String[] args) {
String city1 = "Barcelona", city2 = "Madrid", city3 = "Cuenca", city4 = "Santander", city5 = "Huesca", city6 = "Sevilla";

char[] ciutat1 = city1.toCharArray();
char[] ciutat2 = city2.toCharArray();
char[] ciutat3 = city3.toCharArray();
char[] ciutat4 = city4.toCharArray();
char[] ciutat5 = city5.toCharArray();
char[] ciutat6 = city6.toCharArray();

ArrayList<String> arrayCiutatsModif = new ArrayList<String>();

	for(int i = 0; i < ciutat1.length ; i++) {
		if (ciutat1[i] == 'a') {
			ciutat1[i] = '4';
		}
    }
	
	String ciudad1 = String.valueOf(ciutat1);
	arrayCiutatsModif.add(ciudad1);
	
	for(int i = 0; i < ciutat2.length ; i++) {
		if (ciutat2[i] == 'a') {
			ciutat2[i] = '4';
		}
    }
	
	String ciudad2 = String.valueOf(ciutat2);
	arrayCiutatsModif.add(ciudad2);
	
	for(int i = 0; i < ciutat3.length ; i++) {
		if (ciutat3[i] == 'a') {
			ciutat3[i] = '4';
		}
    }
	
	String ciudad3 = String.valueOf(ciutat3);
	arrayCiutatsModif.add(ciudad3);
	
	for(int i = 0; i < ciutat4.length ; i++) {
		if (ciutat4[i] == 'a') {
			ciutat4[i] = '4';
		}
    }
	
	String ciudad4 = String.valueOf(ciutat4);
	arrayCiutatsModif.add(ciudad4);
	
	for(int i = 0; i < ciutat5.length ; i++) {
		if (ciutat5[i] == 'a') {
			ciutat5[i] = '4';
		}
    }
	
	String ciudad5 = String.valueOf(ciutat5);
	arrayCiutatsModif.add(ciudad5);
	
	for(int i = 0; i < ciutat6.length ; i++) {
		if (ciutat6[i] == 'a') {
			ciutat6[i] = '4';
		}
    }
	
	String ciudad6 = String.valueOf(ciutat6);
	arrayCiutatsModif.add(ciudad6);

Collections.sort(arrayCiutatsModif);	


    for(String ciudad : arrayCiutatsModif) {
    	System.out.println(ciudad);
    }

	}

}


