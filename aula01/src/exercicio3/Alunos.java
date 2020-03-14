package exercicio3;

public class Alunos {

    String nome;
    double nota;


 Alunos(String nome , double nota ) {
    this.nome=nome;
    this.nota=nota;
 }

    boolean aprovado(){
        return nota >= 7;
    }


}



