import model.Artigo;

public class CheckPeso extends Controle {

    public CheckPeso(){}

    @Override
    public void Check(Artigo criterio) {
        int peso = criterio.getPeso();
        boolean pesoCheck = peso >= 1200 && peso <= 1300;
        if (pesoCheck){
            System.out.println("Critério do peso lote aceito, passando para o Proximo!");
            if (this.getNextCheck() != null) {
                this.getNextCheck().Check(criterio);
            }
        }else {
            System.out.println("Peso do Lote está errado!");
        }
    }

}
