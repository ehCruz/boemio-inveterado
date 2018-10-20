package com.controller;

public class Calculos {

    private static final int RAIO_TERRA = 6371;

    /**
     * <h1>Fórmula de Haversine</h1>
     *
     * <p>Método que implemeta a fórmula de Haversine, que calcula a distância
     * entre dois pontos, tendo como entrada a latitude e longitude de ambos.</p>
     *
     * @param latInicial Latitude Inicial
     * @param lonInicial Longitude Inicial
     * @param latFinal Latitude destino
     * @param lonFinal Longitude destino
     * @return
     */
    public static Double calcularDistanciaEntreDoisPontos(Double latInicial, Double lonInicial,
                                                          Double latFinal, Double lonFinal) {
        Double startPhi = Math.toRadians(latInicial);
        Double endPhi = Math.toRadians(latFinal);
        Double deltaPhi = Math.toRadians(latFinal - latInicial);
        Double deltaLambda = Math.toRadians(lonInicial - lonFinal);

        Double a = haversin(deltaPhi) + Math.cos(startPhi) * Math.cos(endPhi) * haversin(deltaLambda);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return RAIO_TERRA * c;
    }

    private static double haversin(Double val) {
        return Math.pow(Math.sin(val / 2), 2);
    }
}
