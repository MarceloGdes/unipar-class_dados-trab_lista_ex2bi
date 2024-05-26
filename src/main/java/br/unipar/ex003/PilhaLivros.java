package br.unipar.ex003;

public class PilhaLivros {

    private String[] pilha;
    private int posTopo;

    public PilhaLivros(int tamanho){
        pilha = new String[tamanho];
        posTopo = -1;
    }
    public void push(String livro){
        pilha[++posTopo] = livro;
    }

    public String pop(){
        return pilha[posTopo--];
    }

    public String top(){
        return pilha[posTopo];
    }

    public boolean isEmpty(){
        return posTopo == -1;
    }

    public String listarLivros(){
        String lista = "";

        for (int i = 0; i <= posTopo; i++) {
            lista += "\n" + pilha[i];
        }
        return lista;
    }

    public boolean isFull(){
        return posTopo == pilha.length-1;
    }
}
