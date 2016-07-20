package java2;

public abstract class Conta {
	
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double deposito) {
		
		if (deposito <= 0) {
			throw new ValorInvalidoException("O valor de depósito informado não é válido.");
		}
		this.saldo += deposito;
	}

	public void saca(double saque) {

		if (this.saldo < saque) {

			System.out.println("Saldo insuficiente.");
			return;
		}
		this.saldo -= saque;
	}

	public abstract void atualiza(double taxa);
}