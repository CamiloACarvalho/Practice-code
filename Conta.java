package br.com.fiap.banco;

//Para criar um novo projeto:
//1) file - new - java-project
//2) dentro de do projeto java-project, na pasta src
//botão direito, new package. Nessa o nome desse package é separa por nomes
//pois a cada ponto cria-se um pasta, sendo as subpastas
//3) dentro de package, botão direito, new class. será criada a nova 
//classe, que é onde será desenvolvido o programa

public class Conta 
{
	//O primeiro passo a ser fazer nessa classe é criar os objetos
	//Esses objetos são comum em conta corrente, poupança, aplicações...
	//Então a ideia aqui foi criar objetos comum a diversas contas.
	
	int agencia; //int pq o número da agencia é sempre numero inteiro

	int numero; 
	
	double saldo; //double pq é o código mais preciso em relação a casas decimais
	
	public Conta()
	{
		
	}
		public Conta(int agencia, int numero, double saldo) 
		
		{
			this.agencia = agencia;
			this.numero = numero;
			this.saldo = saldo;
		}
		
		//No momento já temos a classe Conta com atributos agência, número e saldo
		//Com um construtor padrão e um construtor de classe.
		
		public void depositar (double valor) //não precisa ter um retorno, por tanto vamos colocar o void. Colocamos o nome do método 
											 //(depositar - verbo no infinitivo. Dentro o método vamos colocar o valor a ser depositado, 
											 //então receberá um parâmetro do tipo double, chamado de valor.
		
		{
			this.saldo = this.saldo+valor; //Para isso, terei atualizar meu saldo. Nete caso eu teria o meu saldo em conta e mais o valor que for depositar
										   //Outra forma de mais simple de fórmula this.saldo += valor;			
		}
		
		public void retirar (double valor) //Mesmo caso do depositar, só que neste caso estamos fazendo a retirada do valor
		
		{
			this.saldo = this.saldo-valor; //outra opção de fórmula this.saldo -= valor;
		}
		
		//Agora preciso criar um campo apenas para verificar o saldo da conta. Mas dessa vez ele terá que retornar um valor, no caso o saldo em conta
		
		public double verificarSaldo () //Não precisa ter nenhum parâmetro de entrada
		
		{
			return this.saldo;
		}
}
