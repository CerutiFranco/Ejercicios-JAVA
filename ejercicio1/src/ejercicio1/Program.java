package ejercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc = new Scanner (System.in);
		do
		{
		System.out.print ("Ingrese un numero del 1 al 100");
		numero = sc.nextInt();
		}while(numero>100);
			
		if(numero%2==0)
		{
		System.out.print(numero);
		}
		else
		{
			System.out.print("El numero es impar");
		}
	}

}
