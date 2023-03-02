package com.nestor.ejercicioFFC.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechasUtils {
	private static DateTimeFormatter esDateFormatLargo = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss")
			.withLocale(new Locale("es","ES"));
	private static DateTimeFormatter enDateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");

public static String obtenerFechaFormatoLargoPais(String codigoPais) {
	if(codigoPais.equals("ES")) {
		return LocalDateTime.now().format(esDateFormatLargo);
	} else {
		return LocalDateTime.now().format(enDateFormat);
	}
}
}