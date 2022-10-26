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
			
			System.out.println("Añada la edad de otro alumno o ponga un numero negativo para terminar");
			edad = sc.nextInt();
			
		}
		
		
		System.out.println("Suma total de todas las edades: "+suma+" años");
		System.out.println("Edad media: "+suma/contador+" años");
		System.out.println("Numero de alumnos: "+contador);
		System.out.println("Alumnos mayores de edad: "+contadormayores);
		
		sc.close();
	}

}
