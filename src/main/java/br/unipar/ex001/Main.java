package br.unipar.ex001;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FilaSenhasAtendimentoMedico filaSenhas = new FilaSenhasAtendimentoMedico(20);
        int opcao;
        String[] opcoes = {"Adicionar paciente", "Chamar proxímo paciente"};

        do {
            opcao = (JOptionPane.showOptionDialog(
                    null, "Escolha uma opção: ", "Senhas", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            ));

            switch (opcao) {
                case 0:
                    if(!filaSenhas.isFull()){
                        String paciente = JOptionPane.showInputDialog("Informe o nome do paciente");
                        filaSenhas.enqueue(paciente);
                        JOptionPane.showMessageDialog(null, paciente);
                    }else {
                        JOptionPane.showMessageDialog(null, "Limite de senhas atingido");
                    }
                    break;



                case 1:
                    if (!filaSenhas.isEmpty()){
                        String paciente = filaSenhas.dequeue();
                        JOptionPane.showMessageDialog(null, paciente);
                    }else {
                        JOptionPane.showMessageDialog(null, "Todos os pacientes foram chamados");
                    }
                    break;
            }


        }while (opcao >= 0);


    }
}
