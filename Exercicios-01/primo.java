import java.util.Scanner;

public class primo {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite um número primo");
        int n1 = read.nextInt();

        if (n1 % n1 == 0)
            System.out.println("é primo");
        else
            System.out.println("Não é primo");
    }
}
