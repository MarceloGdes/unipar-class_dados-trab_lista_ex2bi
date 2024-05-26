package br.unipar.ex002;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FilaSenhasCaixaBanco filaPrioritaria = new FilaSenhasCaixaBanco(20);
        FilaSenhasCaixaBanco filaNormal = new FilaSenhasCaixaBanco(20);

        int opcao;
        String[] opcoes = {"Adicionar cliente", "Chamar proxímo cliente"};
        int contFilaPrioritaria = 0;

        do {
            opcao = (JOptionPane.showOptionDialog(
                    null, "Escolha uma opção: ", "Senhas", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            ));

            switch (opcao) {
                case 0:
                    Cliente cliente = cadastrarCliente();
                    if (cliente.getIdade() >= 65){
                        if (!filaPrioritaria.isFull()){
                            filaPrioritaria.enqueue(cliente);
                            JOptionPane.showMessageDialog(null,
                                    cliente.getNome() + " adicionado na fila priotitária");
                        }else {
                            JOptionPane.showMessageDialog(null, "Senhas esgotadas");
                        }
                    }else {
                        if (!filaNormal.isFull()){
                            filaNormal.enqueue(cliente);
                            JOptionPane.showMessageDialog(null,
                                    cliente.getNome() + " adicionado na fila normal");
                        }else {
                            JOptionPane.showMessageDialog(null, "Senhas esgotadas");
                        }
                    }
                    break;
                case 1:
                    if(contFilaPrioritaria < 2){
                        if (!filaPrioritaria.isEmpty()){
                            Cliente clienteChamado = filaPrioritaria.dequeue();
                            JOptionPane.showMessageDialog(null,
                                    clienteChamado.getNome() + " | Senha: " +
                                            clienteChamado.getSenha() + " Fila Prioritária");
                            contFilaPrioritaria++;
                        }else {
                            JOptionPane.showMessageDialog(null, "Todos os clientes prioritarios foram chamados");

                        }
                    }else {
                        if (!filaNormal.isEmpty()){
                            Cliente clienteChamado = filaNormal.dequeue();
                            JOptionPane.showMessageDialog(null,
                                    clienteChamado.getNome() + " | Senha: " +
                                            clienteChamado.getSenha() + " Fila Normal");
                            contFilaPrioritaria = 0;
                        }else {
                            JOptionPane.showMessageDialog(null, "Todos os clientes da fila normal" +
                                    " foram chamados");
                            contFilaPrioritaria = 0;
                        }
                    }
                    break;
            }


        }while (opcao >= 0);
    }
    public static Cliente cadastrarCliente(){
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        int anoNasc = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite o ano de nascimento do cliente")
        );

        Cliente cliente = new Cliente(nome, anoNasc);
        return cliente;
    }
}


