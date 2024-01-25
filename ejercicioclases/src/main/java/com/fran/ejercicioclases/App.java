package com.fran.ejercicioclases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fran.ejercicioclases.utilidades.FicherosUtils;



/**
 * Hello world!
 *
 */
public class App 
{
	
	public static Scanner sc = new Scanner(System.in);

	public static final String DIRECTORIO = "C:\\Users\\Néstor\\Documents\\FullstackEOI\\CursofullstackEOI\\ejercicioclases\\src\\main\\java\\ficheros";
	public static final String FICHERO_SANTANDER = "santander.txt";
	public static final String FICHERO_SABADELL = "sabadell.txt";
	public static final String FICHERO_CAIXA = "caixa.txt";
	public static List<CuentaSantander> cuentasSantander = new ArrayList<CuentaSantander>();
	public static List<CuentaSabadell> cuentasSabadell = new ArrayList<CuentaSabadell>();
	public static List<CuentaCaixa> cuentasCaixa = new ArrayList<CuentaCaixa>();
	public static List<Cuenta> cuentas = new ArrayList<Cuenta>();
	

	
	
	public static void crearCuentasBancos() throws IOException {
		List<String> lineasSantander = FicherosUtils.devolverLineasFichero8(DIRECTORIO, FICHERO_SANTANDER);
		lineasSantander.forEach(l->cuentasSantander.add(new CuentaSantander(l)));
		List<String> lineasSabadell = FicherosUtils.devolverLineasFichero8(DIRECTORIO, FICHERO_SABADELL);
		lineasSabadell.forEach(l->cuentasSabadell.add(new CuentaSabadell(l)));
		List<String> lineasCaixa = FicherosUtils.devolverLineasFichero8(DIRECTORIO, FICHERO_CAIXA);
		lineasCaixa.forEach(l->cuentasCaixa.add(new CuentaCaixa(l)));
	}
	
	public static void unirListasCuentas() {
		cuentas.addAll(cuentasSantander);
		cuentas.addAll(cuentasSabadell);
		cuentas.addAll(cuentasCaixa);
		Cuenta.imprimirListaHijos(cuentas);	
	}
	
	public static void eliminarElementoAleatorio() {
		cuentas.remove(numeroAleatorio(cuentas));
	}
	
	public static <T> int numeroAleatorio(List<T> lista) {
		 return (int)Math.floor(Math.random()*lista.size()); //devuelve un número entre 0 y tamaño de la lista-1
	}
	
	public static void buscarElementoBorrado() {
		if(!cuentas.containsAll(cuentasSantander)) {
			cuentasSantander.forEach(c->{
				if(!cuentas.contains(c)) {
					System.out.println("La cuenta borrada es: " + c);
					//cuentas.add(c);
				}
			});
		} else if(!cuentas.containsAll(cuentasSabadell)) {
			cuentasSabadell.forEach(c->{
				if(!cuentas.contains(c)) {
					System.out.println("La cuenta borrada es: " + c);
				}
			});
		} else if(!cuentas.containsAll(cuentasCaixa)) {
			cuentasCaixa.forEach(c->{
				if(!cuentas.contains(c)) {
					System.out.println("La cuenta borrada es: " + c);
				}
			});
		}
	}
	
	public static void totalesSantander() {
		//System.out.println(cuentasSantander.stream().mapToDouble(c->c.getSaldo()).sum());
		System.out.println(cuentasSantander.stream().mapToDouble(CuentaSantander::getSaldo).sum());
		System.out.println(cuentasSantander.stream().count());
		System.out.println(cuentasSantander.stream().mapToDouble(CuentaSantander::getSaldo).max().orElse(0));	
	}
	
    public static void main( String[] args ) throws IOException
    {
    	//crearCuentasBancos();
    	//unirListasCuentas();
    	//eliminarElementoAleatorio();
    	//buscarElementoBorrado();
    	totalesSantander();
    	
    }
}
