import model.Artigo;

public class Main {
    public static void main(String[] args) {

        CheckQuality processo = new CheckQuality();

        // Instanciando diretamente
        processo.analisar(new Artigo("Cosméticos",1500,1200,"Saudavel"));
        processo.analisar(new Artigo("Comidas",800,1400,"Não saudavel"));
        processo.analisar(new Artigo("Produtos",10000,1500,"Quase saudavel"));

    }
}