package com.br.jellit.java.tips.dates; 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Jefferson S Santos
 * @since 27/06/2017
 * @version 1.0.0
 * */
public class DifferenceBetweenDates {

	
	public static void diffDias(String date) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();

		try {

			sdf.setLenient(false);
			data1.setTime(new Date());
			data2.setTime(sdf.parse(date));

			int dias = data2.get(Calendar.DAY_OF_YEAR) - data1.get(Calendar.DAY_OF_YEAR);

			System.out.println(String.format("%s",
					dias > 0 ? "Ainda restam " + String.valueOf(dias) + " dias para a data escolhida!"
							: "Já se passaram " + String.valueOf(dias * (-1))
									+ " dias entre a data escolhida e o dia de hoje!"));

		} catch (Exception e) {
			if (e instanceof ParseException) {
				System.out.println("ERROR...: Data invalida! \nCausa...: " + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		
		diffDias("32/06/2017");
		
	}

}
