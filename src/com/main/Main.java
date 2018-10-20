package com.main;

import com.controller.LerArquivo;
import com.controller.Local;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<String> dadosDoArquivo;
    private List<Local> locais = new ArrayList<>();

    public static void main(String[] args) {
        new Main().processar();
    }

    private void processar() {
        dadosDoArquivo = LerArquivo.lerArquivo("C:\\Users\\Eduardo Cruz\\IdeaProjects\\boemio-inveterado\\Arquivos\\Coordenadas.txt");
        for (String linha : dadosDoArquivo) {
            tratarDadosArquivo(linha);
        }
    }

    private void tratarDadosArquivo(String linha) {
        String dadosLinha[] = linha.split(";");
        String nome = dadosLinha[0];
        Double latitude = Double.parseDouble(dadosLinha[1].replaceFirst(",", "."));
        Double longitude = Double.parseDouble(dadosLinha[2].replaceFirst(",", "."));
        Local local = new Local(nome, latitude, longitude);
        this.locais.add(local);
    }
}
