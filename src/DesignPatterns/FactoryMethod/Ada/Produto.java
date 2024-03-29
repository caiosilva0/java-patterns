package DesignPatterns.FactoryMethod.Ada;

import java.math.BigDecimal;

public class Produto {
    private String descricao;
    private BigDecimal preco;
    private Boolean possuiDimenssoesFisicas;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getPossuiDimenssoesFisicas() {
        return possuiDimenssoesFisicas;
    }

    public void setPossuiDimenssoesFisicas(Boolean possuiDimenssoesFisicas) {
        this.possuiDimenssoesFisicas = possuiDimenssoesFisicas;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", possuiDimenssoesFisicas=" + possuiDimenssoesFisicas +
                '}';
    }
}
