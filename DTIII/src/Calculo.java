import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Calculo {

    public Calculo(String string) {
    }

    public double calcularPrecoTotalBanhos(LocalDate data, int qtdPequenos, int qtdGrandes) {
        double precoPequeno = 10.0; 
        double precoGrande = 20.0; 

        return qtdPequenos * precoPequeno + qtdGrandes * precoGrande;
    }

    public static class Main {
        public static void main(String[] args) {
            
            Calculo meuCaninoFeliz = new Calculo("Meu Canino Feliz");
            Calculo vaiRex = new Calculo("Vai Rex");
            Calculo chowChawgas = new Calculo("Chow Chawgas");

           
            List<Calculo> petShops = new ArrayList<>();
            petShops.add(meuCaninoFeliz);
            petShops.add(vaiRex);
            petShops.add(chowChawgas);

            
            LocalDate data = LocalDate.now(); // Exemplo de data
            int qtdPequenos = 2; 
            int qtdGrandes = 1; 
            
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
