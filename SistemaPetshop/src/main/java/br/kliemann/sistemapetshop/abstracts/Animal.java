package br.kliemann.sistemapetshop.abstracts;

import br.kliemann.sistemapetshop.enums.EspecieENUM;
import br.kliemann.sistemapetshop.enums.SexoAnimalENUM;

public abstract class Animal {
    
    private String nome;
    private EspecieENUM especie;
    private String raca;
    private int idade;
    private String cor;
    private SexoAnimalENUM sexo;

    public Animal(String nome, EspecieENUM especie, String raca, int idade, String cor, SexoAnimalENUM sexo) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EspecieENUM getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieENUM especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public SexoAnimalENUM getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimalENUM sexo) {
        this.sexo = sexo;
    }

    public abstract String toString();
    
}