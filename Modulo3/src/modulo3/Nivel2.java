package modulo3;

import java.util.Scanner;

public class Nivel2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i=0, j;
float  notaMedia, nota;
float[][] notasAlum = new float[3][5];

	do {
		
		 
		for (j= 0; j < 3; j++) {
			
			//control valor entre 0 y 10. Poner un if con un mensaje de error si se introduce número erroneo?
			do {
				System.out.println("Introduce la nota " + (j+1) + " del alumno " + (i+1) + "." );
		        nota = sc.nextFloat();
			} while(nota < 0 || nota > 10);
			  	
			   notasAlum[j][i] = nota;
		}
		
		System.out.println("****Nuevo alumno****");
		i++;
			
	} while(i < 5);

	
	for (i = 0; i < 5; i++ ){
         
		notaMedia = (notasAlum[0][i] + notasAlum[1][i] + notasAlum[2][i])/3;
				
		if (notaMedia >= 5) {
			System.out.printf("El alumno "+ (i+1) +  " ha aprobado. Su nota media es " + "%1.2f", + notaMedia);
			System.out.println();
		} else {
			System.out.printf("El alumno "+ (i+1) +  " ha suspendido. Su nota media es " + "%1.2f", + notaMedia);
			System.out.println();
		}
	}
			
		


	}

}
