package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int edad, suma=0, contadormayores=0, contador=0;
		
		System.out.println("Introduzca una edad para comenzar");
		edad = sc.nextInt();
		
		while(edad>0) {
			
			contador++;
			
			suma+=edad;
			
			if(edad>=18) {
				contadormayores++;
			}
			
			
			
		}
		
		sc.close();
	}

}
