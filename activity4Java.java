" Programa que lê o número informado pelo o usuário e imprime os números ímpares até o que foi informado
	


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero = 1;
		int valor;
		
		System.out.println("Informe um Valor Inteiro: ");
		valor = leitor.nextInt();
		System.out.println("Os Números Ímpares de 1 até "+valor+" são: ");
		
		while(numero<=valor){
		    if(numero%2!=0){
		        System.out.println(numero);
		    }
		    numero = numero+ 1;
		}
	}
}
