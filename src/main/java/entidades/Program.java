package entidades;

public class Program {
    public static void main(String[] args) {
        //Nomeia os jogadores
        Jogo jogo = new Jogo("Ale", "Pedroca", "Samuca", "BrunoBreno");

	        //Inicializa o jogo
	        jogo.playJogo();
	
		        //Mostra o Rsultado da partida
		        jogo.Resultados();
    }
}
