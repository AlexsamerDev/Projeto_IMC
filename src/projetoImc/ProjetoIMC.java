package projetoImc;

import java.util.Scanner;

public class ProjetoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o peso em KG: ");
		double peso = scanner.nextDouble();

		System.out.print("Digite a altura em CM:");
		double altura = scanner.nextDouble();
		scanner.close();

		double imc = calcularImc(peso, altura);
		String categoria = categorizarImc(imc);

		System.out.println("Seu IMC é : " + imc);
		System.out.println("Categoria: " + categoria);
	}

	public static double calcularImc(double peso, double altura) {
		altura = altura / 100;
		return peso / (altura * altura);
	}

	public static String categorizarImc(double imc) {
		if (imc < 18.5) {
			return "Você está Abaixo do Peso";
		} else if (imc < 25) {
			return "Você está em seu Peso Normal";
		} else if (imc < 30) {
			return "Voce está acima do Peso (sobrepeso)";
		} else if (imc < 35) {
			return "Obesidade Grau I ";
		} else if (imc < 40) {
			return "Obesidade Grau II";
		} else {
			return "Obesidade Grau III";
		}
	}
}
