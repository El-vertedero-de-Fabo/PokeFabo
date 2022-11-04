import java.util.*;

import Pokemones.*;

public class Entrenador {
	private String nombre;
	private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
	
	public void capturarPokemon(Pokemon pokemon) {
		pokemones.add(pokemon);
	}
	public Entrenador nombreEntrenador(String nombre) {
		this.nombre=nombre;
		return this;
	}
	
	 public String toString(){
		 for(int i = 0; i < pokemones.size(); i++) {
	            System.out.println(pokemones);
	        }
		 return nombre;  
	}  
}
