package fibonacci;
import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		int ant=0, at=1, prox=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
				System.out.print(at+" ");
			prox=at+ant;
			ant=at;
			at=prox;
		}
	}
}