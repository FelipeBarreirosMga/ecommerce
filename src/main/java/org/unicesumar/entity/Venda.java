package org.unicesumar.entity;

import jakarta.persistence.*;

@Table (name= "vendas")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JoinColumn(name = "id_produto", referencedColumnName = "id")
    private Produto id_produto;

    @Column(name = "quantidade")
    private int quantidade;

    @Column(name = "preco)")
    private double preco;

    public Venda() {}

    public Venda(Produto id_produto, long id, int quantidade, double preco) {
        this.id_produto = id_produto;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getId_produto() {
        return id_produto;
    }

    public void setId_produto(Produto id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}