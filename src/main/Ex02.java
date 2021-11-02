package main;

import classes.Item;
import classes.Livro;
import classes.Midia;
import classes.CD;
import classes.VHS;

public class Ex02 {

	public static void main(String[] args) {
		Item i = new Item(01, "caneca");
		
		System.out.println(i);
		
		Livro l = new Livro(02, "Harry Potter", "J.K Rowling");
		
		System.out.println(l);
		
		Midia m = new Midia(03, "Som", "Cometa", 3);
		
		System.out.println(m);
		
		CD c = new CD(04, "CD", "Foguete", 10, 5, "Carlos", "Chimitão");
		
		System.out.println(c);
		
		VHS v = new VHS(05, "VHS", "Estrela", 4, "Lola");
		
		System.out.println(v);
	}

}
