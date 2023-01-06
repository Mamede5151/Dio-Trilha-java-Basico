package provadio.me;

import java.util.Scanner;

public class Tia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int paginas = leitor.nextInt();
		int paginasLidas = 3; 
		double dias = Math.ceil((double)paginas / (double)paginasLidas);
		int tempo = (int)dias;
		System.out.println(tempo + "dias");
		

	}

}
