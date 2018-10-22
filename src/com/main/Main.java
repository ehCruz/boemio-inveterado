package com.main;

import com.utils.Calculos;
import com.utils.FloydWarshall;
import com.utils.LerArquivo;
import com.model.Local;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private Scanner sc = new Scanner(System.in);
    private List<String> dadosDoArquivo;
    private List<Local> locais = new ArrayList<>();

    public static void main(String[] args) {
        new Main().processar();
    }
//    Casa;-25,346083;-49,247201
    private void processar() {
        System.out.println("Informe a latitude do ponto de partida: ");
        Double latitudeInicial = sc.nextDouble();
        System.out.println("Informe a longitude do ponto de partida: ");
        Double longitudeInicial = sc.nextDouble();
        Local local = new Local("Ponto de partida", latitudeInicial, longitudeInicial);
        locais.add(local);
        this.lerArquivoLocais();
    }

    private void lerArquivoLocais() {
        dadosDoArquivo = LerArquivo.lerArquivo("C:\\Users\\Eduardo Cruz\\IdeaProjects\\boemio-inveterado\\Arquivos\\Coordenadas.txt");
        for (String linha : dadosDoArquivo) {
            tratarDadosArquivo(linha);
        }
        this.calcularDistancia();
    }

    private void tratarDadosArquivo(String linha) {
        String dadosLinha[] = linha.split(";");
        String nome = dadosLinha[0];
        Double latitude = Double.parseDouble(dadosLinha[1].replaceFirst(",", "."));
        Double longitude = Double.parseDouble(dadosLinha[2].replaceFirst(",", "."));
        Local local = new Local(nome, latitude, longitude);
        this.locais.add(local);
    }

    private void calcularDistancia() {
        Double[][] distancias = new Double[locais.size()][locais.size()];
        for (int i = 0; i < locais.size(); i++) {
            for (int j = 0; j < locais.size(); j++) {
                distancias[i][j] = Calculos.calcularDistanciaEntreDoisPontos(locais.get(i).getLatitude(), locais.get(i).getLongitude(),
                        locais.get(j).getLatitude(), locais.get(j).getLongitude());
            }
        }
        FloydWarshall.exibirRotas(distancias);
    }
}
