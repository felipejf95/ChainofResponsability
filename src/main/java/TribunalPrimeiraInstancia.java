public class TribunalPrimeiraInstancia extends Tribunal{

    TribunalPrimeiraInstancia(Tribunal superior){
        listaProcessos.add(ProcessoGrau1.getCasoSimples());
        setTribunalSuperior(superior);
    }

    @Override
    public String getDescricaoTribunal() {
        return "Primeira instancia";
    }
}
