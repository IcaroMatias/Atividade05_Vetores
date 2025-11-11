public class Produtos {
    // Atributos

    private String nome;
    private Double preco;

    //Chamando os valores

    public Produtos (String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Métodos

    public void imprimirInformacoes() {
        System.out.println("--------Produto--------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor: " + this.preco);
        System.out.println("-----------------------");
    }
}