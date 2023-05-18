import java.util.HashMap;
import java.util.Map;

public class TrianguloFactory {

    private Map<String, Triangulo> cacheTriangulos = new HashMap<>();

    public Triangulo getTriangulo(String cor, int tamanho) {
        String chave = cor;

        // Verifica se o objeto já existe no cache
        if (!cacheTriangulos.containsKey(chave)) {
            // Cria um novo objeto e adiciona ao cache
            Triangulo triangulo = new Triangulo(cor, tamanho);
            cacheTriangulos.put(chave, triangulo);
        }

        // Retorna o objeto do cache
        return cacheTriangulos.get(chave);
    }

}
