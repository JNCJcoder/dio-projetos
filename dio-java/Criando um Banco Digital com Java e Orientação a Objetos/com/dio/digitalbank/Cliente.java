package com.dio.digitalbank;

public class Cliente
{
    public Banco banco;
    public String nome;
    public String email;
    public String endereco;
    public String telefone;

    public Cliente(String nome, Banco banco)
    {
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    public Cliente(String nome, String email, String endereco, String telefone)
    {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public void setBanco(Banco banco)
    {
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    @Override
    public String toString()
    {
        return String.format(
            "Cliente { banco= %s, nome='%s' }", 
            banco.nome, this.getNome()
        );
    }
}
