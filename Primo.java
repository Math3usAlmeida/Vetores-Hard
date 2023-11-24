import java.util.Scanner;
public class Primo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, j, qtde = 0;
		a = new int[TAM];
		

		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"° valor do vetor A: ");
			a[i] = ler.nextInt();
		}
		

		for(i=0; i<TAM; i++) {
			
			for(j=1;j<=a[i];j++) {
				if(a[i] % j == 0){
					qtde++;
				}
			}
			
			if(qtde<3) {
				System.out.println(a[i]+" É primo");
				qtde =0;
			} else {
				System.out.println(a[i]+" Não é primo");
				qtde = 0;
			}
		}	
	}

}
