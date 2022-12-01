package invertido;
import java.util.Scanner;
public class invetido {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		final int TAM=10;
		int a[], b[], i, x=9;
		a = new int [TAM];
		b = new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i] = in.nextInt();
			b[x] = a[i];
			x--;
		}
		for (i=0; i<TAM; i++) {
			if (i==0){
				System.out.print("[ "+b[i]+", ");
			}else if (i==9){
				System.out.println(b[i]+" ]");
			}else {
			System.out.print(b[i]+", ");
			}
		}
	}

}
