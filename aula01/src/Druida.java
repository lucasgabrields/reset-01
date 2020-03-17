package Tema01;

public class Druida {
    String nome;
    int vida;
    int ataque;
    int defesa;
    int fe;

    Druida(String nome, int vida, int ataque, int defesa, int fe){

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }
    int calcularDano(int defesa, int poder) {
        return ataque * poder - defesa;
    }


    void registrar(String alvo, String habilidade, int dano) {

        System.out.println(this.nome +  "atacou" +  alvo +  "com" +  habilidade +  "causando" +  dano +  "de dano");
    }

    void imprimirEstado(){

        System.out.println("Nome:"+  this.nome +  "," +  "Vida"+  this.vida +  "," +  "Fé"+  this.fe);
    }

    void atacar(Guerreiro alvo, Poder poder) {

        int dano = calcularDano(alvo.defesa, poder.danoPoder);

        alvo.vida -= dano;

        this.fe -= poder.custoFe;

        registrar(alvo.nome, poder.nome, dano);

    }

    void atacar(Barbaro alvo, Poder poder) {

        int dano = calcularDano(alvo.defesa, poder.danoPoder);

        alvo.vida -= dano;

        this.fe -= poder.custoFe;

        registrar(alvo.nome, poder.nome, dano);


    }

    void atacar(Clerigo alvo, Poder poder) {

        int dano = calcularDano(alvo.defesa, poder.danoPoder);

        alvo.vida -= dano;

        this.fe -= poder.custoFe;

        registrar(alvo.nome, poder.nome, dano);

    }

    void atacar(Druida alvo, Poder poder) {

        int dano = calcularDano(alvo.defesa, poder.danoPoder);

        alvo.vida -= dano;

        this.fe -= poder.custoFe;

        registrar(alvo.nome, poder.nome, dano);

    }

    void atacar(Mago alvo, Poder poder) {

        int dano = calcularDano(alvo.defesa, poder.danoPoder);

        alvo.vida -= dano;

        this.fe -= poder.custoFe;

        registrar(alvo.nome, poder.nome, dano);

    }

    void atacar(Feiticeiro alvo, Poder poder) {

        int dano = calcularDano(alvo.defesa, poder.danoPoder);

        alvo.vida -= dano;

        this.fe -= poder.custoFe;

        registrar(alvo.nome, poder.nome, dano);

    }






}


