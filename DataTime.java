package provadio.me;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data Atual em formato padrão de String " + SimpleDateFormat.format(date));
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Imprimindo em formato para banco de dados " + simpleDateFormat2.format(date));;
	}

}
