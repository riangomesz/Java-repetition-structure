"Programa que recebe a idade e o peso de 4 pessoas e informa o número de pessoas acima de 90kg e a média da idades

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade; double peso; int mediaIdade=0; int soma=0;
		int cont1=0;
		
		for(int i=1; i<=4; i++){
		    
		    System.out.println("Informe sua idade: ");
		    idade = sc.nextInt();
		    soma = idade + soma;
		    
		    System.out.println("Informe seu peso: ");
		    peso = sc.nextDouble();
		    
		    if(peso>90){
		        cont1 = cont1 + 1;
		    }
		    mediaIdade = soma/4;
		    
		}
		System.out.println("Total de pessoas acima de 90kg: "+cont1);
		System.out.println("A média de idades foi: "+mediaIdade);
	}
}
