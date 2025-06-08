/******************************************************************************
                            Online Java Compiler.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
        // Atividade 02
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double tempCelsi = scanner.nextDouble();
        
        // Faz os calculos
        // Fahrenheit (°F) = (Celsius (°C) × 9/5) + 32 ou (Celsius (°C) × 1.8) + 32
        double tempFahre = (tempCelsi * 1.8) + 32;
        
        // Kelvin (K) = Celsius (°C) + 273.15
        double tempKelv = tempCelsi + 273.15;

        // Imprime as temperaturas
        System.out.printf("%n Temperatura em Celsius: %.1f °C", tempCelsi);
        System.out.printf("%n Temperatura em Fahrenheit: %.1f °F", tempFahre);
        System.out.printf("%n Temperatura em Kelvin: %.2f K%n", tempKelv);

        scanner.close();

	}
}