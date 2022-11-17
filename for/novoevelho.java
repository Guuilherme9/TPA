package novoevelho;

import java.util.Scanner;

public class novoevelho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        int idadeV = 0;
        int idadeN = 0;
        String nome;
        String nomeV = "0";
        String nomeN = "0";
        for(int i=10;i>=1;i--){
            System.out.print("Digite o "+(10-i+1)+"º nome: ");
            nome = in.next();
            System.out.print("Digite a "+(10-i+1)+"ª idade: ");
            idade = in.nextInt();

            if(idade >= idadeV){
                idadeV = idade;
                nomeV = nome;
            }
            if(idade <= idadeN || i==10){
                idadeN = idade;
                nomeN = nome;
            }
        }
        System.out.println("O usuario "+nomeN+" é o mais novo, com "+idadeN+" anos\nE o mais velho é "+nomeV+", com "+idadeV+" anos.");
    }
}