package modulo3;

import java.util.ArrayList;
import java.util.Collections;

public class Fase3 {

	public static void main(String[] args) {
String city1 = "Barcelona", city2 = "Madrid", city3 = "Cuenca", city4 = "Santander", city5 = "Huesca", city6 = "Sevilla";
String nombre, nuevoNom;
ArrayList<String> arrayCiutats = new ArrayList<String>();

arrayCiutats.add(city1);
arrayCiutats.add(city2);
arrayCiutats.add(city3);
arrayCiutats.add(city4);
arrayCiutats.add(city5);
arrayCiutats.add(city6);

ArrayList<String> arrayCiutatsModif = new ArrayList<String>();

	for(int i = 0; i < arrayCiutats.size(); i++) {
		nombre = arrayCiutats.get(i);
		nuevoNom = nombre.replace('a', '4');
		arrayCiutatsModif.add(nuevoNom);
	}

Collections.sort(arrayCiutatsModif);	


    for(String ciudad : arrayCiutatsModif) {
    	System.out.println(ciudad);
    }

	}

}


