package modulo3;

import java.util.Scanner;

public class Fase1 {
	public static void main(String[] args) {
		
String city1, city2, city3, city4, city5, city6;

Scanner sc = new Scanner(System.in);

System.out.println("Introduce el nombre de la ciudad 1:");
city1 = sc.nextLine();
System.out.println("Introduce el nombre de la ciudad 2:");
city2 = sc.nextLine();
System.out.println("Introduce el nombre de la ciudad 3:");
city3 = sc.nextLine();
System.out.println("Introduce el nombre de la ciudad 4:");
city4 = sc.nextLine();
System.out.println("Introduce el nombre de la ciudad 5:");
city5 = sc.nextLine();
System.out.println("Introduce el nombre de la ciudad 6:");
city6 = sc.nextLine();

System.out.println(city1 + ", " + city2 + ", " + city3 + ", " + city4 + ", " + city5 + ", " + city6);
	}
}
