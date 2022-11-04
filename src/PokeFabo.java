import Pokemones.*;
// Para la visibilidad dentro del mismo paquete

public class PokeFabo {
	public static void main(String[] args) {
		
		
	}
	void empezandoPartida() {
		Entrenador traine = new Entrenador();
		traine.nombreEntrenador("FaboHop");
		
		Charmander charmander = new Charmander();
		Bulbasaur bulbasaur = new Bulbasaur ();
		
		traine.capturarPokemon(charmander);
		traine.capturarPokemon(charmander);
		traine.capturarPokemon(charmander);
		
		System.out.println(traine);
		
		//charmander.atacarAraniazo();
	}
}
