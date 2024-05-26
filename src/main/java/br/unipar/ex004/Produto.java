package br.unipar.ex004;

import java.time.LocalDate;

public class Produto {
    private int codProduto;
    private String desc;
    private LocalDate dataEntrega;
    private String localOrigem;
    private String ufOrigem;

    public Produto(int codProduto, String desc, LocalDate dataEntrega, String localOrigem, String ufOrigem) {
        this.codProduto = codProduto;
        this.desc = desc;
        this.dataEntrega = dataEntrega;
        this.localOrigem = localOrigem;
        this.ufOrigem = ufOrigem;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public void setUfOrigem(String ufOrigem) {
        this.ufOrigem = ufOrigem;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", desc='" + desc + '\'' +
                ", dataEntrega=" + dataEntrega +
                ", localOrigem='" + localOrigem + '\'' +
                ", ufOrigem='" + ufOrigem + '\'' +
                '}';
    }
}
