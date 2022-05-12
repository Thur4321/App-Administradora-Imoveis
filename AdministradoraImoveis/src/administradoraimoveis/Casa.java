package administradoraimoveis;

public class Casa extends Imóvel{

    protected boolean piscina;

    public Casa(boolean piscina, String nome, String endereço, String negocio, String imovel, float area, double valor) {
        super(nome, endereço, negocio, imovel, area, valor);
        this.piscina = piscina;
    }

    public Casa(String nome, String endereço, String negocio, String imovel, float area, double valor) {
        super(nome, endereço, negocio, imovel, area, valor);
    }
    
    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public double taxa() {
        double taxa = 0;
        if (area <= 300 && area > 0) {
            taxa = area * 0.15;
        } else if (area > 300) {
            taxa = area * 0.3;
        }
        return taxa;
    }

    public String informaçoes() {
        if (piscina) {
            return "Informações do imóvel tipo " + imovel+ ":"
                    + "\n\nProrpietário: " + nome
                    + "\nEndereço: " + endereço
                    + "\nTipo de negócio: " + negocio
                    + "\nTamanho: " + area + "m²"
                    + "\nValor: R$" + valor
                    + "\nPossui piscina";
        } else{
            return "Informações do imóvel tipo "+imovel+ ":"
                    + "\n\nProrpietário: " + nome
                    + "\nEndereço: " + endereço
                    + "\nTipo de negócio: " + negocio
                    + "\nTamanho: " + area + "m²"
                    + "\nValor: R$" + valor;
        }
    }
    
    public String valorTaxa(){
        return "O valor da taxa é de "+ taxa();
    }
}
