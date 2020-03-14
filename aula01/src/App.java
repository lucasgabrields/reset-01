public class App {

     public static void main(String[] args) {
          Calculadora calculadoraDeIdades = new Calculadora();
          int somaDasIdades = calculadoraDeIdades.somar(32, 55);
          System.out.println(somaDasIdades);

          int subtraçãoDasIdades = calculadoraDeIdades.subtrai(10, 3);

          System.out.println(subtraçãoDasIdades);

          int multiplicaçãoDasIdades = calculadoraDeIdades.multiplicar(6, 5);

          System.out.println(multiplicaçãoDasIdades);

          int divisãoDasIdades = calculadoraDeIdades.dividir(10, 5);

          System.out.println(divisãoDasIdades);

          Comparador comparadorDeIdades = new Comparador();

          boolean comparaçãoDeValores = comparadorDeIdades.menorQue(1, 2);

          System.out.println(comparaçãoDeValores);
     }
}