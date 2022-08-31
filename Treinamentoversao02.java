package aula03;

//Importando a biblioteca de entrada
	import java.util.Scanner;

public class Treinamentoversao02 

	{
	
		String str1 = "soma";
		String str2 = "subtracao";
		String str3 = "divisao";
		String str4 = "raiz";
		String str5 = "potencia";
		String str6 = "produto";
	
	    //Ainda não entendi o que é isso, mas tem que ter para iniciar o programa
		//Acredito que seja igual no C++, "main"
		public static void main(String[] arg) 
		
		{
				
					
			//Declando uma variável para usar como entrada
			Scanner sc = new Scanner (System.in);
			
			//Apresentando o programa para o usuário
			System.out.println ("Bem vindo a calculadora simples");
			
			//Solicitando que o usuário digite qualquer valor, por isso o float
			System.out.println ("Digite qualquer valor que deseja calcular:  ");
			float num1 = sc.nextFloat();
			
			//Testendo a função string. Aqui pedi para o usuário escrever a operação que ele deseja realizar
			//Podia ter usado o CHAR e pedido o usuário para digitar o símbolo da operação desejada, mas não sei como ele digitaria raiz quadara
			System.out.println ("Digite o nome da operação desejada  ");
			String ch = sc.next();
			
			//Solicitando ao usuário que ele digite outro valor da operação
			System.out.println ("Digite qualquer valor que deseja calcular:  ");
			float num2 = sc.nextFloat();
			
			//a ideia aqui é separar cada operação matemática. Ou seja, ler o que o usuário quer e realizar a operação deseja
			//porém nunca tentei comparar com string. será um teste
			if (ch == str1) 
			{
				
				float valor01 = num1+num2;
				System.out.println("O valor da soma é: "+ valor01);
				
			}
			//mais operações matemáticas
			else if (ch == str2)
			{
				
				float valor02 = num1-num2;
				System.out.println("O valor da soma é: "+ valor02);
				
			}
			else if (ch == str6)
			{
				
				float valor03 = num1*num2;
				System.out.println("O valor da soma é: "+ valor03);
				
			}
			else if (ch == str3)
			{
				
				float valor04 = num1/num2;
				System.out.println("O valor da soma é: "+ valor04);
				
			}
			else if (ch == str5)
			{
				
				float valor05 = (float) Math.pow(num1, num2);
				System.out.println("O valor da soma é: "+ valor05);
				
			}
			else if (ch == str4)
			{
				
				float valor06 = (float) Math.pow(num1, 1/num2);
				System.out.println("O valor da soma é: "+ valor06);
				
			}
			
			sc.close();
			
		}
			
}
