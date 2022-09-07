package com.java;

public class Conta 
{
// Uma classe pode não ter atributos, assim também como pode ter um ou vários atributos
// Criamos dois atributos em comum, tanto para conta corrente, quanto para conta poupança...
	
	int numero; 
	double saldo;
	
// Agora vou usar uma subclasse aqui. Para isso, basta eu declarar a classe cliente e dar um nome a ela
	
	Cliente cliente = new Cliente();
	
	
}
