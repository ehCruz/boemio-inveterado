package com.model;

public class Local {

    private String nome;
    private Double latitude;
    private Double longitude;
    private Local proximo;
    private Local anterior;

    public Local(String nome, Double latitude, Double longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Local getProximo() {
        return proximo;
    }

    public void setProximo(Local proximo) {
        this.proximo = proximo;
    }

    public Local getAnterior() {
        return anterior;
    }

    public void setAnterior(Local anterior) {
        this.anterior = anterior;
    }
}
