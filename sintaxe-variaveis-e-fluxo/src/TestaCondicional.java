
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 17;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem-vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voc� n�o tem 18, mas pode entrar" + " porque est� acompanhado");
			} else {
				System.out.println("infelizmente voc� n�o pode entrar");
			}

		}
	}
}
