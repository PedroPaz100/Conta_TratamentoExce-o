package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double deposito = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limite = sc.nextDouble();
		
		Conta conta=new Conta(numero,titular,deposito,limite);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double saque = sc.nextDouble();
		
		try {
			conta.saque(saque);
			System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();

	}

}
