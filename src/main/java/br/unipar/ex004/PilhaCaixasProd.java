package br.unipar.ex004;

import javax.swing.*;

public class PilhaCaixasProd {
    private Produto[] pilhaCaixaProduto;
    private int posTopo;

    public PilhaCaixasProd(int tamanho){
        pilhaCaixaProduto = new Produto[tamanho];
        posTopo = -1;
    }
    public void push(Produto produto){
        pilhaCaixaProduto[++posTopo] = produto;
    }

    public Produto pop(){
        return pilhaCaixaProduto[posTopo--];
    }

    public Produto top(){
        return pilhaCaixaProduto[posTopo];
    }

    public boolean isEmpty(){
        return posTopo == -1;
    }

    public String listarCaixas(){
        String lista = "";

        for (int i = posTopo; i > -1; i--) {
            lista += "["+i+"]" + " - Produto: "+ pilhaCaixaProduto[i].getCodProduto() + " - " + pilhaCaixaProduto[i].getDesc() +
                            "\nData Entrega: " + pilhaCaixaProduto[i].getDataEntrega()+
                            "\nLocal de Origem: " + pilhaCaixaProduto[i].getLocalOrigem() + "/" + pilhaCaixaProduto[i].getUfOrigem() + "\n\n";
        }
        return lista;
    }

    public boolean isFull(){
        return posTopo == pilhaCaixaProduto.length-1;
    }
}
