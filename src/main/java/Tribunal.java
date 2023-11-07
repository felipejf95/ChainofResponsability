import java.util.ArrayList;

public abstract class Tribunal {

    private Tribunal tribunalSuperior;
    protected ArrayList listaProcessos = new ArrayList();

    public Tribunal getTribunalSuperior(){
        return tribunalSuperior;
    }

    public void setTribunalSuperior(Tribunal tribunalSuperior) {
        this.tribunalSuperior = tribunalSuperior;
    }
    public abstract String getDescricaoTribunal();

    public String julgarCaso(Processo processo){
        if(listaProcessos.contains(processo.getProcesso()))
            return getDescricaoTribunal();
        else {
            if(tribunalSuperior != null){
                return tribunalSuperior.julgarCaso(processo);
            }
            else{
                return "sem julgamento";
            }
        }

    }
}
