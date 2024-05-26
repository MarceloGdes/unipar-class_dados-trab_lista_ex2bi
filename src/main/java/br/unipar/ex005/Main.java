package br.unipar.ex005;

import br.unipar.ex005.PilhaCaixasProd;
import br.unipar.ex005.Produto;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pilhas pilhas = new Pilhas(5,10);

        int opcaoPilha;
        int opcao;

        String[] opcoes = {"Adicionar caixa", "Produtos pendentes de envio", "Retirar caixa" };

        do {
            opcao = (JOptionPane.showOptionDialog(
                    null, "Escolha uma opção: ", "Pilha de Caixa", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            ));

            switch (opcao) {
                case 0:
                    opcaoPilha = pilhas.selecionarPilha();

                    if(opcaoPilha != -1 && !(pilhas.pilha[opcaoPilha].isFull())){
                        Produto produto = cadastrarProd();
                        pilhas.pilha[opcaoPilha].push(produto);

                        JOptionPane.showMessageDialog(null, pilhas.pilha[opcaoPilha].listarCaixas());
                    }else {
                        JOptionPane.showMessageDialog(null, "Limite de caixas empilhadas atingido ou operação cancelada");
                    }
                    break;

                case 1:
                    opcaoPilha = pilhas.selecionarPilha();

                    if(opcaoPilha != -1 && !pilhas.pilha[opcaoPilha].isEmpty()){
                        JOptionPane.showMessageDialog(null, pilhas.pilha[opcaoPilha].listarCaixas());
                    }else {
                        JOptionPane.showMessageDialog(null, "Pilha vazia ou operação cancelada");
                    }
                    break;
                case 2:
                    opcaoPilha = pilhas.selecionarPilha();

                    if(opcaoPilha != -1 && !pilhas.pilha[opcaoPilha].isEmpty()){
                        Produto produto = pilhas.pilha[opcaoPilha].pop();
                        JOptionPane.showMessageDialog(null,pilhas.pilha[opcaoPilha].listarCaixas());
                    }else {
                        JOptionPane.showMessageDialog(null, "Pilha vazia ou operação cancelada");
                    }
                    break;
            }

        }while (opcao >= 0);
    }

    public static Produto cadastrarProd(){
        int codProd = Integer.parseInt(JOptionPane.showInputDialog("Insira o cod do produto"));
        String desc = JOptionPane.showInputDialog("Insira a descrição do produto:");
        LocalDate dataEntrega = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de entrega (formato aaaa-mm-dd"));
        String localOrigem = JOptionPane.showInputDialog("Insira o local de origem");
        String ufOrigem = JOptionPane.showInputDialog("Insira o UF de origem");

        Produto produto = new Produto(codProd, desc, dataEntrega, localOrigem, ufOrigem);
        return produto;
    }




}
