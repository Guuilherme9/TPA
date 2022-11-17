package diasemana;
import java.util.Scanner;
public class diasemana {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int m;
		
		System.out.println("Digite um número:");
		m = in.nextInt();

		switch(m) {
		case 2:
			System.out.println("\nO mes possui 28 dias\n");
			break;
		case 4:
		case 6:
		case 9:
		case 11:		
			System.out.println("\nO mes possui 30 dias\n");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("\nO mes possui 31 dias\n");
			break;
		default:
			System.out.println("\nValor não corresponde a nenhum mes!\n");
			
}
}
}