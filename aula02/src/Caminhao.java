public class Caminhao extends Terrestre {
    int numeroDeRodas;

    public Caminhao(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, int combustivel, int numeroDeRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, combustivel);
        this.numeroDeRodas = numeroDeRodas;
    }


    @Override
    public String toString() {
        return "Caminhao{" +
                "numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                '}';
    }
}
