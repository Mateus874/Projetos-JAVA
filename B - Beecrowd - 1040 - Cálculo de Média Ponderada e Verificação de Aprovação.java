import java.io.IOException;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

import static java.lang.System.*;

public class Beecrowd {


    /**Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às
     *  quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada
     *  uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for
     *  maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior
     *  a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9,
     *  inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

     No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
     Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média
     (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem
     "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha
     ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na
     última linha uma mensagem "Media final: " seguido da média final para esse aluno.

     Entrada
     A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

     Saída
     Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser
     impressas conforme a descrição do problema. Não esqueça de imprimir o enter após o final
     de cada linha, caso contrário obterá "Presentation Error".*/


public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite 4 números");
    float N1 = input.nextFloat();
    float N2 = input.nextFloat();
    float N3 = input.nextFloat();
    float N4 = input.nextFloat();

    float mediaPonderada = ((N2 * 3) + (N1 * 2) + (N3 * 4) + (N4 * 1)) / (2+3+4+1);

    System.out.printf("Media: %.1f%n", mediaPonderada);

    //condições do resultado das primeira etapas
        if (mediaPonderada >= 7) {
            System.out.println("Aluno aprovado.");
        }else if(mediaPonderada < 5){
            System.out.println("Aluno reprovado.");
        }else {

        //Aluno reprovado e em exame
            System.out.println("Aluno em exame.");
            System.out.println("Digite a nota do exame");
            float N5 = input.nextFloat();

            System.out.printf("Nota do exame: %.1f%n", N5);// teste

            float Mediaexame = (mediaPonderada + N5) / 2;


            if(Mediaexame >= 5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", Mediaexame);
    }
}}
