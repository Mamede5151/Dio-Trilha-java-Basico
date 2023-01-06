package provadio.me;

import java.util.Scanner;

public class IndustriadaMulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int velocidadeAtual = leitor.nextInt();
		
	if (velocidadeAtual <= 60) {
		System.out.println("Não foi Multado");
		
	} else {
		System.out.println("Foi Multado");
	}

	}

}
