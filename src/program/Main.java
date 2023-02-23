package program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import pessoa.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Pessoa> masculino = new HashSet<Pessoa>();
		Set<Pessoa> feminino = new HashSet<Pessoa>();

		System.out.print("Quantas pessoas vocês vai adicionar? ");
		int quantidadePessoas = sc.nextInt();
		
		for(int i = 0 ; i < quantidadePessoas ; i++) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Genero: ");
			char genero = sc.next().charAt(0);
			
			while(genero != 'f' && genero != 'm') {
				System.out.print("Valor invalido! Digite novamente: ");
				genero = sc.next().charAt(0);
			}
			
			Pessoa pessoa = new Pessoa(nome, genero);
			if(genero == 'f') {
				feminino.add(pessoa);
			}else {
				masculino.add(pessoa);
			}
		}
		
		System.out.println(masculino);
		System.out.println(feminino);
		
		sc.close();
	}

}
