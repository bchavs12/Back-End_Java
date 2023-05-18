package model;

public class CardapioAdulto extends Menu{
    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }

    @Override
    protected void montar() {
        System.out.println("Montando cardápio para adultos");
    }

    @Override
    protected void CalculoExtras() {

    }

}
