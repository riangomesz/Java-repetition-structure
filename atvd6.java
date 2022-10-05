import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso;
		int sexo;
		int cont1=0,cont2=0;
		
		for (int i=1; i<=10; i++){
		    System.out.println("Informe seu sexo (1) Masculino (2) Feminino:");
		    sexo = sc.nextInt();
		    System.out.println("Informe seu peso: ");
		    peso = sc.nextDouble();
		    
		    switch(sexo){
		    case 1: if(peso>=60 && peso<= 80){
		        cont1=cont1 + 1;
		    }break;
		    case 2: if(peso>=50 && peso<=70){
		        cont2=cont2 + 1;
		    }break;
		}    
		
		}System.out.println("O número de Homens com o peso (60-80) foi de "+cont1+" pessoas.");
		System.out.println("O número de Mulheres com o peso (50-70) foi de "+cont2+" pessoas.");
	}   
}

