package com.dissidentmind.evanfa.instapet;

public class Pet {

    public Pet(String namePet, int valuePet, int fotoPet) {
        this.namePet = namePet;
        this.valuePet = valuePet;
        this.fotoPet = fotoPet;
    }

    private String namePet;
    private int valuePet;
    private int fotoPet;

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public int getValuePet() {
        return valuePet;
    }

    public void setValuePet(int valuePet) {
        this.valuePet = valuePet;
    }

    public int getFotoPet() {
        return fotoPet;
    }

    public void setFotoPet(int fotoPet) {
        this.fotoPet = fotoPet;
    }
}
