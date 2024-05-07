import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraPrecoBanhoTest {

    @Test
    public void testCalcularPrecoTotal_MeuCaninoFeliz_Semana() {
        Petshop meuCaninoFeliz = new Petshop("Meu Canino Feliz", 2.0, 20.0, 40.0, 24.0, 48.0);
        double precoTotal = CalculadoraPrecoBanho.calcularPrecoTotal(meuCaninoFeliz, 3, 5, "03/08/2018");
        assertEquals(240.0, precoTotal);
    }

    @Test
    public void testCalcularPrecoTotal_VaiRex_FimSemana() {
        Petshop vaiRex = new Petshop("Vai Rex", 1.7, 15.0, 50.0, 20.0, 55.0);
        double precoTotal = CalculadoraPrecoBanho.calcularPrecoTotal(vaiRex, 3, 5, "04/08/2018");
        assertEquals(305.0, precoTotal);
    }

    @Test
    public void testCalcularPrecoTotal_ChowChawgas_Semana() {
        Petshop chowChawgas = new Petshop("ChowChawgas", 0.8, 30.0, 45.0, 30.0, 45.0);
        double precoTotal = CalculadoraPrecoBanho.calcularPrecoTotal(chowChawgas, 3, 5, "03/08/2018");
        assertEquals(255.0, precoTotal);
    }
}
