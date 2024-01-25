package entidades;

import java.util.Objects;

public class CuentoDeHadas {

	private String titulo;
	private int numPaginas;
	
	
	public CuentoDeHadas() {
		
	}
	public CuentoDeHadas(String titulo, int numPaginas) {
		super();
		this.titulo = titulo;
		this.numPaginas = numPaginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentoDeHadas other = (CuentoDeHadas) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
	@Override
	public String toString() {
		return "CuentoDeHadas [titulo=" + titulo + ", numPaginas=" + numPaginas + "]";
	}
	
	
}
