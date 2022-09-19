package br.kliemann.sistemapetshop.model;

public class Exame {

    private int id;
    private String desc;
    private double valorExame;

    public Exame(int id, String desc, double valorExame) {
        this.id = id;
        this.desc = desc;
        this.valorExame = valorExame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getValorExame() {
        return valorExame;
    }

    public void setValorExame(double valorExame) {
        this.valorExame = valorExame;
    }

    @Override
    public String toString() {
        return "\n{ Id exame: " + id + "\nDescrição: "  + desc + "\nValor exame: "
                + valorExame + " }";
    }
    
}
