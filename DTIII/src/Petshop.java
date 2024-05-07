
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Petshop {
    private final String nome;
    private final double distancia;
    private final double precoPequenoDiaUtil;
    private final double precoGrandeDiaUtil;
    private final double precoPequenoFimDeSemana;
    private final double precoGrandeFimDeSemana;

   
    public Petshop(String nome, double distancia, double precoPequenoDiaUtil, double precoGrandeDiaUtil, double precoPequenoFimDeSemana, double precoGrandeFimDeSemana) {
        this.nome = nome;
        this.distancia = distancia;
        this.precoPequenoDiaUtil = precoPequenoDiaUtil;
        this.precoGrandeDiaUtil = precoGrandeDiaUtil;
        this.precoPequenoFimDeSemana = precoPequenoFimDeSemana;
        this.precoGrandeFimDeSemana = precoGrandeFimDeSemana;
    }

   
    public double calcularPrecoTotal(String data, int qtdPequenos, int qtdGrandes) {
        double precoTotal;
        if (isFimDeSemana(data)) {
            precoTotal = qtdPequenos * precoPequenoFimDeSemana + qtdGrandes * precoGrandeFimDeSemana;
        } else {
            precoTotal = qtdPequenos * precoPequenoDiaUtil + qtdGrandes * precoGrandeDiaUtil;
        }
        return precoTotal;
    }

 
    private boolean isFimDeSemana(String data) {
       
        LocalDate date = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    
        return date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
    }


    public String getNome() {
        return nome;
    }

    public double getDistancia() {
        return distancia;
    }
}

