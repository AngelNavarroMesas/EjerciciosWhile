package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, suma=0;
		
		System.out.println("Introduzca un numero positivo para hacer una suma o introduzca un numero negativo para terminar");
		num = sc.nextInt();
		
		while(num>=0) {
			
			suma+=num;
			
			
			System.out.println("Introduzca un numero positivo para añadirlo a la suma o uno negativo para terminar");
			num= sc.nextInt();
		}
		
		System.out.println("El resultado de la suma es "+suma);
		
		sc.close();
	}

}
