package provadio.me;

import java.util.Scanner;

public class Velo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int velocidade = leitor.nextInt();
		int multas = leitor.nextInt();
	if (velocidade > 80) {
		multas++;
		System.out.println(multas + " multas. " + " Levou pontos na carteira");
	}else {
		System.out.println(multas + "multas." + "Nao levou pontos na carteira" );
	}
	}

}
