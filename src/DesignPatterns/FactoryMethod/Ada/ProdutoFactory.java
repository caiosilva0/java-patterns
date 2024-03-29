package DesignPatterns.FactoryMethod.Ada;

import DesignPatterns.FactoryMethod.Ada.Produto;
import DesignPatterns.FactoryMethod.Ada.ProdutoFisico;
import DesignPatterns.FactoryMethod.Ada.ProdutoDigital;
import DesignPatterns.FactoryMethod.Ada.TipoProduto;

public class ProdutoFactory {
    public static Produto getInstance(TipoProduto tipoProduto){
        switch (tipoProduto){
            case FISICO:
                ProdutoFisico  produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimenssoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimenssoesFisicas(false);
                return produtoDigital;
            default:
                throw new IllegalArgumentException("Tipo inválido");
        }
    }
}
