import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		float num = sc.nextFloat();

		if (num > 0) {
			System.out.printf("O número %.0f é POSITIVO", num);
		} else if (num < 0) {
			System.out.printf("O número %.0f é NEGATIVO", num);
		} else {
			System.out.println("O número 0 é NULO");
		}

	}

}
