package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc=new Scanner(System.in);
		int numero1,numero2;
		int caso;
		int caso2;
		int res=0;
		int numero3;	
		
			
			System.out.println("Elija una opcion");
			System.out.println("1-SUMAR");
			System.out.println("2-RESTAR");
			System.out.println("3-MULTIPLICAR");
			System.out.println("4-DIVIDIR");
			caso=sc.nextInt();
			System.out.println("Ingrese el primer numero");
			numero1=sc.nextInt();
			System.out.println("Ingrese el segundo numero");
			numero2=sc.nextInt();
			switch(caso)
			{
				case 1:
				res=numero1+numero2;	
				System.out.println("El resultado es "+res);
				break;
				
				case 2:
				res=numero1-numero2;
				System.out.println("El resultado es "+res);
				break;
				
				case 3:
				res=numero1*numero2;
				System.out.println("El resultado es "+res);
				break;
				
				case 4:
				res=numero1/numero2;
				System.out.println("El resultado es "+res);
				break;
			}
			do
			{
				System.out.println("Que quiere hacer con el resultado");
				System.out.println("1-SUMAR");
				System.out.println("2-RESTAR");
				System.out.println("3-MULTIPLICAR");
				System.out.println("4-DIVIDIR");
				System.out.println("Ingrese 0 si quiere salir");
				caso2=sc.nextInt();			
				if(caso2==0)
				{
				break;
				}
				System.out.println("Por que Numero?");
				numero3=sc.nextInt();
				switch(caso2)
				{
				case 1:
					res=res+numero3;	
					System.out.println("El resultado es "+res);
					break;
			
				case 2:
					res=res-numero3;	
					System.out.println("El resultado es "+res);
					break;
			
				case 3:	
					res=res*numero3;	
					System.out.println("El resultado es "+res);
					break;
			
				case 4:	
					res=res/numero3;	
					System.out.println("El resultado es "+res);
					break;	
			}
			
			}while(caso2!=0);
			sc.close();
	}

}
