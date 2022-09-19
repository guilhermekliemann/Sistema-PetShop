package br.kliemann.sistemapetshop.model;

import br.kliemann.sistemapetshop.abstracts.Pessoa;

public class MedicoVeterinario extends Pessoa {
    
    private int cfmv;

    public MedicoVeterinario(int cfmv, String nome, String cpf, String rg, String nrTelefone, Endereco endereco) {
        super(nome, cpf, rg, nrTelefone, endereco);
        this.cfmv = cfmv;
    }
   
    public int getCfmv() {
        return cfmv;
    }

    public void setCfmv(int cfmv) {
        this.cfmv = cfmv;
    }
    
    public String toString() {
        return "{ CFMV: " + this.cfmv + "\nNome: " + getNome() + "\nCPF: " + 
                getCpf() + "\nRG: " + getRg() + "\nTelefone: " + getNrTelefone()
                + "\nEndereço:\n" + getEndereco() + " }";
    }
    
}
