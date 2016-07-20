package java2;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public void deposita(double deposito) {
		super.deposita(deposito - 0.1);
	}
}