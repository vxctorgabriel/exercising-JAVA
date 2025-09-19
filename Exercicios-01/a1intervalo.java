import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class a1intervalo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite o primeiro número");
        int nm1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        int nm2 = sc.nextInt();

        int soma = 0;

        int inicio= Math.min(nm1,nm2);
        int fim = Math.max(nm1,nm2);

        for (int i = inicio; i <= fim; i++) {
            soma+=i;
        }
        System.out.println(soma);
        }
    }