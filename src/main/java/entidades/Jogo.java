package Entidades;

public class Jogo {
    public Baralho baralho;
    public Jogador player1;
    public Jogador player2;
    public Jogador player3;
    public Jogador player4;
    public Jogador playerWin;

    public Jogo(String Ale, String Pedroca, String Samuca, String BrunoBreno) {
        baralho = new Baralho();
        baralho.embaralhar();

	        player1 = new Jogador(Ale);
	        for (int i = 0; i < 3; i++) {
	            player1.receberCarta(baralho);
	        }
	
		        player2 = new Jogador(Pedroca);
		        for (int i = 0; i < 3; i++) {
		            player2.receberCarta(baralho);
		        }
		
			        player3 = new Jogador(Samuca);
			        for (int i = 0; i < 3; i++) {
			            player3.receberCarta(baralho);
			        }
			
				        player4 = new Jogador(BrunoBreno);
				        for (int i = 0; i < 3; i++) {
				            player4.receberCarta(baralho);
				        }
    }

	    public Jogador getJogadorVencedor() {
	        return playerWin;
	    }
	
	    
	    public void setJogadorVencedor(Jogador playerWin) {
	        this.playerWin = playerWin;
	    }

public void playJogo() {
    playerWin = null;

    int rodada = 1;
    while (rodada <= 7) {
        System.out.println("Rodada: " + rodada + "...");

        System.out.println("Jogador: " + player1.getNome());
        player1.contarPontos();
        player1.mostrarPontuacao();

	        System.out.println("Jogador: " + player2.getNome());
	        player2.contarPontos();
	        player2.mostrarPontuacao();
	        
	
		        System.out.println("Jogador: " + player3.getNome());
		        player3.contarPontos();
		        player3.mostrarPontuacao();
		
			        System.out.println("Jogador: " + player4.getNome());
			        player4.contarPontos();
			        player4.mostrarPontuacao();
			        
        System.out.println();
        //Distribui uma carta para cada jogador
        player1.compraPlayer(baralho);
        player2.compraPlayer(baralho);
        player3.compraPlayer(baralho);
        player4.compraPlayer(baralho);

        System.out.println("-------------------");

        	rodada++;
    }

        //Verificar qual jogador está na frente com maior ponto
        int playerFront = 0;
        Jogador playerAtual = null;

        if (player1.getPontos() > playerFront) {
            playerFront = player1.getPontos();
            playerAtual = player1;
        }

	        if (player2.getPontos() > playerFront) {
	            playerFront = player2.getPontos();
	            playerAtual = player2;
	        }
	
		        if (player3.getPontos() > playerFront) {
		            playerFront = player3.getPontos();
		            playerAtual = player3;
		        }
		
			        if (player4.getPontos() > playerFront) {
			            playerFront = player4.getPontos();
			            playerAtual = player4;
			        }

        //Indica quem foi o vencedor
        playerWin = playerAtual;
    }

    public void Resultados() {
        System.out.println("Pontuacao final:");
        System.out.println(player1.getNome() + " Ganhou: " + player1.getPontos() + " pontos");
        System.out.println(player2.getNome() + " Ganhou: " + player2.getPontos() + " pontos");
        System.out.println(player3.getNome() + " Ganhou: " + player3.getPontos() + " pontos");
        System.out.println(player4.getNome() + " Ganhou: " + player4.getPontos() + " pontos");

        if (playerWin != null) {
        	System.out.println("........**************........");
        	System.out.println("********...PARABENS...********");
            System.out.println("E o vencedor e " + playerWin.getNome() + " com " + playerWin.getPontos() + " pontos!");
        } else {
        	System.out.println("............0.o............");
            System.out.println("Infelizmente ninguém venceu");
        }
    }
}