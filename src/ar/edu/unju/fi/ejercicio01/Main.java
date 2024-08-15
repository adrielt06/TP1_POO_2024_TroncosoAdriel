package ar.edu.unju.fi.ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese string a analizar:");
		String s = sc.nextLine();
		int resultado = substringCount(s.length(),s);
		System.out.println("Cadenas especiales en string: " + resultado);
		sc.close();
	}

	public static int substringCount (int n, String s){
		int cont = s.length();
		String subString;
		for(int i=0;i<=n-2;i++) {
			for(int j=i+2;j<=n;j++) {
				subString = s.substring(i,j);
				if(stringMismoCaracter(subString)==true || stringSimetrico(subString)==true) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public static boolean stringMismoCaracter(String s) {
		boolean valido=true;
		if(s.isBlank()) {
			return false;
		}
		char letra = s.charAt(0);
		for(int i=1;i<s.length() && valido != false;i++) {
			if(s.charAt(i) != letra) {
				valido=false;
				break;
			}
		}
		return valido;
	}
	
	public static boolean stringSimetrico(String s) {
		int inicio = 0, fin=s.length()-1;
		boolean valido = true;
		
		if(s.isBlank()) {
			return false;
		}
		
		while(inicio<fin) {
			if (s.charAt(inicio) != s.charAt(fin)) {
				valido = false;
				break;
			}
			inicio++;
			fin--;
		}
		
		return valido;
	}
}
