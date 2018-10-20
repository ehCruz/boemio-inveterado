package com.controller;

import java.util.List;

public class Calculos {

    public static Double calcularDistanciaEntreDoisPontos(Double lat1, Double lon1, Double lat2, Double lon2) {
        return (lat1 + lat2) + (lon1 - lon2);
    }
}
