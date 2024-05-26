package br.unipar.ex003;

import br.unipar.ex002.Cliente;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PilhaLivros pilhaLivros = new PilhaLivros(10);

        int opcao;
        String[] opcoes = {"Adicionar livro", "Listar livros", "Tirar livro da pilha"};

        do {
            opcao = (JOptionPane.showOptionDialog(
                    null, "Escolha uma opção: ", "Pilha de Livros", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            ));

            switch (opcao) {
                case 0:
                    if(!pilhaLivros.isFull()){
                        String livro = JOptionPane.showInputDialog("Informe o nome do paciente");
                        pilhaLivros.push(livro);
                    }else {
                        JOptionPane.showMessageDialog(null, "Limite de livros empilhados atingido");
                    }
                    break;

                case 1:
                    if(!pilhaLivros.isEmpty()){
                        JOptionPane.showMessageDialog(null, pilhaLivros.listarLivros());
                    }else {
                        JOptionPane.showMessageDialog(null, "Lista vazia");
                    }
                    break;
                case 2:
                    if(!pilhaLivros.isEmpty()){
                        String livroRemovido = pilhaLivros.pop();
                        JOptionPane.showMessageDialog(null, livroRemovido + " Removido");
                    }else {
                        JOptionPane.showMessageDialog(null, "Lista vazia");
                    }
                    break;
            }

        }while (opcao >= 0);
    }
}
