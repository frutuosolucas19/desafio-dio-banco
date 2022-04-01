package interfaces;

import java.text.ParseException;
import model.Conta;


/**
 *
 * @author lucas
 */
public interface IConta {

    void sacar(Conta conta, double valor);

    void depositar(Conta conta, double valor);

    void transferir(Conta suaConta, Conta contaDestino, double valor);
  
    void solicitarCartao(Conta conta) throws ParseException;
    
    void exibirDadosBancarios(Conta conta);
    
}
