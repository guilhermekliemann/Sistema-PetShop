package br.kliemann.sistemapetshop.enums;

public enum SexoAnimalENUM {
    
    MACHO("Macho"),
    FEMEA("Femea");
    
    private String descSexo;

    private SexoAnimalENUM(String descSexo) {
        this.descSexo = descSexo;
    }

    public String getDescSexo() {
        return descSexo;
    }
    
}
