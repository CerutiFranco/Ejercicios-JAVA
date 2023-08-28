package CadenaDeCaracteres2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc=new Scanner(System.in);
		int cont=0;
		System.out.println("ingrese una palabra");
		var palabra=sc.nextLine();
		for(var i=0;i<palabra.length();i++)
		{
			if(palabra.charAt(i)=='a' || palabra.charAt(i)=='e' || palabra.charAt(i)=='i' || palabra.charAt(i)=='o' || palabra.charAt(i)=='u')
			{	
				 cont++;
			}
		}
		System.out.println("La palabra tiene " + cont + " vocales");
		
		sc.close();
	}

}
