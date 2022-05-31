package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char op;
		Pessoa p1 = new Pessoa();
		Endereco e1 = new Endereco();
		do {
			System.out.println("Digite o nome da Pessoa:");
			p1.setNome(sc.nextLine());
			System.out.println("Digite a idade");
			p1.setIdade(sc.nextInt());
			System.out.println("Digite o sexo (M/F):");
			p1.setSexo(sc.next().charAt(0));
			sc.nextLine();
			System.out.println("Digite o nome da rua:");
			e1.setLogradouro(sc.nextLine());
			System.out.println("Digite o complemento:");
			e1.setComplemento(sc.nextLine());
			System.out.println("Digite o CEP:");
			e1.setCep(sc.nextLine());
			System.out.println("Digite o numero:");
			e1.setNumero(sc.nextInt());
			sc.nextLine();
			p1.setEnd(e1);
			p1.armazenar(p1);
			System.out.println("Deseja cadastrar outra pessoa?(S/N)");
			op=sc.next().charAt(0);
			sc.nextLine();
		}while(op=='s');
		System.out.println("Lista até agora: " + p1.getLista());
	}
}
