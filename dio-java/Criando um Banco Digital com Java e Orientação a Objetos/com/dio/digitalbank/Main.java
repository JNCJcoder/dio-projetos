package com.dio.digitalbank;

public class Main
{
    public static void main(String[] args)
    {
        Banco bancoInicial = new Banco();
        bancoInicial.setNome("Banco Um");

        Cliente jorge = new Cliente("Jorge", bancoInicial);
        jorge.setNome("Jorge Junior");
        
        Conta jorgeContaCorrente = new ContaCorrente(jorge);
        jorgeContaCorrente.depositar(1000);

        Conta jorgeContaPoupanca = new ContaPoupanca(jorge);
        jorgeContaCorrente.transferir(100, jorgeContaPoupanca);

        jorgeContaCorrente.imprimirExtrato();
        jorgeContaPoupanca.imprimirExtrato();

        bancoInicial.mostrarClientes();
    }
}

