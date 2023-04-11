import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		float num1 = sc.nextFloat();

		System.out.print("Digite o segundo número: ");
		float num2 = sc.nextFloat();

		float maiorNumero = num1;
		if (num2 > num1) {
			maiorNumero = num2;
		}

		System.out.println("O maior número é " + maiorNumero);
		
		sc.close();
	}
}
