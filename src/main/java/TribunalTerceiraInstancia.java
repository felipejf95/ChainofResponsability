public class TribunalTerceiraInstancia extends Tribunal{

    TribunalTerceiraInstancia(Tribunal superior){
        listaProcessos.add(ProcessoGrau3.getRecurso2());
        setTribunalSuperior(superior);
    }

    @Override
    public String getDescricaoTribunal() {
        return "Terceira instancia";
    }
}
