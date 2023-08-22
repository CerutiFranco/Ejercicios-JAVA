package ejerciocio3;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		int numero;
		boolean primo;
		do {
			primo=false;
			System.out.print("Ingrese un numero");
			
			numero=sc.nextInt();
			
			for(int i=1; i*i<=numero;i++) {
				if(numero % i==0) {
					primo=false;
				}
			}
		}while(numero<=100 || primo==false);
		
		sc.close();
	}
	
}
