package entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import entidades.Baralho;
import entidades.Carta;
import entidades.Jogador;

public class JogadorTest {
    private Jogador jogador;
    
    @Before
    public void setUp() {
        jogador = new Jogador("Mario");
    }
    
    @Test
    public void testComprarCarta() {
        Baralho baralho = new Baralho();
        
        jogador.compraPlayer(baralho);
        
        assertEquals(1, jogador.getCartasMao().size());
    }
    
    @Test
    public void testReceberCarta() {
        Baralho baralho = new Baralho();
        
        jogador.receberCarta(baralho);
        
        assertEquals(1, jogador.getCartasMao().size());
    }
    
    @Test
    public void testJogarCarta() {
        Baralho baralho = new Baralho();
        jogador.receberCarta(baralho);
        
        Carta carta = jogador.LancaCarta();
        
        assertNotNull(carta);
        assertEquals(0, jogador.getCartasMao().size());
    }
    
    
//    @Test
//    public void testContarPontos() {
//        Baralho baralho = new Baralho();
//        jogador.receberCarta(baralho);
//        jogador.receberCarta(baralho);
//        
//        int pontos = jogador.contarPontos();
//        
//        assertEquals(0, pontos);
//        assertEquals(2, jogador.getPontos());
//    }
//    
    
    @Test
    public void testMostrarPontuacao() {
        jogador.mostrarPontuacao();
    }
    
    @Test
    public void testToString() {
        String jogadorString = jogador.toString();
        
        assertNotNull(jogadorString);
    }
}
