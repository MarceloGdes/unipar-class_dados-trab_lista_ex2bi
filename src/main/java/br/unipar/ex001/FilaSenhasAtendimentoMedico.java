package br.unipar.ex001;

public class FilaSenhasAtendimentoMedico {
    private String[] elementos;
    private int frente;
    private int fim;
    private int qtdElementos;

    public FilaSenhasAtendimentoMedico(int tamanho){
        elementos = new String[tamanho];
        frente = 0;
        fim = -1;
        qtdElementos = 0;
    }

    public int enqueue(String e){
        if (fim == elementos.length-1){
            fim = -1;
        }

        elementos[++fim] = e;
        qtdElementos++;
        return fim;
    }

    public String dequeue(){
        String aux = elementos[frente++];
        if(frente == elementos.length){
            frente = 0;
        }
        qtdElementos--;
        return aux;
    }

    public boolean isFull(){
        return qtdElementos == elementos.length;
    }

    public boolean isEmpty(){
        return qtdElementos == 0;
    }
}
