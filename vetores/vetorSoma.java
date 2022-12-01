package vetorSoma;
import java.util.Scanner;
public class vetorSoma {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		final int TAM= 10;
		int a[], b[],c[],i;
		
		a= new int [TAM];
		b= 	new int [TAM];
		c= new int [TAM];
		for(i=0; i<TAM; i++){
			System.out.println("Digite o "+(i+1)+"° número:");
			a[i]= in.nextInt();
			System.out.println("Digite o "+(i+1)+"° número:");
			b[i]= in.nextInt();
			c[i]=a[i]+b[i];
			System.out.println("A soma é :"+c[i]);
			
		}
	}

}
