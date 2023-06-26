package teste;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import entidades.Jogo;

public class JogoTest {
    private Jogo jogo;
    
    @Before
    public void setUp() {
        jogo = new Jogo("Ale", "Pedroca", "Samuca", "BrunoBreno");
    }
    
    @Test
    public void testIniciarJogo() {
        jogo.iniciarJogo();
        
        assertNotNull(jogo.getJogadorVencedor());
    }
    
    @Test
    public void testMostrarResultados() {
        jogo.iniciarJogo();
        
        jogo.mostrarResultados();
    }
}
