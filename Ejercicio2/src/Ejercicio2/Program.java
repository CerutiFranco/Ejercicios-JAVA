package Ejercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc= new Scanner(System.in);
		do
		{
		System.out.print("Ingrese un numero del 50 al 100");
		numero = sc.nextInt();
		
		
		}while(numero<50 || numero>100);
	}

}
