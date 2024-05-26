package br.unipar.ex005;

import javax.swing.*;

public class Pilhas {
    public PilhaCaixasProd[] pilha;

    public Pilhas(int qtdPilhas, int tamanhoPilhas) {
        pilha = new PilhaCaixasProd[qtdPilhas];
        for (int i = 0; i < pilha.length; i++) {
            pilha[i] = new PilhaCaixasProd(10);
        }
    }

    public int selecionarPilha(){
        String[] opcoesPilha = new String[pilha.length];
        for (int i = 0; i < opcoesPilha.length; i++) {
            opcoesPilha[i] = "Pilha " + (i+1);
        }

        int opcaoPilha = JOptionPane.showOptionDialog(null, "Escolha uma pilha: ",
                "Selecionar Pilha", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoesPilha, opcoesPilha[0]);

        return opcaoPilha;

    }
}
