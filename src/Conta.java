
/**
 *
 * @author lucas
 */
public abstract class Conta implements IConta {

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    @Override
    public void sacar(double valor) {
    }

    @Override
    public void depositar(double valor) {
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
    }

    @Override
    public void imprimirExtrato() {
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    
    
}
