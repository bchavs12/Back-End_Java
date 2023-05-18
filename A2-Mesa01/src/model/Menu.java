package model;

public abstract class Menu {

    protected double precoBase;

    public Menu(double precoBase) {
        this.precoBase = precoBase;
    }

    public final void prepararVender(){
        montar();
        CalculoExtras();
        CalcularPrecoVenda();
    }
    protected abstract void montar();

    protected abstract void CalculoExtras();

    protected  double CalcularPrecoVenda(){
        return precoBase;
    };

}
