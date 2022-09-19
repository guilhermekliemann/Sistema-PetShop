package br.kliemann.sistemapetshop.controller;

import br.kliemann.sistemapetshop.model.Exame;
import br.kliemann.sistemapetshop.model.Medicamento;
import br.kliemann.sistemapetshop.model.MedicoVeterinario;
import br.kliemann.sistemapetshop.model.Pet;
import br.kliemann.sistemapetshop.model.Proprietario;
import java.util.Date;

public class Consulta {
    
    private int id;
    private MedicoVeterinario medVet;
    private Proprietario proprietario;
    private Pet pet;
    private Date data;
    private Medicamento medicamento;
    private Exame exame;
    private double valorConsulta = 50;
    private double valorTotal = 0;

    public Consulta(int id, MedicoVeterinario medVet, Proprietario proprietario, Pet pet, Date data, Medicamento medicamento, Exame exame) {
        this.id = id;
        this.medVet = medVet;
        this.proprietario = proprietario;
        this.pet = pet;
        this.data = data;
        this.medicamento = medicamento;
        this.exame = exame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double valorTotalConsulta() {
        valorTotal = valorConsulta + medicamento.getPreco() + exame.getValorExame();
        return valorTotal;
    }

    public String toString() {
        return "{ Id consulta: " + this.id + "\nMedico Veterinário: " + 
                medVet.getNome() + "\nProprietario: " + proprietario.getNome() +
                "\nPet: " + pet.getNome() + "\nData consulta: " + data + 
                "\nMedicamento: " + medicamento + "\nExame: " + getExame() + 
                "\nValor da consulta: " + valorConsulta + "\nValor total: " + 
                valorTotalConsulta() + " }";
    }
    
}
