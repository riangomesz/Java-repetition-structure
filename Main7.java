import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota, maiorNota=0,menorNota=100;
		
		for(int i=1; i<=5;i++){
		    System.out.println("Informe sua nota:");
		    nota = sc.nextInt();
		
		    if(nota>maiorNota){
		        maiorNota = nota;
		    }
		        if(nota<menorNota){
		            menorNota = nota;
		        }
		        
		    
		    
		}
		System.out.println("A maior Nota foi: "+maiorNota);
		System.out.println("A menor Nota foi: "+menorNota);
	}
}
