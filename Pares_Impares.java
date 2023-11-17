package exercicios;
import java.util.Scanner;
public class Pares_Impares {
	public static void main(String[] args) {
		final int TAM=5;
		int i, a[], b[];
		a  = new int[TAM];
		b = new int[TAM];
		Scanner ler = new Scanner(System.in);
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o numero que deseja saber se é par ou impar");
			
			a[i] = ler.nextInt();
			
		
		}
		System.out.print("[");
		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				b[i]=a[i];
				System.out.print(b[i]+" ");
			}
			
			}
		System.out.print("/");
			for(i=0;i<TAM;i++) {
			if(a[i]%2!=0) {
				b[i]=a[i];
				System.out.print(b[i]+" ");
		}


		}
			System.out.println("]");

		   
		
		

	}

}
