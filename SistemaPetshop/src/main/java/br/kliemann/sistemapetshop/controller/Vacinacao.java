package br.kliemann.sistemapetshop.controller;

import br.kliemann.sistemapetshop.model.MedicoVeterinario;
import br.kliemann.sistemapetshop.model.Pet;
import br.kliemann.sistemapetshop.model.Proprietario;
import br.kliemann.sistemapetshop.model.Vacina;
import java.util.Date;

public class Vacinacao {
    
    private int id;
    private MedicoVeterinario medVet;
    private Proprietario proprietario;
    private Pet pet;
    private Vacina vacina;
    private Date dtVacinacao;
    private String dtVencimento;
    private double valorAplicacao = 10;
    private double valorTotal = 0;

    public Vacinacao(int id, MedicoVeterinario medVet, Proprietario proprietario, Pet pet, Vacina vacina, Date dtVacinacao, String dtVencimento) {
        this.id = id;
        this.medVet = medVet;
        this.proprietario = proprietario;
        this.pet = pet;
        this.vacina = vacina;
        this.dtVacinacao = dtVacinacao;
        this.dtVencimento = dtVencimento;
    }

    public MedicoVeterinario getMedVet() {
        return medVet;
    }

    public void setMedVet(MedicoVeterinario medVet) {
        this.medVet = medVet;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtVacinacao() {
        return dtVacinacao;
    }

    public void setDtVacinacao(Date dtVacinacao) {
        this.dtVacinacao = dtVacinacao;
    }
    
    public double valorTotalVacinacao() {
        valorTotal = vacina.getPreco() + valorAplicacao;
        return valorTotal;
    }
    
    public String toString() {
        return "{ Id vacinacao: " + this.id + "\nMedico Veterinário: " + 
                medVet.getNome() + "\nProprietario: " + proprietario.getNome() 
                + "\nPet: " + pet.getNome() + "\nVacina: " + vacina + 
                "\nData Vacinacao: " + dtVacinacao + "\nData Vencimento: " 
                + dtVencimento + "\nValor da aplicação: " + valorAplicacao +
                "\nValor total da vacinação: " + valorTotalVacinacao() + " }";       
    }
    
}
