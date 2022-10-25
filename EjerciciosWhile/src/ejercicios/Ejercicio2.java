package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, contador=0;
		
		System.out.println("Introduzca un numero positivo para hacer un contador o introduzca un numero negativo para terminar");
		num = sc.nextInt();
		
		while(num>=0) {
			
			contador++;
			
			System.out.println("Introduzca un numero positivo para añadirlo al contador o uno negativo para terminar");
			num= sc.nextInt();
		}
		
		System.out.println("El usuario ha introducido "+contador+" numeros positivos");
		
		sc.close();
	}

}
