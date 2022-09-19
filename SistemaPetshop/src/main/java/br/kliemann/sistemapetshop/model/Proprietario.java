package br.kliemann.sistemapetshop.model;

import br.kliemann.sistemapetshop.abstracts.Pessoa;

public class Proprietario extends Pessoa {
    
    private int idProprietario;
    private Pet descPet;

    public Proprietario(int idProprietario, Pet descPet, String nome, String cpf, String rg, String nrTelefone, Endereco endereco) {
        super(nome, cpf, rg, nrTelefone, endereco);
        this.idProprietario = idProprietario;
        this.descPet = descPet;
    }

    public int getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(int idProprietario) {
        this.idProprietario = idProprietario;
    }

    public Pet getDescPet() {
        return descPet;
    }

    public void setDescPet(Pet descPet) {
        this.descPet = descPet;
    }

    public String toString() {
        return "{ Id do Proprietário: " + this.idProprietario + "\nNome: " + 
                getNome() + "\nCPF: " + getCpf() + "\nRG: " + getRg() + 
                "\nTelefone: " + getNrTelefone() + "\nEndereço:\n" + 
                getEndereco() + "\nPet:\n" + descPet + " }";
    }
    
}