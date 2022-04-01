package model;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author lucas
 */
public class Conta extends Banco {

    private String numero;
    private boolean ativa;
    private double saldo;
    private Cliente cliente;
    private Date dataCriacao;
    private CartaoCredito cartaoCredito;
    private boolean possuiCredito;

    public Conta() {
        Random random = new Random();
        this.numero = "" + random.nextInt(4) + "-" + random.nextInt(1);
        this.cliente = new Cliente();
        this.saldo = 0.0;
        this.ativa = Boolean.TRUE;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public boolean isPossuiCredito() {
        return possuiCredito;
    }

    public void setPossuiCredito(boolean possuiCredito) {
        this.possuiCredito = possuiCredito;
    }

}
