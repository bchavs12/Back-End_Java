import model.Artigo;

public  class CheckQuality {
    public Controle inicial;

    public CheckQuality(){
        
        this.inicial =  new CheckLote();
        Controle peso = new CheckPeso();
        Controle embalagem = new CheckEmbalagem();

        inicial.setNextCheck(peso);
        peso.setNextCheck(embalagem);
    }

    public void analisar(Artigo artigo){
        inicial.Check(artigo);
    }

}
