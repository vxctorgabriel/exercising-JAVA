import java.util.Scanner;

public class c3notas {

    static Scanner read= new Scanner(System.in);
    public static void main(String[] args) {

        double[] notas = new double[10];

        for (int i = 0; i < 10; ++i) {
            System.out.println("Digite o nota do aluno" + (i + 1) + ":");
            notas[i] = read.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < notas.length; ++i) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("A media e igual a " + media + "!");
    }
    }

