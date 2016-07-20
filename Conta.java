class Conta {
	
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double deposito) {
		this.saldo += deposito;
	}

	public void saca(double saque) {

		if (this.saldo < saque) {

			System.out.println("Saldo insuficiente.");
			return;
		}
		this.saldo -= saque;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
}