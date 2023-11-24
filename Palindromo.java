import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int a[], i, j;
        boolean verificador;
        a = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor do vetor A: ");
            a[i] = ler.nextInt();
        }

        verificador = true;
        j = TAM - 1;

        for(i=0; i<=TAM - 1; i++) {
            if(a[i] != a[j]) {
                verificador = false;
            }
            j--;
        }

        if(verificador == true) {
        	System.out.println();
            System.out.println("O numero acima é um palindromo");
        } else {
            System.out.println("O numero acima não é um  palindromo");
        }
    }
}
