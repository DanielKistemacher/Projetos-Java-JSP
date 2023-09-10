package minhaimobiliaria;

public class Imovel {
    String codigoImovel;
    String endereco;
    double areaTotal;
    double valor;

    public Imovel(String codigoImovel, String endereco, double areaTotal, double valor) {
        this.codigoImovel = codigoImovel;
        this.endereco = endereco;
        this.areaTotal = areaTotal;
        this.valor = valor;
    }
    
    public String getCodigoImovel (){
        return codigoImovel;
    }

    public void setCodigoImovel(String codigoImovel) {
        this.codigoImovel = codigoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double obterValorMetroQuadrado() {
        return getValor() / getAreaTotal();
    }
}
