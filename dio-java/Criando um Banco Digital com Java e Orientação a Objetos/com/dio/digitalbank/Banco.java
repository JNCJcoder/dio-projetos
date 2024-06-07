package com.dio.digitalbank;

import java.util.*;

public class Banco
{
    protected String nome;
    private List<Conta> contas;

    List<Cliente> clientes = new ArrayList<Cliente>();

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public List<Conta> getContas()
    {
        return contas;
    }

    public void setContas(List<Conta> contas)
    {
        this.contas = contas;
    }

    public void mostrarClientes()
    {
        System.out.println(clientes);
    }
}