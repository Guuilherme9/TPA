package lucro;
import java.util.Scanner;
public class lucro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	double valor, lucro;
		String res= "s";
	while(res.equalsIgnoreCase("s")) {
		System.out.print("Digite o valor do produto: ");
		valor = in.nextDouble();
		System.out.print("Digite a margem de lucro: (sem o sinal de porcentagem)");
		lucro = in.nextDouble();
		System.out.print("O preco de venda e: ");
		System.out.format("%.2f",(valor + (valor*lucro/100)));
		System.out.println("\nDeseja continuar? (y/n)");				res = in.next();
		}
		System.out.println("Fim");
	}
}
