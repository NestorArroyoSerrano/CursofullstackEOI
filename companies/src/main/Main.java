package main;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.nestor.companies.Company;
import com.nestor.companies.Person;

public class Main {
	
	
	public static void ejercicioArboles() {
		Map<Company, TreeSet<Person>> companies = 
				new TreeMap<>(
						(c1,c2)-> Double.compare(c1.getDinero(), c2.getDinero()));
		
		TreeSet<Person> tmp = new TreeSet<>(
				(p1,p2)->Integer.compare(p1.getEdad(), p2.getEdad()));
		tmp.add(new Person("p1C1", 35));
		tmp.add(new Person("p2C1", 56));
		tmp.add(new Person("p3C1", 43));
		
		companies.put(new Company("C1", 200000), tmp);
		tmp = new TreeSet<>(
				(p1,p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));
		tmp.add(new Person("p1C2", 52));
		tmp.add(new Person("p2C2", 26));
		tmp.add(new Person("p3C2", 13));
		companies.put(new Company("C2", 210000), tmp);
		
		tmp = new TreeSet<>(
				(p1,p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));
		tmp.add(new Person("p1C3", 32));
		tmp.add(new Person("p2C3", 46));
		tmp.add(new Person("p3C3", 23));
		companies.put(new Company("C3", 110000), tmp);
		
		companies.forEach((c,e)->System.out.println(c+ "" + e));
	}

	public static void main(String[] args) {
		ejercicioArboles();
	
	}
}
