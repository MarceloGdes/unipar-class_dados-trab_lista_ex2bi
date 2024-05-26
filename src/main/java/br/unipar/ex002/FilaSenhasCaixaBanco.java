package br.unipar.ex002;

public class FilaSenhasCaixaBanco {

    private Cliente[] clientes;
    private int frente;
    private int fim;
    private int qtdElementos;

    public FilaSenhasCaixaBanco(int tamanho){
        clientes = new Cliente[tamanho];
        frente = 0;
        fim = -1;
        qtdElementos = 0;
    }

    public void enqueue(Cliente cliente){
        if (fim ==  clientes.length-1){
            fim = -1;
        }

        clientes[++fim] = cliente;
        cliente.setSenha(fim);
        qtdElementos++;
    }

    public Cliente dequeue(){
        Cliente cliente = clientes[frente++];
        if(frente == clientes.length){
            frente = 0;
        }
        qtdElementos--;
        return cliente;
    }

    public boolean isFull(){
        return qtdElementos == clientes.length;
    }

    public boolean isEmpty(){
        return qtdElementos == 0;
    }
}
