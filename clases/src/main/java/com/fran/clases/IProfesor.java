package com.fran.clases;

import java.time.LocalDate;
import java.util.List;

public interface IProfesor {
	
	public boolean pasarFaltas(List<String> alumnos);
	public boolean ficharAsistencia(LocalDate dia);
	public boolean metodo3();

}
