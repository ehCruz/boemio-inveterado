package com.model;

public class ListaLocal {

    private Local local;
    private Local primeiroNodo;
    private Local ultimoNodo;
    private int tamanhoLista;

    public void adicionarElemento(Local local) {
        this.local = local;
        if (this.tamanhoLista == 0) {
            local.setAnterior(null);
            local.setProximo(null);
            this.primeiroNodo = local;
            this.ultimoNodo = local;
        } else {
            local.setAnterior(this.ultimoNodo);
            this.ultimoNodo.setProximo(local);
            this.ultimoNodo = local;
        }
        this.tamanhoLista++;
    }
}
