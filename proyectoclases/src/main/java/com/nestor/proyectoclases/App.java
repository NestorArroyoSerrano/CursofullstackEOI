package com.nestor.proyectoclases;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nestor.proyectoclases.entidades.Cuenta;
import com.nestor.proyectoclases.entidades.CuentaCaixa;
import com.nestor.proyectoclases.entidades.CuentaSabadell;
import com.nestor.proyectoclases.entidades.CuentaSantander;
import com.nestor.proyectoclases.enumerados.NivelCatalan;
import com.nestor.proyectoclases.utilidades.FicherosUtils;

public class App 
{
	
	private static Scanner sc;
	private static List<Cuenta> cuentas = new ArrayList<Cuenta>();
	private static List<CuentaCaixa> cuentasCaixa = new ArrayList<CuentaCaixa>();
	
	
	public static void pruebas() {
        //Cuenta c = new Cuenta();
    	//CuentaSabadell cs = new CuentaSabadell();
    	CuentaCaixa cc = new CuentaCaixa();
    	CuentaCaixa cc2 = new CuentaCaixa("111", "Fran", LocalDate.now(), "ES", 10000,NivelCatalan.Alto);
    	CuentaCaixa cc3 = new CuentaCaixa(cc2);
    	CuentaCaixa cc4 = new CuentaCaixa(cc);
    	System.out.println(cc);
    	System.out.println(cc2);
    	System.out.println(cc3);
    	System.out.println(cc4);
    	CuentaSantander cs = new CuentaSantander();
    	CuentaSantander cs2 = new CuentaSantander("222", "Fran", LocalDate.now(), "ES", 20000,true);
    	CuentaSantander cs3 = new CuentaSantander(cs2);
    	System.out.println(cs);
    	System.out.println(cs2);
    	System.out.println(cs3);
    	System.out.println("El número de cuentas del santander es: " + CuentaSantander.getContador());
	}
	
	public static void anyadirCuentasCaixa() {
    	List<String> listaccstring = FicherosUtils.devolverLineasJava8(Paths.get("C:/ficheros/datosbancos/caixa.txt"));
    	
    	for(String cuenta : listaccstring) {  // a partir de las líneas del fichero las añado a la lista de cuentas de la caixa
    		String[] partes = cuenta.split(";");
    		cuentasCaixa.add(new CuentaCaixa(partes[0],
    				partes[1],
    				LocalDate.parse(partes[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
    				partes[3],
    				Double.parseDouble(partes[4]),
    				NivelCatalan.Medio
    				));
    	}
    	
    	// probamos que la lista está rellena
    	
    	/*cuentasCaixa.stream()
    	.filter(e->e.getSaldo()>30000)
    	.forEach(e->System.out.println(e));*/
    	
    	cuentas.addAll(cuentasCaixa);  // esto añade todas las cuentas de la caixa dentro de la lista de cuentas
 
	}
	
	public static void metodo1() {
		System.out.println("Introduce valor: ");
		int numero = Integer.parseInt(sc.nextLine());
		System.out.println(numero);
	}
	
	public static void metodo2() {
		System.out.println("Introduce valor2: ");
		int numero = Integer.parseInt(sc.nextLine());
		System.out.println(numero);
	}
	
    public static void main( String[] args )
    {
    	sc = new Scanner(System.in);
    	anyadirCuentasCaixa();
    	//metodo1();
    	//metodo2();

    	sc.close();
    }
}
