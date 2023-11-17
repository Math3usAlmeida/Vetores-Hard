package exercicios;
import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		final int TAM=10;
		int i=0,a[];
		int base=2;
     
		a = new int[TAM];
		Scanner ler = new Scanner(System.in);
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o numero que deseja saber a potencia");
			
			a[i] = ler.nextInt();
		}

		for(i=0;i<TAM;i++) {
			double potencia = Math.pow(2, a[i]);
			System.out.println("A base "+base+" elevada ao expoênte "+a[i]+" é igual à potência "+potencia);
;
		}
	}

}