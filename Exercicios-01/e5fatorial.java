import java.util.Scanner;

public class e5fatorial {
    static Scanner read= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite um número inteiro");
        int num = read.nextInt();

        int fatorial = 1;
        for (int i = num; i>0; --i ){
            fatorial *= i;
        }

        System.out.println(num + "! = " + fatorial);
    }
}
