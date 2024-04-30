import java.util.Scanner;

public class Counter {
	
	public static void counter(int times) {
		for(int i = 1; i<=times; i++) {
			System.out.println(i);
		}
	}
	
	public static void compareParameters(int first, int second) {
		if(second < first) {
			throw new InvalidParametersException("O primeiro parametro deve ser maior que o segundo!");
		}
		
		int diference = second - first;
		counter(diference);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Primeiro numero: ");
		int firstNumber = sc.nextInt();
		System.out.printf("\nSegundo numero:");
		int secondNumber = sc.nextInt();
		
		try {
			compareParameters(firstNumber, secondNumber);
			
		}catch(InvalidParametersException e) {
			System.err.println(e.getMessage());
		}

	}

}
