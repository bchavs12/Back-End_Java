package model;

public class CardapioVegano extends Menu{
    private double acrescimosEspeciais;

    public CardapioVegano(double precoBase, double acrescimosEspeciais) {
        super(precoBase);
        this.acrescimosEspeciais = acrescimosEspeciais;
    }

    @Override
    protected void montar() {
        System.out.println("Montando cardápio vegetariano");
    }

    @Override
    protected void CalculoExtras() {
        System.out.println("Adicionando embalagem especial (custo adicional de R$ " + acrescimosEspeciais + ")");
        System.out.println("Adicionando temperos (custo adicional de 1%)");
    }

    @Override
    protected double CalcularPrecoVenda() {
        return super.CalcularPrecoVenda() + acrescimosEspeciais;
    }
}
