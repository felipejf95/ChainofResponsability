public class ProcessoGrau1 implements GrauProcesso {

    private static ProcessoGrau1 processo2 = new ProcessoGrau1();

    private ProcessoGrau1() {};

    public static ProcessoGrau1 getCasoSimples(){
        return processo2;
    }
}
