import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade; double peso; int mediaIdade=0; int soma=0;
		int cont1=0;
		
		for(int i=1; i<=7; i++){
		    
		    System.out.println("Informe sua idade: ");
		    idade = sc.nextInt();
		    soma = idade + soma;
		    
		    System.out.println("Informe seu peso: ");
		    peso = sc.nextDouble();
		    
		    if(peso>90){
		        cont1 = cont1 + 1;
		    }
		    mediaIdade = soma/7;
		    
		}
		System.out.println("Total de pessoas acima de 90kg: "+cont1);
		System.out.println("A média de idades foi: "+mediaIdade);
	}
}