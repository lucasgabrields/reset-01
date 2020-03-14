public class Aviao extends Aereo {
    double altitudeMaxima;

    public Aviao(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, int combustivel, double altitudeMaxima, double altitudeMaxima1) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, combustivel, altitudeMaxima);
        this.altitudeMaxima = altitudeMaxima1;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMaxima=" + altitudeMaxima +
                ", altitudeMaxima=" + altitudeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                '}';
    }
}
