package br.kliemann.sistemapetshop.controller;

import br.kliemann.sistemapetshop.model.MedicoVeterinario;
import br.kliemann.sistemapetshop.model.Pet;
import br.kliemann.sistemapetshop.model.Proprietario;

public class Banho {
    
    private int id;
    private MedicoVeterinario medVet;
    private Proprietario proprietario;
    private Pet pet;
    private String dtMarcado;

    public Banho(int id, MedicoVeterinario medVet, Proprietario proprietario, Pet pet, String dtMarcado) {
        this.id = id;
        this.medVet = medVet;
        this.proprietario = proprietario;
        this.pet = pet;
        this.dtMarcado = dtMarcado;
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

    public String getDtMarcado() {
        return dtMarcado;
    }

    public void setDtMarcado(String dtMarcado) {
        this.dtMarcado = dtMarcado;
    }

    @Override
    public String toString() {
        return "\n{ Id banho: " + id + "\nMedico Veterinário: " + medVet.getNome()
                + "\nProprietario: " + proprietario.getNome() + "\nPet: " + 
                pet.getNome() + "\nData marcada: " + dtMarcado + " }";
    }
    
}
