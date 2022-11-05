import Pokemones.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
// Para la visibilidad dentro del mismo paquete

public class PokeFabo {

	public static void main(String[] args) {
		empezandoPartida();
	}
	
	static void empezandoPartida() {
		Entrenador traine = new Entrenador();
		traine.nombreEntrenador("FaboHop");
		
		Charmander charmander = new Charmander(1, "Pepino", 666);
		traine.capturarPokemon(charmander);
		
		System.out.println(traine);
		
		charmander.datosPokemon();
		charmander.atacarAraniazo();
	}
	
}
