import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o um número: ");
		float num = sc.nextFloat();
		
		if (num > 0) {
			System.out.printf("O número %.2f é positivo", num);
		} else if (num < 0) {
			System.out.printf("O número %.2f é negativo", num);
		} else {
			System.out.println("O número 0 é NULO");
		}
		
		sc.close();
	}

}
