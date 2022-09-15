package com.java;

public class TesteContaConstrutores 
{
	
	public static void main(String[] args) 
	
	{
		Construtores cons = new Construtores(1000, 50.0);
		
		//Ao clicar na coluna ao lado e marca-la com esse pontinho azul, break point
		//a execucação do programa, ele vai rodar até aquele ponto.
		
		System.out.println(cons.recuperarsaldo());
		
	}
}
