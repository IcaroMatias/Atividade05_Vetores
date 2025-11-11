import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tamanho do Vetor

        System.out.println("Quantos produtos deseja cadastrar? ");
        int quantidade = sc.nextInt();

        String [] nomes = new String[quantidade];
        Double [] precos = new Double[quantidade];

        // Inserindo valores
        for(int i = 0; i < quantidade; i++) {
            System.out.println("--------------------");
            System.out.println("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.println("Valor: ");
            precos[i] = sc.nextDouble();
        }


        // Mostrando valores inseridos
        System.out.println("-------Produtos Inseridos-------");
        for(int j = 0; j < quantidade; j++) {
            System.out.println("--------------------");
            System.out.println("Nome: " + nomes[j]);
            System.out.println("Valor: "+ precos[j]);
        }
    }
}