"Programa que recebe um número de habitantes de uma cidade e o salários desses habitantes, depois calcula a média salarial dos habitantes.
"Também recebe o número de filhos da qtde de habitantes e realiza a média de filhos do habitantes

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		int habitantes=0;
		int contador=0,contadoR=0;
		float salario=0,salariototal=0,mediasalario=0;
		float filho=0,filhototal=0,mediafilho=0;
		do{
		    System.out.println("Informe o Número de Habitantes entrevistados: ");
		    habitantes = sc.nextInt();
		}while(habitantes<1);
		do{
		    contador = contador + 1;
		    salariototal = salariototal + salario;
		    System.out.println("Informe o Salário do habitante "+contador+":");
		    salario = sc.nextFloat();
		    
		    if(salario<=0){
		        System.out.println("Salário Inválido.");System.exit(0);
		      }
		}while(contador!=habitantes);
		do{
		    salariototal = salariototal + salario;
		    mediasalario = salariototal / habitantes;
		    System.out.println("\nA Média Salarial dos habitantes foi: R$"+df.format(mediasalario));
		}while(mediasalario<0);
		do{
		   contadoR = contadoR + 1;
		   filhototal = filhototal + filho;
		   System.out.println("Informe o Número de filhos do habitante "+contadoR+":");
		   filho = sc.nextFloat();
		}while(contadoR!=habitantes);
		do{
		    filhototal = filhototal + filho;
		    mediafilho = filhototal / habitantes;
		    System.out.println("A Média de Filhos dos habitantes foi: "+df.format(mediafilho)+" filho(a)s.");
		}while(contadoR!=habitantes && contador!=habitantes);
	}
}
