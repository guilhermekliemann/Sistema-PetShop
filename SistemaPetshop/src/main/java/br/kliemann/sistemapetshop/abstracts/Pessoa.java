package br.kliemann.sistemapetshop.abstracts;

import br.kliemann.sistemapetshop.model.Endereco;

public abstract class Pessoa {
    
    private String nome;
    private String cpf;
    private String rg;
    private String nrTelefone;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, String rg, String nrTelefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.nrTelefone = nrTelefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public abstract String toString();

}
