public class TribunalSegundaInstancia extends Tribunal{

    TribunalSegundaInstancia(Tribunal superior){
        listaProcessos.add(ProcessoGrau2.getRecurso1());
        setTribunalSuperior(superior);
    }

    @Override
    public String getDescricaoTribunal() {
        return "Segunda instancia";
    }
}
