package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, contador=0, suma=0, contador0=0;
		double media=0, contadorneg=0;
		
		while(contador<11) {
			System.out.println("Introduzca un numero");
			num = sc.nextInt();
			
			if(num==0) {
				contador0++;
			}else if(num>0) {
				suma+=num;
			}else {
				media+=num;
				contadorneg++;
			}
			contador++;
		}
		
		System.out.println("La suma de los numeros positivos es "+suma);
		System.out.println("La media de los numeros negativos es "+(media/contadorneg));
		System.out.println("Se han introducido "+contador0+" ceros");
		
		sc.close();
	}

}
