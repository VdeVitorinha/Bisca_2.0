
package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class Jogador {
	
        private String nome;
        private List<Carta> cartasEmMao = new ArrayList<>() ;
        private int pontos;
        
        public Jogador(String nome) {
            this.nome = nome;
            this.pontos = 0;
        }
        
	        public List<Carta> getCartasMao() {
	            return cartasEmMao;
	        }
        
		        public String getNome() {
		            return nome;
		        }
    
			        public void setNome(String nome) {
			            this.nome = nome;
			        }
        
				        public int getPontos() {
				            return pontos;
				        }
    
					        public void setPontos(int pontos) {
					            this.pontos = pontos;
					        }
    
						        public void setCartasMao(List<Carta> cartasEmMao) {
						            this.cartasEmMao = cartasEmMao;
						        }
        
        public void compraPlayer(Baralho baralho) {
            Carta carta = baralho.compraPlayer();
            cartasEmMao.add(carta);
            System.out.println("O jogador " + nome + " comprou a carta " + carta);
        }
	        public void receberCarta(Baralho baralho) {
	            Carta carta = baralho.compraPlayer();
	            cartasEmMao.add(carta);
	        }
        
			    public Carta LancaCarta() {
			        Random random = new Random();
			        int index = random.nextInt(cartasEmMao.size());
			        return cartasEmMao.remove(index);
			    }
        
			        public int contarPontos() {
			            int totalPontos = 0;
			            for (Carta carta : cartasEmMao) {
			                totalPontos += carta.getPonto();
			            }
		            pontos = totalPontos;
		            return pontos;
			        }
        
				        public void mostrarPontuacao() {
				            System.out.println("A pontuação do jogador " + nome + " foi de " + pontos + " pontos");
				        }
    
        public String toString() {
            StringBuilder sb = new StringBuilder(nome);
            sb.append(" (");
            if (!cartasEmMao.isEmpty()) {
                for (int i = 0; i < cartasEmMao.size(); i++) {
                    sb.append(cartasEmMao.get(i));
                    if (i != cartasEmMao.size() - 1) {
                        sb.append(", ");
                    }
                }
            }
            sb.append(")");
            return sb.toString();
        }

    }
