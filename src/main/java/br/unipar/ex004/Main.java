package br.unipar.ex004;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PilhaCaixasProd pilhaCaixasProd = new PilhaCaixasProd(10);

        int opcao;
        String[] opcoes = {"Adicionar caixa", "Produtos pendentes de envio", "Retirar caixa" };

        do {
            opcao = (JOptionPane.showOptionDialog(
                    null, "Escolha uma opção: ", "Pilha de Caixa", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            ));

            switch (opcao) {
                //Cadastro de produtos antes de colocar na pilha
                case 0:
                    if(!pilhaCaixasProd.isFull()){
                        Produto produto = cadastrarProd();
                        pilhaCaixasProd.push(produto);

                        JOptionPane.showMessageDialog(null, pilhaCaixasProd.listarCaixas());
                    }else {
                        JOptionPane.showMessageDialog(null, "Limite de caixas empilhadas atingido");
                    }
                    break;

                case 1:
                    if(!pilhaCaixasProd.isEmpty()){
                        JOptionPane.showMessageDialog(null, pilhaCaixasProd.listarCaixas());
                    }else {
                        JOptionPane.showMessageDialog(null, "Pilha vazia");
                    }
                    break;
                case 2:
                    if(!pilhaCaixasProd.isEmpty()){
                        Produto produto = pilhaCaixasProd.pop();
                        JOptionPane.showMessageDialog(null,pilhaCaixasProd.listarCaixas());
                    }else {
                        JOptionPane.showMessageDialog(null, "Pilha vazia");
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
