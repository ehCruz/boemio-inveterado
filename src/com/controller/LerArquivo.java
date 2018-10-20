package com.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe genérica para leitura simples de arquivos
 */
public class LerArquivo {

    private static File file;
    private static List<String> lista;

    /**
     * <p>Método para leitura de arquivos externos</p>
     *
     * @param filePath
     * @return <p>Lista com <b>cada linha</b> do arquivo lido</p>
     */
    public static List<String> lerArquivo(String filePath){
        lista = new ArrayList<>();
        LerArquivo.file = new File(filePath);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                lista.add(sc.nextLine());
            }
            sc.close();
            return lista;
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
            e.printStackTrace();
        }
        return null;
    }

}
