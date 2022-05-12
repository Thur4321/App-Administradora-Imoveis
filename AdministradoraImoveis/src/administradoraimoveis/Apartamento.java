package administradoraimoveis;

public class Apartamento extends Imóvel {

    private String andar, numero;

    public Apartamento(String andar, String numero, String nome, String endereço, String negocio, String imovel, float area, double valor) {
        super(nome, endereço, negocio, imovel, area, valor);
        this.andar = andar;
        this.numero = numero;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double taxa() {
        double taxa = 0;
        if (area <= 50 && area > 0) {
            taxa = area * 0.15;
        } else if (area > 50) {
            taxa = area * 0.3;
        }
        return taxa;
    }

    public String informaçoes() {
        return "Informações do imóvel tipo "+imovel+":"
                + "\n\nProprietário: " + nome
                + "\nEndereço: " + endereço
                + "\nTipo de negócio: " + negocio
                + "\nTamanho: " + area + "m²"
                + "\nValor: R$" + valor
                + "\nAndar: " + andar + "º"
                + "\nNúmero: " + numero;
    }
    
    public String valorTaxa(){
        return "O valor da taxa é de "+ taxa();
    }
}
