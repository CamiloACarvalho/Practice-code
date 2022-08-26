package br.com.fiap;

	import java.util.Scanner;

public class Treinamento 
{
	
	public static void main(String[] arg) 
	
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Bem vindo a calculadora básica");
		
		System.out.println ("Digite qualquer valor que deseja calcular:  ");
		float num1 = sc.nextFloat();
		
		System.out.println ("Digite o nome da operação desejada (tudo minúsculo)  ");
		String oper = sc.next();
		
		System.out.println ("Digite qualquer valor que deseja calcular:  ");
		float num2 = sc.nextFloat();
		
		
	}

}
