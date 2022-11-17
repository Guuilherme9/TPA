package idadeealtura;
import java.util.Scanner;
public class idadeealtura {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, idadeVelho=0, idadeNovo=0;
		double soma=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Digite a idade do usuario "+i+":");
			idade = in.nextInt();
			soma+=idade;
			if(idade > idadeVelho) {
				idadeVelho = idade;
			}
			if(idade < idadeNovo || i==1) {
				idadeNovo = idade;
			}
		}
		System.out.println("A média das idades é: "+(soma/10));
		System.out.println("O usuario mais novo é: "+idadeNovo);
		System.out.println("O usuario mais velho é: "+ idadeVelho);
	}
}