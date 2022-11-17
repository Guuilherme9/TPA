package idade1;
import java.util.Scanner;
public class idade1 {
	public static void main(String[] args) {
	double idade, id1=0, id2=0, id3=0, id4=0, id5=0, soma;
	double p1,p2,p3,p4,p5;
	Scanner in = new Scanner(System.in);
	for(int i=1;i<=15;i++) {
		System.out.println("Digite a idade do usuario "+i);
		idade=in.nextInt();
		if (idade<=15) {
			id1++;
		}else if(idade <= 30) {
			id2++;
		}else if(idade <= 45) {
			id3++;
		}else if(idade <= 60) {
			id4++;
		}else{
			id5++;
		}
	}
	System.out.println("Faixa etaria 1, tem "+id1+" pessoas");
	System.out.println("Faixa etaria 2, tem "+id2+" pessoas");
	System.out.println("Faixa etaria 3, tem "+id3+" pessoas");
	System.out.println("Faixa etaria 4, tem "+id4+" pessoas");
	System.out.println("Faixa etaria 5, tem "+id5+" pessoas\n");
	
	soma=id1+id2+id3+id4+id5;
	p1= (id1*100)/(soma);
	p2= (id2*100)/(soma);
	p3= (id3*100)/(soma);
	p4= (id4*100)/(soma);
	p5= (id5*100)/(soma);
	
	System.out.println(p1+"% estão na faixa etaria 1");
	System.out.println(p2+"% estão na faixa etaria 2");
	System.out.println(p3+"% estão na faixa etaria 3");
	System.out.println(p4+"% estão na faixa etaria 4");
	System.out.println(p5+"% estão na faixa etaria 5");
}
}