package idade3;
import java.util.Scanner;
public class idade3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoAtual, anoNascimento, idade, velho = 0, novo = 0;
		System.out.print("Digite o ano atual: ");
		anoAtual = in.nextInt();
		for(int i = 1;i<=10;i++) {
			System.out.print("Digite o ano de nascimento "+i+":");
			anoNascimento = in.nextInt();
			idade = anoAtual-anoNascimento;
			System.out.println(idade);
			if(idade < novo) {
				novo = idade;
			}
			if(idade > velho) {
				velho = idade;
			}
		}
		System.out.println("O usuário mais velho tem "+velho+" anos, e o mais novo tem "+novo+" anos");
	}
}