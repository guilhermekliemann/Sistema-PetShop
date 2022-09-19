package br.kliemann.sistemapetshop.model;

public class Medicamento {
    
    private int id;
    private String marca;
    private String nome;
    private String desc;
    private double preco;

    public Medicamento(int id, String marca, String nome, String desc, double preco) {
        this.id = id;
        this.marca = marca;
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n{ Id medicamento: " + id + "\nMarca: " + marca + "\nNome: " +
                nome + "\nDescrição: " + desc + "\nPreço: " + preco + " }";
    }
    
}
