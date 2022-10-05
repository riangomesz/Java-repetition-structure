import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contador=0;
		int valor;
		int dobro;
		
		do{
		    contador = contador + 1; 
		    System.out.println("Informe o "+contador+"º valor.");
		    valor = leitor.nextInt();
		    
		    dobro = valor*2;
		    System.out.println("O dobro de "+valor+" é "+dobro);
		    
		}while(contador<5);
	}
}
