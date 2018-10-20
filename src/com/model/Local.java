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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
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
