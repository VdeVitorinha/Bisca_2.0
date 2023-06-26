package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;
    
    public Baralho() {
        cartas = new ArrayList<>();
        
        //Cartas no baralho
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta);
            }
        }
    }
    
    public List<Carta> getCartas() {
		return cartas;
	}

		public void setCartas(List<Carta> cartas) {
			this.cartas = cartas;
		}
	
			public void embaralhar() {
		        Collections.shuffle(cartas);
		    }
		    
			    public Carta compraPlayer() {
			        if (!cartas.isEmpty()) {
			            return cartas.remove(0);
			        } else {
			            return null;
			        }
			    }
}
