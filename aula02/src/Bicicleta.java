public class Bicicleta extends Terrestre {
    int numeroDeRodas;

    public Bicicleta(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, int combustivel, int numeroDeRodas) {

        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, combustivel);

        this.numeroDeRodas = numeroDeRodas;
    }


    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                '}';
    }
}
