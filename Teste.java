package br.com.fiap.banco;

public class Teste 
{
	public static void main(String[] args) 
	
	//O método main é para execução de código, uma forma mais simples de adicionar o main é
	//escreve "main" em seguida CTRL + Espaço
	
	{
		//primeiro vou criar um objeto a partir do construtor padrão da classe conta
		
		Conta cc = new Conta ();  //Classe conta - criar o nome da varável de referência, no qual vai apontar para um novo (new) objeto da classe conta
		
		cc.saldo = 50.0; //Aqui atribuimos valor a variável de referência, que vai armazenar os valores dentros dos objetos da classe
		cc.numero = 12345;
		cc.agencia = 35486;
		
		cc.depositar(1000); //aqui vou depositar 1000 reais dentro da conta que já havia 50 reais.
		
		System.out.println(cc.verificarSaldo()); //imprimir o saldo da conta
		
		Conta poupanca = new Conta (1111, 35323, 1000); //Segundo objeto proveniente da classe conta. Segunda objeto é a poupança com base no construtor de classe. Aqui já vou passar todas as informações, número da agencia, número da conta e saldo
		
		poupanca.retirar(50.0); //retirando o valor do saldo
		
		System.out.println(poupanca.verificarSaldo());
		
		Conta cc2 = null; //aqui não existe nenhum objeto apontando para a variável criada cc2, portanto dará um erro.
		
		//para verificar se esse objeto está "vinculado" a uma variável, construimos um if pra analisar
		
		if ( cc2 != null) //se cc2 não for nulo, fará o depósito
		{
			cc2.depositar(1000); 
		}
		else
		{
			System.out.println("Favor atribuir um objeto a variável cc2");
		}
	}
}
