public class Aereo extends Veiculo {
    double altitudeMaxima;
    String terreno;

    public Aereo(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, int combustivel, double altitudeMaxima) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, combustivel);
        this.altitudeMaxima = altitudeMaxima;
    }
}
