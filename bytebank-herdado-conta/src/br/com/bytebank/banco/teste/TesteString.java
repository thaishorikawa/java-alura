package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
	
		String nome = "Alura"; //object literal
		//String outro = new String("Alura"); 
		
		String outra = nome.replace("A", "a");
		
		
		//char c = 'A';
		//char d = 'a';
		//String outra = nome.replace(c, d);
		
		//String outra = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outra);
	}

}
