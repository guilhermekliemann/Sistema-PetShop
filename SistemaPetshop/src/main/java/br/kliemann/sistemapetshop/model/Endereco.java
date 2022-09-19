package br.kliemann.sistemapetshop.model;

public class Endereco {
    
    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private Cidade cidade;

    public Endereco(int id, String rua, int numero, String bairro, Cidade cidade) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
 
    @Override
    public String toString() {
        return "{ Rua: " + rua + "\nNúmero: " + numero + "\nBairro: " + 
                bairro + cidade + " }";
    }
    
}