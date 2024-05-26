package br.unipar.ex002;

import javax.swing.*;
import java.time.Year;
import java.time.YearMonth;

public class Cliente {
    private String nome;
    private int senha;
    private int anoNasc;

    public Cliente(String nome, int anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
    }

    public int getIdade(){
        return 2024 - anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
}
