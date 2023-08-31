package Terminal;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Por favor, digite o número: ");
		int num = scan.nextInt();
		
		System.out.print("Por favor, digite o número da agência: ");
		String agencia = scan.next();
		
		System.out.print("Por favor, digite o seu nome: ");
		String nome = scan.next();
		
		System.out.print("Por favor, digite o seu saldo: ");
		double saldo = scan.nextDouble();
		
		scan.close();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
		+ agencia + ", conta " + num + " e seu saldo é " + saldo + " já está disponivel para saque.");
	}
}
