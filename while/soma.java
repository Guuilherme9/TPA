package soma;
import java.util.Scanner;
public class soma {
public static void main(String[] args) {
	int i=100, resultado=0;
	while(i>=1) {
		resultado+=i;
		i--;
	}
	System.out.println("A soma de todos os numeros de 1 a 100 é "+resultado);
}
}