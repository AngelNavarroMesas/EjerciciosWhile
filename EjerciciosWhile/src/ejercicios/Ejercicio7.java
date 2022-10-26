package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numsec, numusu=200, surrender=0;
		
		
		numsec = (int) (Math.random()*100);
		
		while(numsec!=numusu||surrender!=1) {
			
			System.out.println("Adivina el numero entre 1 y 100");
			numusu= sc.nextInt();
			
			if(numusu>numsec) {
				System.out.println("Error. El numero secreto es menor");
			}else if(numusu<numsec&&numusu>0) {
				System.out.println("Error. El numero secreto es mayor");
			}else if(numusu==numsec){
				System.out.println("Enhorabuena, has acertado");
				surrender=1;
			}else if(numusu==-1) {
				System.out.println("Te has rendido");
				surrender=1;
				numsec=numusu;
			}
			
		}
		
		sc.close();
	}

}
