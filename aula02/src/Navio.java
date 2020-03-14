public class Navio extends Aquatico {
    public Navio(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, int combustivel) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, combustivel);
    }


    public String toString() {
        return "Navio{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                '}';
    }
}

