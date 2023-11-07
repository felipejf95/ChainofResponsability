import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessoTest {

    TribunalPrimeiraInstancia juiz;
    TribunalSegundaInstancia desembargador;
    TribunalTerceiraInstancia ministro;

    @BeforeEach
    void setUp(){
        ministro = new TribunalTerceiraInstancia(null);
        desembargador = new TribunalSegundaInstancia(ministro);
        juiz = new TribunalPrimeiraInstancia(desembargador);
    }

    @Test
    public void deveRetornarPrimeiraInstanciaParaProcessoGrau1(){
        assertEquals("Primeira instancia", juiz.julgarCaso(new Processo(ProcessoGrau1.getCasoSimples())));
    }

    @Test
    public void deveRetornarSegundaInstanciaParaProcessoGrau2(){
        assertEquals("Segunda instancia", juiz.julgarCaso(new Processo(ProcessoGrau2.getRecurso1())));
    }

    @Test
    public void deveRetornarTerceiraInstanciaParaProcessoGrau3(){
        assertEquals("Terceira instancia", juiz.julgarCaso(new Processo(ProcessoGrau3.getRecurso2())));
    }


}