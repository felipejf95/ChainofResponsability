public class ProcessoGrau2 implements GrauProcesso {

    private static ProcessoGrau2 recurso1= new ProcessoGrau2();

    private ProcessoGrau2() {};

    public static ProcessoGrau2 getRecurso1(){
        return recurso1;
    }

}
