import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        // Criando os petshops com as informações fornecidas
        Petshop meuCaninoFeliz = new Petshop("Meu Canino Feliz", 2.0, 20.0, 40.0, 24.0, 48.0);
        Petshop vaiRex = new Petshop("Vai Rex", 1.7, 15.0, 50.0, 20.0, 55.0);
        Petshop chowChawgas = new Petshop("ChowChawgas", 0.8, 30.0, 45.0, 30.0, 45.0);

        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar e ler a data
            System.out.println("Digite a data (no formato DD/MM/AAAA):");
            String data = scanner.nextLine();

            // Solicitar e ler a quantidade de pequenos
            System.out.println("Digite a quantidade de pequenos:");
            int qtdPequenos = scanner.nextInt();

            // Limpeza do buffer
            scanner.nextLine();

            // Solicitar e ler a quantidade de grandes
            System.out.println("Digite a quantidade de grandes:");
            int qtdGrandes = scanner.nextInt();

            // Limpeza do buffer
            scanner.nextLine();

            // Criando uma lista de petshops para facilitar a comparação
            List<Petshop> petshops = new ArrayList<>();
            petshops.add(meuCaninoFeliz);
            petshops.add(vaiRex);
            petshops.add(chowChawgas);


            // Encontrando o petshop com o menor preço total
            Petshop melhorPetshop = encontrarMelhorPetshop(petshops, data, qtdPequenos, qtdGrandes);

// Imprimindo o resultado
            System.out.println("Melhor petshop: " + melhorPetshop.getNome());
            System.out.println("Preço total dos banhos: R$" + melhorPetshop.calcularPrecoTotal(data, qtdPequenos, qtdGrandes));
        }
    }



    // Método para encontrar o petshop com o menor preço total
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
                // Em caso de empate, escolher o petshop mais próximo do canil
                if (petshopAtual.getDistancia() < melhorPetshop.getDistancia()) {
                    melhorPetshop = petshopAtual;
                    melhorPrecoTotal = atualPrecoTotal;
                }
            }
        }


        return melhorPetshop;


    }


}