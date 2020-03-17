package Tema01;

public class Feiticeiro {

       String nome;
       int vida;
       int ataque;
       int defesa;
       int mana;

      Feiticeiro(String nome, int vida, int ataque, int defesa, int mana) {

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    int calcularDano(int defesa, int poder) {
        return ataque * poder - defesa;
    }


    void registrar(String alvo, String habilidade, int dano) {

        System.out.println(this.nome +  "atacou" +  alvo +  "com" +  habilidade +  "causando" +  dano +  "de dano");
    }

    void imprimirEstado(){

        System.out.println("Nome"+  this.nome +  "," +  "Vida"+  this.vida +  "," +  "Mana"+  this.mana);
    }

    void atacar(Guerreiro alvo, Magia magia) {

        int dano = calcularDano(alvo.defesa, magia.danoMagia);

        alvo.vida -= dano;

        this.mana -= magia.custoMana;

        registrar(alvo.nome, magia.nome, dano);

    }

    void atacar(Barbaro alvo, Magia magia) {

        int dano = calcularDano(alvo.defesa, magia.danoMagia);

        alvo.vida -= dano;

        this.mana -= magia.custoMana;

        registrar(alvo.nome, magia.nome, dano);


    }

    void atacar(Clerigo alvo, Magia magia) {

        int dano = calcularDano(alvo.defesa, magia.danoMagia);

        alvo.vida -= dano;

        this.mana -= magia.custoMana;

        registrar(alvo.nome, magia.nome, dano);

    }

    void atacar(Druida alvo, Magia magia) {

        int dano = calcularDano(alvo.defesa, magia.danoMagia);

        alvo.vida -= dano;

        this.mana -= magia.custoMana;

        registrar(alvo.nome, magia.nome, dano);

    }

    void atacar(Mago alvo, Magia magia) {

        int dano = calcularDano(alvo.defesa, magia.danoMagia);

        alvo.vida -= dano;

        this.mana -= magia.custoMana;

        registrar(alvo.nome, magia.nome, dano);

    }

    void atacar(Feiticeiro alvo, Magia magia) {

        int dano = calcularDano(alvo.defesa, magia.danoMagia);

        alvo.vida -= dano;

        this.mana -= magia.custoMana;

        registrar(alvo.nome, magia.nome, dano);

    }






}


