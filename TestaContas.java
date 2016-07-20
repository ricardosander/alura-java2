package java2;

public class TestaContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.deposita(1000); 
        cp.deposita(1000);

        cc.atualiza(0.01);
        cp.atualiza(0.01);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}