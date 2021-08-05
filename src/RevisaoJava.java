/* FUP que some três números */

/**
 *
 * @author igor.porto
 */
public class RevisaoJava {

    //main = método inicializador da classe
    public static void main(String args[]) {

        //declarando variaveis e atribuindo valores
        int nota1 = 7;
        int nota2 = 10;
        int nota3 = 8;

        int faltas = 4;

        //criando variavel para armazenar a média das notas
        int media = (nota1 + nota2 + nota3) / 3;

        //teste condicional para verificar se o aluno foi aprovado ou reprovado
        /*
        == Igualdade
        <= Menor ou igual
        >= Maior ou igual
        != Diferente
        || Ou
        && E
         */
        if (media == 10 && faltas <= 4) {
            System.out.println("Aprovado!" + "\nnota = " + media + "\nFaltas = " + faltas + "\nExcelente!");
        } else if (media == 9 && faltas <= 4) {
            System.out.println("Aprovado! nota = " + media + " Faltas = " + faltas + " Muito bom!");
        } else if (media == 8 && faltas <= 4) {
            System.out.println("Aprovado!" + "\nnota = " + media + "\nFaltas = " + faltas + "\nBoa!");
        } else if (media == 7 && faltas <= 4) {
            System.out.println("Aprovado!" + "\nnota = " + media + "\nFaltas = " + faltas);
        } else if (media >= 7 && faltas > 4) {
            System.out.println("Reprovado por faltas!" + "\nnota = " + media + "\nFaltas = " + faltas);
        } else {
            System.out.println("Reprovado pela nota!" + "\nnota = " + media + "\nFaltas = " + faltas);
        }

    }
}
