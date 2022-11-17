package altura;
public class altura {
	public static void main(String[] args) {
		double alturaP=1.45, alturaJ=1.34;
		int i=0;
		while(alturaP > alturaJ) {
			alturaP+=0.02;
			alturaJ+=0.025;
			i++;
		}
		System.out.println("Após "+i+" anos, João ficou maior que Pedro");
	}
}