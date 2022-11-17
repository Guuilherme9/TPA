package expoente;
import java.util.Scanner;
public class expoente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a base: ");
		int base = in.nextInt(), resultado=base;
		System.out.print("Digite um expoente: ");
		int expoente = in.nextInt(), i=1;
		while(i<expoente) {
			resultado = resultado*base;
			i++;
		}
		System.out.println(resultado);
}
}