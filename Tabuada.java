package exercicios;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		final int TAM=5;
		int i,a[];
		int n,m;
		a = new int[TAM];
		Scanner ler = new Scanner(System.in);
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o numero que deseja saber a tabuada");
			
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println(" ");
			System.out.println("A tabuada "+(i+1));
			for(n=0;n<=10;n++) {
				m=a[i] * n;
				System.out.println(n+"x"+a[i]+ "=" +m+"");
				
			}

		}
	}

}
