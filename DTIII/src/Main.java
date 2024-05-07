import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
     
        Petshop meuCaninoFeliz = new Petshop("Meu Canino Feliz", 2.0, 20.0, 40.0, 24.0, 48.0);
        Petshop vaiRex = new Petshop("Vai Rex", 1.7, 15.0, 50.0, 20.0, 55.0);
        Petshop chowChawgas = new Petshop("ChowChawgas", 0.8, 30.0, 45.0, 30.0, 45.0);

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Digite a data (no formato DD/MM/AAAA):");
            String data = scanner.nextLine();

           
            System.out.println("Digite a quantidade de pequenos:");
            int qtdPequenos = scanner.nextInt();

          
            scanner.nextLine();

            
            System.out.println("Digite a quantidade de grandes:");
            int qtdGrandes = scanner.nextInt();

          
            scanner.nextLine();

           
            List<Petshop> petshops = new ArrayList<>();
            petshops.add(meuCaninoFeliz);
            petshops.add(vaiRex);
            petshops.add(chowChawgas);


           
            Petshop melhorPetshop = encontrarMelhorPetshop(petshops, data, qtdPequenos, qtdGrandes);

            System.out.println("Melhor petshop: " + melhorPetshop.getNome());
            System.out.println("Preço total dos banhos: R$" + melhorPetshop.calcularPrecoTotal(data, qtdPequenos, qtdGrandes));
        }
    }



    
    private static Petshop encontrarMelhorPetshop(List<Petshop> petshops, String data, int qtdPequenos, int qtdGrandes) {
        Petshop melhorPetshop = petshops.get(0);
        double melhorPrecoTotal = melhorPetshop.calcularPrecoTotal(data, qtdPequenos, qtdGrandes);

        for (int i = 1; i < petshops.size(); i++) {
            Petshop petshopAtual = petshops.get(i);
            double atualPrecoTotal = petshopAtual.calcularPrecoTotal(data, qtdPequenos, qtdGrandes);

            if (atualPrecoTotal < melhorPrecoTotal) {
                melhorPetshop = petshopAtual;
                melhorPrecoTotal = atualPrecoTotal;
            } else if (atualPrecoTotal == melhorPrecoTotal) {
               
                if (petshopAtual.getDistancia() < melhorPetshop.getDistancia()) {
                    melhorPetshop = petshopAtual;
                    melhorPrecoTotal = atualPrecoTotal;
                }
            }
        }


        return melhorPetshop;


    }


}
