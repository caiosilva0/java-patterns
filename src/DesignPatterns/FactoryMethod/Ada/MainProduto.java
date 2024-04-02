package DesignPatterns.FactoryMethod.Ada;

public class MainProduto {
    public static void main(String[] args) {
//        ProdutoFisico pF = new ProdutoFisico();
//        pF.setPossuiDimenssoesFisicas(true);
//
//        ProdutoDigital pD = new ProdutoDigital();
//        pD.setPossuiDimenssoesFisicas(false);

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProduto.FISICO);
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProduto.DIGITAL);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);

        /*Retornar instâncias. Antes eu tinha uma responsabilidade de setar, agora a minha Factory
        que tem essa responsabilidade*/

    }
}
