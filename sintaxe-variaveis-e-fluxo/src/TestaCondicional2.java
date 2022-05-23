
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas > 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo(a)");
		} else {
			System.out.println("Você não pode entrar");
		}
		
	}
}
