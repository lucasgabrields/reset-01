package Tema01;

public class Guerreiro {

    String nome;
    int vida;
    int ataque;
    int defesa;

    Guerreiro (String nome, int vida, int ataque, int defesa) {

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    int calcularDano(int defesa, int poder) {
        return ataque * poder - defesa;
    }


    void registrar(String alvo, String habilidade, int dano) {

        System.out.println(this.nome +  " atacou " +  alvo +  " com " +  habilidade +  "causando" +  dano +  "de dano");
    }

    void imprimirEstado(){

        System.out.println("Nome:"+  this.nome +  "," +  "Vida"+  this.vida );
    }

    void atacar(Guerreiro alvo, Arma arma) {

        int dano = calcularDano(alvo.defesa, arma.danoArma);

        alvo.vida -= dano;

        registrar(alvo.nome, arma.nome, dano);

    }

    void atacar(Barbaro alvo, Arma arma) {

        int dano = calcularDano(alvo.defesa, arma.danoArma);

        alvo.vida -= dano;

        registrar(alvo.nome, arma.nome, dano);


    }

    void atacar(Clerigo alvo, Arma arma) {

        int dano = calcularDano(alvo.defesa, arma.danoArma);

        alvo.vida -= dano;

        registrar(alvo.nome, arma.nome, dano);

    }

    void atacar(Druida alvo, Arma arma) {

        int dano = calcularDano(alvo.defesa, arma.danoArma);

        alvo.vida -= dano;

        registrar(alvo.nome, arma.nome, dano);

    }

    void atacar(Mago alvo, Arma arma) {

        int dano = calcularDano(alvo.defesa, arma.danoArma);

        alvo.vida -= dano;

        registrar(alvo.nome, arma.nome, dano);

    }

    void atacar(Feiticeiro alvo, Arma arma) {

        int dano = calcularDano(alvo.defesa, arma.danoArma);

        alvo.vida -= dano;

        registrar(alvo.nome, arma.nome, dano);

    }

}








