package model;

public class CardapioInfantil extends Menu{
    private double gift;

    public CardapioInfantil(double precoBase, double gift) {
        super(precoBase);
        this.gift = gift;
    }

    @Override
    protected void montar() {
        System.out.println("Montando cardápio infantil");
    }

    @Override
    protected void CalculoExtras() {
        System.out.println("Adicionando presente surpresa (custo adicional de R$ " + gift + ")");
    }

    @Override
    protected double CalcularPrecoVenda() {
        return super.CalcularPrecoVenda() + gift + (super.CalcularPrecoVenda() * 0.01);
    }
}
