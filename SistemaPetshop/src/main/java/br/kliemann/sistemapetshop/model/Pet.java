package br.kliemann.sistemapetshop.model;

import br.kliemann.sistemapetshop.abstracts.Animal;
import br.kliemann.sistemapetshop.enums.EspecieENUM;
import br.kliemann.sistemapetshop.enums.SexoAnimalENUM;

public class Pet extends Animal {
    
    private int idPet;

    public Pet(int idPet, String nome, EspecieENUM especie, String raca, 
               int idade, String cor, SexoAnimalENUM sexo) {
        super(nome, especie, raca, idade, cor, sexo);
        this.idPet = idPet;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }
    
    @Override
    public String toString() {
        return "{ Id do Pet: " + this.idPet + "\nNome: " + getNome() + 
                "\nEspecie: " + getEspecie().getDescAnimal() + "\nRaça: " + 
                getRaca() + "\nIdade: " + getIdade() + "\nCor: " + getCor() + 
                "\nSexo: " + getSexo().getDescSexo() + " }";
    }
    
}
