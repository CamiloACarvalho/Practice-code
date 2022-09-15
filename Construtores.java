package com.java;

public class Construtores 
{
	private int numero;
	private double saldo;
	
	// Na hora de rodar, vai dar um erro, porque uma vez declarado qualquer construtor de classe, o construtor padrão passa a não valer mais
	// Para usar o construtor padrão, devo ir na minha classe e declarar o construtor padrão
	// Para declarar esse construtor padrão é simples:
	
	public Construtores ()	
	{
		//OBESERVE QUE AGORA TEREI DOIS CONSTRUTORES
		//ESTE QUE É PADRÃO
		//E O PROXIMO QUE É CONSTRUTOR DE CLASSE QUE RECEBE DOIS PARÂMETROS
	}
	
	//	Criando um construtor:
	// 1) eu coloco um modificador que é público
	// 2) e eu coloco o nome da classe como sendo o nome do construtor (neste caso o nome da classe já vem lá em cima em: "public class")
	// *Posso trabalhar parâmentros dentro do construtor - dentro do parênteses
	// esses parâmetros são o número da conta e respectivo saldo
	
	public Construtores (int numero, double saldo)
	{
		//	Agora vou inserir a lógica necessária de construção deste objeto
		//	Neste caso eu quero trabalhar com número e a conta recebidos do construtor para dentro da estrutura deste objeto
		//	Então eu vou atribuir ao número daquela conta o número de que veio de parâmetro
		
		this.numero = numero;
		
		//	Então eu vou atribuir ao saldo daquela conta o saldo de que veio de parâmetro
		
		this.saldo = saldo; 
	}
	
	public double recuperarsaldo()
	{
		return saldo;
	}
	public void depositar (double valor)
	{
		saldo = saldo + valor;
	}
	public void setNumero (int numero)
	{
		this.numero = numero;
	}
	public int getNumero()
	{
		return numero;
	}
}
