package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int altura=0, mayoralt=0;
		
		while(altura!=-1) {
			
			System.out.println("Introduzca la altura de un arbol, o introduzca -1 para terminar");
			altura = sc.nextInt();
			
			mayoralt=altura>mayoralt?mayoralt=altura:mayoralt;
			
		}
		
		System.out.println("El arbol mas grande mide "+mayoralt+"cm");
		
		sc.close();
	}

}
