import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Calculo {

    public Calculo(String string) {
    }

    public double calcularPrecoTotalBanhos(LocalDate data, int qtdPequenos, int qtdGrandes) {
        double precoPequeno = 10.0; // assume the price of a small bath is 10.0
        double precoGrande = 20.0; // assume the price of a large bath is 20.0

        return qtdPequenos * precoPequeno + qtdGrandes * precoGrande;
    }

    public static class Main {
        public static void main(String[] args) {
            // Criando objetos das pet shops
            Calculo meuCaninoFeliz = new Calculo("Meu Canino Feliz");
            Calculo vaiRex = new Calculo("Vai Rex");
            Calculo chowChawgas = new Calculo("Chow Chawgas");

            // Armazenando os objetos em uma lista
            List<Calculo> petShops = new ArrayList<>();
            petShops.add(meuCaninoFeliz);
            petShops.add(vaiRex);
            petShops.add(chowChawgas);

            // Calculando o preço total dos banhos em cada petshop
            LocalDate data = LocalDate.now(); // Exemplo de data
            int qtdPequenos = 2; // Exemplo de quantidade de banhos pequenos
            int qtdGrandes = 1; // Exemplo de quantidade de banhos grandes

            for (Calculo petShop : petShops) {
                double precoTotal = petShop.calcularPrecoTotalBanhos(data, qtdPequenos, qtdGrandes);
                System.out.println("Preço total na " + petShop.getNome() + ": " + precoTotal);
            }
        }
    }


    public String getNome() {

        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

}
