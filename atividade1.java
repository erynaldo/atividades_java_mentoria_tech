/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
        // Atividade 01
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Digite a nota da primeira Avaliação: ");
        // String nota1 = scanner.nextInt();
        float nota1 = scanner.nextFloat();
        
        System.out.print("Digite a nota da segunda Avaliação: ");
        float nota2 = scanner.nextFloat();
        
        System.out.print("Digite a nota da terceira Avaliação: ");
        float nota3 = scanner.nextFloat();
        
        System.out.print("Digite a nota da quarta Avaliação: ");
        float nota4 = scanner.nextFloat();
        
        System.out.print("Digite a nota da quinta Avaliação: ");
        float nota5 = scanner.nextFloat();
        
        System.out.print("Digite a nota da sexta Avaliacao: ");
        float nota6 = scanner.nextFloat();
        
        System.out.print("Digite a nota da setima Avaliação: ");
        float nota7 = scanner.nextFloat();
        
        System.out.print("Digite a nota da oitava Avaliação: ");
        float nota8 = scanner.nextFloat();
        
        // Faz os calculos
        // 1º Semestre
        float mediaBim_1 = (nota1 + nota2)/2;
        float mediaBim_2 = (nota3 + nota4)/2;
        float mediaSemest_1 = (mediaBim_1 + mediaBim_2)/2;

        // Imprime as médias
        // System.out.println("1º Bimestre: " + mediaBim_1);
        System.out.printf("%n Aluno: %s%n", nomeAluno);
        System.out.printf("%n 1º Bimestre: %.1f", mediaBim_1);
        System.out.printf("%n 2º Bimestre: %.1f", mediaBim_2);
        System.out.printf("%n 1º Semestre: %.1f%n", mediaSemest_1);
        
        System.out.println("----------------------------------");
        
        // 2º Semestre
        float mediaBim_3 = (nota5 + nota6)/2;
        float mediaBim_4 = (nota7 + nota8)/2;
        float mediaSemest_2 = (mediaBim_3 + mediaBim_4)/2;
        
        // Imprime as médias
        System.out.printf("%n 3º Bimestre: %.1f", mediaBim_3);
        System.out.printf("%n 4º Bimestre: %.1f", mediaBim_4);
        System.out.printf("%n 2º Semestre: %.1f%n", mediaSemest_2);
        
        System.out.println("----------------------------------");
        
        // Imprime a média final
        float mediaFinal = (mediaSemest_1 + mediaSemest_2)/2;
        System.out.printf("%n Media Final: %.1f", mediaFinal);
        
        // System.out.println("Média Final do aluno " + nomeAluno + " foi de: " + mediaFinal);
        // System.out.printf("%n Media Final do aluno %s foi de: %.1f", nomeAluno, mediaFinal);
        // System.out.printf("Salário: %.2f%n", salario);


        scanner.close();
        
        // String nome = "Fábio dos Reis";
        // String endereco = "Rua das Flores, 2345";
        // byte idade = 38;
        // char estadoCivil = 'C';
        // float salario = 2300.00f;
        // System.out.println("Nome: " + nome);
        // System.out.println("Endereço: " + endereco);
        // System.out.printf("Idade: %d%n", idade);
        // System.out.printf("Estado civil: %c%n", estadoCivil);
        // System.out.printf("Salário: %.2f%n", salario);
        
        // boolean VouF = true;
        // int inteiro  = 45;
        // double real = 10.58;
        // char letra = 'F';
        // String palavra_frase = "Rua das flores, nº 254";
	}
}