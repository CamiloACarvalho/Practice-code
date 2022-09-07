package com.java;

public class TesteConta 
{
//para escrever um comentário CTRL+/
	
//Para agilizar o processo, uma forma rápida de inserir o MAIN
//é: MAIN+CTRL+ESPAÇO
	
		public static void main(String[] args) 
		
		{
//Vamos criar classes agora. Ela fica dentro de main
			
			Conta contaCorrente = new Conta ();
			
// 1) Conta é a classe criada
// 2) contaCorrente é o nome dessa classe
// 3) O comando NEW do java ele é resposável por gerar um objeto em memória
// isso significa que ele vai pegar as referências da classe conta e vai gerar em  memória um objeto com aquelas características 
// 4) contaCorrente nada mais é do que uma nova varíável, que é do tipo de dado Conta.	
			
			Conta contaPoupança = new Conta ();
			
			Conta contaInvestimento = new Conta ();
			
// Agora temos 3 variáveis dentro de Conta
			
// Vou atribuir os atributos criados na classe CONTA.
			
			contaCorrente.numero = 11;
			contaCorrente.saldo = 20.5;
// Agora aqui, vou associar um cliente para cada tipo de conta, veja:
			contaCorrente.cliente.nome = "Camilo";
			contaCorrente.cliente.idade = 32;
// Veja, aqui linkamos a conta corrente, a um cliente, como um nome e idade. Tudo separados por pontos.
			
			contaPoupança.numero = 22;
			contaPoupança.saldo = 30.26;
// O mesmo será feito aqui. Atribuiremos um cliente para cada conta
			contaPoupança.cliente.nome = "Cidinha";
			contaPoupança.cliente.idade = 65;
			
			contaInvestimento.numero = 33;
			contaInvestimento.saldo = 13.65;
			contaInvestimento.cliente.nome = "Geizianne";
			contaInvestimento.cliente.idade = 25;
			
// A diferença entre atributo e variável é que o atributo está declarado dentro do scopo da classe (ou seja é uma caracterização daquela classe
// já as variáveis é utilizada dentro dos métodos para fazer uma lógica.
			
// Podemos usar uma classe dentro de outra classe. Para isso, precisamos do princípio de hierarquia
			
// Para testar agora, vamos imprimir as informações
	
// Para agilizar, digite "sysout"+CTRL+ESPAÇO
			System.out.println(contaCorrente.numero);
			System.out.println(contaCorrente.saldo);
			System.out.println(contaCorrente.cliente.nome);
			System.out.println(contaCorrente.cliente.idade);
			
		}
}
