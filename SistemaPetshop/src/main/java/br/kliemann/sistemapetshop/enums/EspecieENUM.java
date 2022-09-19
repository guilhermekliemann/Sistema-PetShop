package br.kliemann.sistemapetshop.enums;

public enum EspecieENUM {
    
    CACHORRO("Cachorro"),
    GATO("Gato");
    
    private String descAnimal;

    private EspecieENUM(String descAnimal) {
        this.descAnimal = descAnimal;
    }

    public String getDescAnimal() {
        return descAnimal;
    }
    
}
