package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num, suma=0, contador=0;
		
		System.out.println("Introduzca un numero positivo para hacer una suma o introduzca un numero negativo para terminar");
		num = sc.nextDouble();
		
		while(num>=0) {
			
			suma+=num;
			
			contador++;
			
			System.out.println("Introduzca un numero positivo para añadirlo a la suma o uno negativo para terminar");
			num= sc.nextDouble();
		}
		
		System.out.println("La media de esos numeros es "+(suma/contador));
		
		sc.close();
	}

}
