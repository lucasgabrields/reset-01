package Tema01;

public class App {
     public static void main(String[] args) {

          /*
           *HEROIS:

           *Geromel é um Clerigo e utiliza o desarme divino

           *Kanemann é um Guerreiro e utiliza o carrinho firme

           *Everton Cebolinha é um Mago e utiliza o drible magico

           *VILÕES:

           *Dalessandro é um Druida e utiliza  a catimba divina

           *Paolo é um Feiticeiro e utiliza a choradeira magica

           *Dourado é um Barbaro e utiliza a falta desleal

           * ROTEIRO:

           *Everton Cebolinha ataca Dourado com um Drible desconcertante

           *Dourado ataca Geromel com uma falta desleal

           *Geromel ataca Paolo com um desarme divino

           *Kanemann ataca Dalessandro com um carrinho firme

           *Dalessandro ataca Everton Cebolinha com uma catimba divina
           * */

          Magia choradeiraMagica = new Magia("Choradeira Mágica", 12, 2);

          Magia dribleMagico = new Magia("Drible Mágico", 68, 5);


          Arma faltaDesleal = new Arma("Falta Desleal", 22);

          Arma carrinhoFirme = new Arma("Carrinho Firme", 55);


          Poder catimbaDivina = new Poder("Catimba Divina", 34, 8);

          Poder desarmeDivino = new Poder("Desarme Divino", 80, 5);


       // herois

          Guerreiro kanemann = new Guerreiro("Kanemann",1000, 5,9);

          Clerigo geromel = new Clerigo("Geromel", 1000, 4, 10,10);

          Mago cebolinha = new Mago("Cebolinha", 1000, 9,3,10);

      //vilões

          Barbaro dourado = new Barbaro("Dourado", 1000, 4, 6);

          Druida dalessandro = new Druida("Dalessandro",1000, 7,3, 10);

          Feiticeiro paolo = new Feiticeiro("Paolo",1000, 8,2,10);

      //combate

         cebolinha.atacar(dourado,dribleMagico);
         dourado.atacar(geromel,faltaDesleal);
         geromel.atacar(paolo,desarmeDivino);
         kanemann.atacar(dalessandro,carrinhoFirme);
         dalessandro.atacar(cebolinha,catimbaDivina);

         cebolinha.imprimirEstado();
         dourado.imprimirEstado();
         geromel.imprimirEstado();
         kanemann.imprimirEstado();
         dalessandro.imprimirEstado();


     }

}
