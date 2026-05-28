package com.uniube.figuritos.models;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_figurinhas")
public class figurinhas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;

    @Column(length = 32, nullable = false, unique = false)
    private String nome;

    @Column(length = 32, nullable = false)
    private String selecao;

    @Column(length = 32, nullable = false)
    private String posicao;

    @Column(length = 32, nullable = false)
    private Double preco;

    @Column(length = 32, nullable = false)
    private String raridade;

    public figurinhas() {};

    public figurinhas(Integer numero, String nome, String selecao, String posicao, Double preco, String raridade) {
        this.nome = nome;
        this.numero = numero;
        this.selecao = selecao;
        this.posicao = posicao;
        this.preco = preco;
        this.raridade = raridade;
    }


    //setters:


    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //geters:

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getSelecao() {
        return selecao;
    }

    public String getPosicao() {
        return posicao;
    }

    public Double getPreco() {
        return preco;
    }

    public String getRaridade() {
        return raridade;
    }
}
