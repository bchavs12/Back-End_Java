package com.branchManagement.model;

public class Filial {

    private int id;

    private String nomeFilial;

    private String rua;

    private Integer numero;

    private String cidade;

    private String estado;

    private String isFiveStars;


    public Filial(String nomeFilial, String rua, Integer numero, String cidade, String estado, String isFiveStars) {
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.isFiveStars = isFiveStars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIsFiveStars() {
        return isFiveStars;
    }

    public void setIsFiveStars(String isFiveStars) {
        this.isFiveStars = isFiveStars;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", isFiveStars='" + isFiveStars + '\'' +
                '}';
    }
}
