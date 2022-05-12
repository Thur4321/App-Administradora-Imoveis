package administradoraimoveis;

import javax.swing.JOptionPane;

public class AdministradoraImoveis {

    public static void main(String[] args) {

        String tipoImovel[] = {"Casa", "Apartamento"};

        String tipoNegocio[] = {"Venda", "Aluguel"};

        String operaçoes[] = {"Informações do imóvel", "Consultar taxa da Administrador", "Sair"};

        Casa casa = null;

        Apartamento ap = null;
        
        String imovel = (String) JOptionPane.showInputDialog(null, "Escolha o tipo do imóvel:", "Adm. Imóvel", 3, null, tipoImovel, tipoImovel[0]);
        
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do proprietário:", "Adm. imóvel", 3);

        String endereço = JOptionPane.showInputDialog(null, "Informe o endereço do imóvel:", "Adm. Imóvel", 3);

        Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do imóvel:", "Adm. Imóvel", 3));

        Float area = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o a área do imóvel:", "Adm. Imóvel", 3));

        String negocio = (String) JOptionPane.showInputDialog(null, "Escolha o tipo do negócio:", "Adm. Imóvel", 3, null, tipoNegocio, tipoNegocio[0]);
        
        if(valor > 0 || area >0){

        if (imovel.equals("Casa")) {

            if (JOptionPane.showConfirmDialog(null, "Possui piscina?", "Casa", JOptionPane.YES_NO_OPTION, 3) == 0) {
                boolean piscina = true;
                casa = new Casa(piscina, nome, endereço, negocio, imovel, area, valor);
            } else {
                casa = new Casa(nome, endereço, negocio, imovel, area, valor);
            }

        } else if(imovel.equals("Apartamento")){

            String andar = JOptionPane.showInputDialog(null, "Informe o andar dp apartamento:", "Apartamento", 3);

            String numero = JOptionPane.showInputDialog(null, "Informe o numero do apartamento:", "Apartamento", 3);

            ap = new Apartamento(andar, numero, nome, endereço, negocio, imovel, area, valor);
        }

        String opUser = "";

        while (!opUser.equals(operaçoes[2])) {
            opUser = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada:", "Operações", 3, null, operaçoes, operaçoes[0]);
            switch (opUser) {
                case "Informações do imóvel":
                    if (casa != null) {
                        JOptionPane.showMessageDialog(null, casa.informaçoes(), "Informações", 1);

                    } else if (ap != null) {
                        JOptionPane.showMessageDialog(null, ap.informaçoes(), "Informações", 1);
                    }
                    break;
                case "Consultar taxa da Administrador":
                    if (casa != null) {
                        JOptionPane.showMessageDialog(null, casa.valorTaxa(), "Taxa", 1);

                    } else if (ap != null) {
                        JOptionPane.showMessageDialog(null, ap, "Taxa", 1);
                    }
                    break;

            }
        }
        System.exit(0);
    }
     else{
            JOptionPane.showMessageDialog(null, "Algum(ns) valor(es) cadastrado(s) não são aceitos (são valores negativos ou iguais a zero). Tente um novo cadestro.", "Adm. Imóvel", 1);
    }
}
}
