import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteTriangulo {
    private TrianguloFactory factory;

    @BeforeEach
    public void setup() {
        factory = new TrianguloFactory();
    }

    @Test
    public void testTriangulo() {
        Triangulo trianguloVermelho1 = factory.getTriangulo("vermelho", 1);
        Triangulo trianguloVermelho2 = factory.getTriangulo("vermelho", 2);

        Assertions.assertEquals("vermelho", trianguloVermelho1.getCor());
        Assertions.assertEquals(1, trianguloVermelho1.getTamanho());

        Assertions.assertEquals("vermelho", trianguloVermelho2.getCor());
        Assertions.assertEquals(1, trianguloVermelho2.getTamanho());

        Triangulo trianguloVerde = factory.getTriangulo("verde", 4);

        Assertions.assertEquals("verde", trianguloVerde.getCor());
        Assertions.assertEquals(4, trianguloVerde.getTamanho());
    }
}
