package java2;

public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}

}
