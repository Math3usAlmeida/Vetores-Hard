import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 1;
		int a[], b[], i, j, f;
		a = new int[TAM];
		b = new int[TAM];
		
		//leitura do vetor A
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"° valor do vetor A: ");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
		
			f = a[i];
			for(j = a[i] - 1; j > 0; j--) {
				f = f * i;
			}
			b[i] = f;
		}
		
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			if(i == (TAM-1)) {
				System.out.print(b[i]);
			}else {
				System.out.print(b[i]+", ");
			}
		}
		System.out.print(" ]");
	}
}