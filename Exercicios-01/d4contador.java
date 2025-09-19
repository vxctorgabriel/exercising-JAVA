import java.util.Scanner;

public class d4contador {
    public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    String [] palavras = new String[5];

    for(int i = 0; i<palavras.length; ++i) {
        System.out.println("Digite a palavra "+(i+1)+":");
        palavras[i] = read.nextLine();
    }
    int comecaComA = 0;
    int maisDeCinco = 0;

    for (int i= 0; i<palavras.length; ++i) {
        String palavra = palavras[i];

        if (palavra.toLowerCase().startsWith("a")) {
            comecaComA++;
        }

        if (palavra.length() > 5) {
            maisDeCinco++;
        }
    }
    System.out.println(maisDeCinco + "palavras tiveram mais de cinco caracteres");
    System.out.println(comecaComA+ "palavras começaram com a letra A");
}

}
