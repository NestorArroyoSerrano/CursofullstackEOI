package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import ejerciciosColeccionesBorrarLuego.entidades.Persona;

public class Main {
	
	public static void ejercicio1() {
		List <Integer> numeros = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		numeros.add(50);
		numeros.add(60);
		numeros.removeIf(e->e==20);
		numeros.add(1, 25);
		numeros.add(2, 26);
		numeros.sort(Collections.reverseOrder());
		//Collections.reverse(numeros);
		numeros.forEach(e->System.out.println(e));
	}
	public static void ejercicio3() {
		Map <Integer, Persona> personas = new HashMap<>();
		personas.put(48718930, new Persona("Néstor", 27));
		personas.put(00001111, new Persona("Pedro", 34));
		personas.put(00002222, new Persona("Pepe", 54));
		
		/*
		for(Map.Entry<Integer, Persona> entry : personas.entrySet()) {
			Integer dni = entry.getKey();
			Persona persona = entry.getValue();
			System.out.println(persona);
		*/	
			//personas.forEach((Integer, Persona)-> System.out.println("El DNI de esta persona es " +Integer + " y esta persona es " + Persona));
		}
	
	public static void ejercicio4() {
		List <Integer> numeros = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 69, 70, 73, 85));
		List <Integer> numeros2 = new ArrayList<Integer>(numeros);
		
		numeros2.replaceAll(n->n/2);
		numeros2.removeIf(n->n%2 != 0);
		numeros2.forEach(System.out::println);
	}
	public static void ejercicio5() {
		Set<String> cadenas = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		boolean salir = false;
		
		while(!salir) {
			System.out.println("Dime una palabra:  (escribe 'salir' para acabar el programa)");
			String palabra = sc.nextLine();
			if(palabra.toLowerCase().equals("salir")) {
				salir = true;
			}else {
				if(cadenas.contains(palabra)) { 		
					System.out.println("La palabra "+ palabra + " ya está en el conjunto");
				}else {
					cadenas.add(palabra);
				}
				
			}
		}
	
	}	
	
	/*
	 * 
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). 
You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
	 */
	
	/*
	 * StringBuilder resultado = new StringBuilder();
    base = base.toLowerCase();
    remove = remove.toLowerCase();
    
    int i = 0;
    while (i < base.length()) {
        int endIndex = i + remove.length();

        if (endIndex <= base.length() && base.substring(i, endIndex).equals(remove)) {
            i = endIndex; // Salta la parte removida
        } else {
            resultado.append(base.charAt(i));
            i++;
        }
    }

    return resultado.toString();
}
	 */
	public static String withoutString(String base, String remove) {
		
		 return base.replaceAll("(?i)" + remove, "");
	}
	/*
	 * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" 
	 * anywhere in the string (case sensitive).

		equalIsNot("This is not") → false
		equalIsNot("This is notnot") → true
		equalIsNot("noisxxnotyynotxisi") → true
	 */
	public static boolean equalIsNot(String str) {
		int isCount = 0;
	    int notCount = 0;

	    for (int i = 0; i < str.length() - 1; i++) {
	        if (str.startsWith("is", i)) {
	            isCount++;
	        }
	        if (str.startsWith("not", i)) {
	            notCount++;
	        }
	    }

	    return isCount == notCount;
	}
	/*
	 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. 
	 * Return true if all the g's in the given string are happy.
	
		gHappy("xxggxx") → true
		gHappy("xxgxx") → false
		gHappy("xxggyygxx") → false
	 */
	public boolean gHappy(String str) {
		
		 if (str.length() == 1 && str.charAt(0) == 'g') {
		        return false; // Si hay solo una 'g', retorna false
		    }

		    for (int i = 0; i < str.length(); i++) {
		        if (str.charAt(i) == 'g') {
		            // Verifica si la 'g' actual no tiene otra 'g' a su izquierda o derecha
		            if ((i > 0 && str.charAt(i - 1) != 'g') && (i == str.length() - 1 || str.charAt(i + 1) != 'g')) {
		                return false; // Si no tiene otra 'g' a su izquierda o derecha, retorna false
		            }
		        }
		    }
		    return true; // Si todas las 'g' están felices, retorna true
		}
	/*
	 * 
	We'll say that a "triple" in a string is a char appearing three times in a row. 
	Return the number of triples in the given string. The triples may overlap.

		countTriple("abcXXXabc") → 1
		countTriple("xxxabyyyycd") → 3
		countTriple("a") → 0
	 */
	
	public int countTriple(String str) {
		  
		int contador = 0;
		
		for (int i = 0; i<str.length()-2; i ++) {
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)) {
				contador++;
			}
		}
		return contador;
	}
	
	/*
	 * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. 
	 * Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
	 *  Integer.parseInt(string) converts a string to an int.)

		sumDigits("aa1bc2d3") → 6
		sumDigits("aa11b33") → 8
		sumDigits("Chocolate") → 0
	 */
	public static int sumDigits(String str) {
		/*
		int suma = 0;
		for (int i = 0; i < str.length(); i++) {
	        char currentChar = str.charAt(i);

	        if (Character.isDigit(currentChar)) {
	            int digit = Character.getNumericValue(currentChar);
	            suma += digit;
	        }
	    }

	    return suma;
	}
	*/
	
		// Con programación funcional
	return str.chars()
            .filter(Character::isDigit)
            .map(Character::getNumericValue)
            .sum();
	
	}

	/*
	 * Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. 
	 * For example, sameEnds("abXab") is "ab".


	sameEnds("abXYab") → "ab"
	sameEnds("xx") → "x"
	sameEnds("xxx") → "x"
	 */
	public static String sameEnds(String str) {
		  
		 int length = str.length();
	        int maxLength = 0;
	        String result = "";

	        // Iterar hasta la mitad de la cadena
	        for (int i = 0; i < length / 2; i++) {
	            String prefix = str.substring(0, i + 1);
	            String suffix = str.substring(length - i - 1, length);

	            // Verificar si las subcadenas coinciden
	            if (prefix.equals(suffix)) {
	                maxLength = i + 1;
	                result = prefix;
	            }
	        }

	        return result;
	    }
	

