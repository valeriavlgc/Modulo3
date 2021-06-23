package modulo3;
import java.util.ArrayList;
import java.util.Collections;
public class Fase2 {


	
	public static void main(String[] args) {

String city1 = "Barcelona", city2 = "Madrid", city3 = "Cuenca", city4 = "Santander", city5 = "Huesca", city6 = "Sevilla";

ArrayList<String> arrayCiutats = new ArrayList<String>();

arrayCiutats.add(city1);
arrayCiutats.add(city2);
arrayCiutats.add(city3);
arrayCiutats.add(city4);
arrayCiutats.add(city5);
arrayCiutats.add(city6);

Collections.sort(arrayCiutats);

for (String ciutat : arrayCiutats) {
	System.out.println(ciutat);
}

	}

}
