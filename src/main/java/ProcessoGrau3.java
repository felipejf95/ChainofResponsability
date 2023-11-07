public class ProcessoGrau3 implements GrauProcesso {

    private static ProcessoGrau3 processo3 = new ProcessoGrau3();

    private ProcessoGrau3() {};

    public static ProcessoGrau3 getRecurso2(){
        return processo3;
    }

}
