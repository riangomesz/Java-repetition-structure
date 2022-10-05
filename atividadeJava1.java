
"Programa feito em Java que recebe o total de alunos que fizeram as provas, lê a matrícula deles e calcula a média de um estudante." 
"Informa também ao usuário se ele foi aprovado, se está no exame ou se foi reprovado."


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		int alunos,contalunos=0;
		float matricula;
		float nota1,nota2,nota3,media;
		
		do{
		    contalunos = contalunos + 1;
		    System.out.println("Informe o Número de Alunos que realizaram as provas:");
		    alunos = sc.nextInt();
		}while(alunos<1);
		do{
		    System.out.println("\nInforme sua Matrícula:");
		    matricula = sc.nextFloat();
		    if(matricula<0){
		        do{
		            System.out.println("Matrícula Invalida.");
		            System.exit(0);
		        }while(matricula>0);
		        
		    }else{
		        if(matricula>0){
		            do{
		                System.out.println("Informe a nota da Prova 1 (0-100):");
		                nota1 = sc.nextFloat();
		            }while(nota1<0||nota1>100);
		            do{
		                System.out.println("Informe a nota da Prova 2 (0-100):");
		                nota2 = sc.nextFloat();
		            }while(nota2<0||nota2>100);
		            do{
		                System.out.println("Informe a nota da Prova 3 (0-100):");
		                nota3 = sc.nextFloat();
		            }while(nota3<0||nota3>100);
		            do{
		                media = (nota1+nota2+nota3) / 3;
		                System.out.println("\nA MÉDIA do aluno "+contalunos+" foi de "+df.format(media)+" pontos.");
		            }while(media<0||media>100);
		            do{
		                if(media>=70){
		                    System.out.println("APROVADO.");
		                    contalunos = contalunos + 1;
		                }else{
		                    if(media>=60 && media<70){
		                        System.out.println("EXAME.");
		                        contalunos = contalunos + 1;
		                    }else{
		                        if(media<60){
		                            System.out.println("REPROVADO.");
		                            contalunos = contalunos + 1;
		                        }
		                    }
		                }
		            }while(media<0||media>100);
		        }
		    }
		}while(contalunos<=alunos);
	}
}

