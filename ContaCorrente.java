package java2;

public class ContaCorrente extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
}