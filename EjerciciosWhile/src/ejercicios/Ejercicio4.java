package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, resultado;
		
		System.out.println("Introduzca un numero para empezar o ponga 0 para terminar");
		num = sc.nextInt();
		
		while(num!=0) {
			
			resultado = num%2;
			
			if(resultado==0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			}
			
			System.out.println("Introduzca un numero para comenzar de nuevo o 0 para terminar");
			num = sc.nextInt();
		}
		System.out.println("Finalizado");
		
		
		sc.close();
	}

}