/*
 * 
	Given a string, return the length of the largest "block" in the string. 
	A block is a run of adjacent chars that are the same.


	maxBlock("hoopla") → 2
	maxBlock("abbCCCddBBBxx") → 3
	maxBlock("") → 0
 */
	public static int maxBlock(String str) {
		
		if (str.isEmpty()) {
	        return 0;
	    }

	    int maxBlockLength = 1;  // Inicializamos con 1 porque hay al menos un caracter en la cadena.
	    int currentBlockLength = 1;

	    for (int i = 1; i < str.length(); i++) {
	        if (str.charAt(i) == str.charAt(i - 1)) {
	            // El caracter actual es igual al anterior, incrementamos la longitud del bloque actual.
	            currentBlockLength++;
	        } else {
	            // El caracter actual es diferente al anterior, reiniciamos la longitud del bloque actual.
	            currentBlockLength = 1;
	        }

	        // Actualizamos la longitud máxima del bloque si es necesario.
	        maxBlockLength = Math.max(maxBlockLength, currentBlockLength);
	    }

	    return maxBlockLength;
	}
	/*
	 * 
		Given a string, return the sum of the numbers appearing in the string, 
		ignoring all other characters. A number is a series of 1 or more digit chars in a row. 
		(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
		
		
		sumNumbers("abc123xyz") → 123
		sumNumbers("aa11b33") → 44
		sumNumbers("7 11") → 18
	 */
	 public static int sumNumbers(String str) {
		 /*
	        int sum = 0;
	        int currentNumber = 0;
	        boolean inNumber = false;

	        for (char c : str.toCharArray()) {
	            if (Character.isDigit(c)) {
	                // Si el carácter es un dígito, lo agregamos al número actual.
	                currentNumber = currentNumber * 10 + Character.getNumericValue(c);
	                inNumber = true;
	            } else {
	                // Si el carácter no es un dígito y estábamos en medio de un número, lo sumamos al total.
	                if (inNumber) {
	                    sum += currentNumber;
	                    currentNumber = 0;
	                    inNumber = false;
	                }
	            }
	        }

	        // Sumamos el último número si estábamos en medio de uno.
	        if (inNumber) {
	            sum += currentNumber;
	        }

	        return sum;
	    }
	    */
	
		
		 return Arrays.stream(str.split("\\D+"))   // Paso 1: Dividir la cadena en substrings
		            .filter(s -> !s.isEmpty())         // Paso 2: Filtrar strings no vacíos
		            .mapToInt(Integer::parseInt)       // Paso 3: Convertir a enteros
		            .sum();                            // Paso 4: Sumar los enteros
          
 }
	 
	 /*
	  * Given a string, return a string where every appearance of the lowercase word "is" 
	  * has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so 
	  * for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)


			notReplace("is test") → "is not test"
			notReplace("is-is") → "is not-is not"
			notReplace("This is right") → "This is not right"
	  */
	 
	 public String notReplace(String str) {
		 /*
		  * (?<!\\pL): Esto se llama "negative lookbehind" y asegura que "is" no esté precedido por ninguna letra 
		  * (\\pL representa cualquier letra). En otras palabras, coincide con "is" solo si no hay una letra justo antes de él.
			is: Coincide literalmente con la cadena "is".
			(?!\\pL): Esto se llama "negative lookahead" y asegura que "is" no esté seguido por ninguna letra. En otras palabras, coincide con "is" solo si no hay una letra justo después de él.
		  */
		  
		 return str.replaceAll("(?<!\\pL)is(?!\\pL)", "is not"); 
		 
				 
	 }

	

	

	
public static void main(String[] args) {
	//ejercicio1();
	//ejercicio3();
	//ejercicio4();
	//ejercicio5();
	//System.out.println(withoutString("Hola amigo que tal estás", "a"));
	//System.out.println(equalIsNot("is isisisis not not not not"));
	
	}
}
