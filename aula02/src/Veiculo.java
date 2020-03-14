public class Veiculo {
    String nome;

    double velocidadeMaxima;


    int lotacaoMaxima;

    int combustivel;

    public Veiculo(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, int combustivel) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.lotacaoMaxima = lotacaoMaxima;
        this.combustivel = combustivel;
    }
}
