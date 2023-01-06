package provadio.me;

import java.util.Scanner;

public class MusicadaIrma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String arquivoDoPc = leitor.next();
		if(arquivoDoPc.endsWith("mp3")) {
			System.out.println("Salvar");
		}else {
			System.out.println("Deletar");
		}
	}

}
