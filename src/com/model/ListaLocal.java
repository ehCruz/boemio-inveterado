package com.model;

public class ListaLocal {

    private static Local local;
    private static  Local primeiroNodo;
    private static  Local ultimoNodo;
    private static  int tamanhoLista = 0;

    public static void adicionarElemento(Local local) {
        ListaLocal.local = local;
        if (ListaLocal.tamanhoLista == 0) {
            local.setAnterior(null);
            local.setProximo(null);
            ListaLocal.primeiroNodo = local;
            ListaLocal.ultimoNodo = local;
        } else {
            local.setAnterior(ListaLocal.ultimoNodo);
            ListaLocal.ultimoNodo.setProximo(local);
            ListaLocal.ultimoNodo = local;
        }
        ListaLocal.tamanhoLista++;
    }
}
