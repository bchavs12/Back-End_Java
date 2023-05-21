import model.Artigo;

public class CheckEmbalagem extends Controle{

    public CheckEmbalagem(){}

    @Override
    public void Check(Artigo criterio) {
        String embalagem = criterio.getEmbalagem();
        boolean embalagemVerificado = embalagem.equalsIgnoreCase("saudavel") || embalagem.equalsIgnoreCase("quase saudavel") ;
        if (embalagemVerificado){
            System.out.println("Critério da Embalagem aceita!, passando para o Proximo.");
            if (this.getNextCheck() != null) {
                this.getNextCheck().Check(criterio);
            }
        }else {
            System.out.println("Embalagem não corresponde ao critério requisitado!");
        }
    }
}
