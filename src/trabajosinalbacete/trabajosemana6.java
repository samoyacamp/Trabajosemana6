package trabajosinalbacete;

import java.util.Scanner;

public class trabajosemana6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letters[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int contador = 0;
		
		String frase = "";
		String frase2 = "";
		{
		}
		Scanner sc = null;
		frase = sc.nextLine().trim();
		frase2 = sc.nextLine().trim();
		if (frase.length() == frase2.length()) {
			for (int i = 0; i < frase.length(); i++) {

				if (!frase2.contains(String.valueOf(frase.charAt(i)))) {
					System.out.println("Las frases son diferentes");
					contador++;
				}
			}
			System.out.println("Es anagrama de la frase");
		} else {
			System.out.println("La cantidad de caracteres es distinta");
		}
	}

}
