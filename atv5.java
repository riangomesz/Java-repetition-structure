import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		float temperatura=0,temperaturatotal=0,mediatemperatura=0;
		int contadorDia=0;
		
		do{
		    contadorDia = contadorDia + 1;
		    temperaturatotal = temperaturatotal + temperatura;
		    System.out.println("Informe a Temperatura do dia "+contadorDia+" de Janeiro:");
		    temperatura = leitor.nextFloat();
		}while(contadorDia<10);
		do{
		    temperaturatotal = temperaturatotal + temperatura;
		    mediatemperatura = temperaturatotal / 10;
		    System.out.println("\nA temperatura Média desses dias foi de "+df.format(mediatemperatura)+"°.");
		}while(mediatemperatura<0);
	}
}
