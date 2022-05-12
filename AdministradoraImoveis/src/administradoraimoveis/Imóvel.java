
package administradoraimoveis;

public class Imóvel {
    
    protected String nome, endereço, negocio, imovel;
    
    protected float area;

    protected double valor;

    public Imóvel(String nome, String endereço, String negocio, String imovel, float area, double valor) {
        this.nome = nome;
        this.endereço = endereço;
        this.negocio = negocio;
        this.imovel = imovel;
        this.area = area;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }

    public String getImovel() {
        return imovel;
    }

    public void setImovel(String imovel) {
        this.imovel = imovel;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
