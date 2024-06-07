package com.dio.digitalbank;

public abstract class Conta implements IConta
{
    private static final int AGENCIA_PADRAO = 1;
    private static int CHAVE = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    public Conta(Cliente cliente)
    {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = CHAVE++;
        this.cliente = cliente;
    }

    public Conta()
    {

    }

    public static int getSEQUENCIAL()
    {
        return CHAVE;
    }

    public int getAgencia()
    {
        return agencia;
    }

    public int getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    @Override
    public String toString()
    {
        return String.format(
            "Conta { agencia=%d, numero=%d, saldo=%.2f, cliente=%s }",
            agencia,
            numero,
            saldo,
            cliente.getNome()
        );
    }

    protected void imprimirInfosComuns()
    {
        System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
        System.out.printf(String.format("Agência: %d%n", this.agencia));
        System.out.printf(String.format("Número: %d%n", this.numero));
        System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
    }

    @Override
    public void sacar(double valor)
    {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor)
    {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino)
    {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato()
    {

    }
}
