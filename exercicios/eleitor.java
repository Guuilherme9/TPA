package eleitor;
import java.util.Scanner;
public class eleitor {
	public class TituloEleitor {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int nasc, ano, Idade;
			
			System.out.println("Digite o ano de nascimento");
			nasc = in.nextInt();
			
			System.out.println("Digite o ano atual");
			ano = in.nextInt();
			
			Idade = ano-nasc;
			System.out.println(Idade+" anos");
			
			if (Idade>=16) {
				System.out.println("Pode tirar o titulo");
			}else {
				System.out.println("Não pode tirar o titulo");
			}
			
			in.close();
		}
	}
}