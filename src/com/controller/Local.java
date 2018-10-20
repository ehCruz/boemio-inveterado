package com.controller;

import java.util.ArrayList;
import java.util.List;

public class Local {

    private String nome;
    private Double latitude;
    private Double longitude;
    private List<Double> distancias = new ArrayList<>();

    public Local() {
    }

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

    public List<Double> getDistancias() {
        return distancias;
    }

    public void setDistancias(List<Double> distancias) {
        this.distancias = distancias;
    }
}
