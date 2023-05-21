import model.Artigo;

public abstract class Controle {

    private Controle nextCheck;

    public Controle() {
    }

    public abstract void Check(Artigo criterio);

    public Controle getNextCheck() {
        return nextCheck;
    }

    public void setNextCheck(Controle nextCheck) {
        this.nextCheck = nextCheck;
    }

}
