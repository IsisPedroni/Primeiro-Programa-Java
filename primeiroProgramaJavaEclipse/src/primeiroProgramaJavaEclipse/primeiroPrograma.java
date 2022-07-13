package primeiroProgramaJavaEclipse;

import primeiroProgramaJavaEclipse.model.gato;


public class primeiroPrograma {

	public static void main(String[] args) {
		
		gato Gato = new gato();
		Livros livros = new Livros();
		
		System.out.println(Gato);
		System.out.println(livros);

	}

}



class Livros {
	private String nome;
	private String npag;
	
}