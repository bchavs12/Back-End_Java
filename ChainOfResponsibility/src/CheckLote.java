import model.Artigo;

public class CheckLote extends Controle {

    public CheckLote(){}

    @Override
    public void Check(Artigo criterio) {
        int lote = criterio.getLote();
        boolean loteCheck = lote >= 1000 && lote <= 2000;
        if (loteCheck){
            System.out.println("Critério do lote aceito, passando para o Proximo!");
            if (this.getNextCheck() != null) {
                this.getNextCheck().Check(criterio);
            }
        }else {
            System.out.println("Lote está errado!");
        }
    }
}
