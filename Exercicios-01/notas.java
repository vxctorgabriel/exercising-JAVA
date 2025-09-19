import java.util.Scanner;

public class notas {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        double[] notas = new double[10];

        for (int i = 0; i < 10; ++i) {
            System.out.println("Digite a nota do aluno" + (i + 1) + ":");
            notas[i] = read.nextDouble();
        }
    }

}
