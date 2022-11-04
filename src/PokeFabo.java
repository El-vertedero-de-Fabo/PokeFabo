import Pokemones.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
// Para la visibilidad dentro del mismo paquete

public class PokeFabo {

	public static void main(String[] args) {
		
		List<Integer> numeros =  new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(2);
		
		//filtrarNumeros(numeros).forEach(System.out::println);
		mapearNumeros(numeros).forEach(System.out::println);
		
		
	}
	static List<Integer> mapearNumeros(List<Integer> numeros){
		return numeros.stream()
				.map(alumno->alumno+4)
				.collect(Collectors.toList());
	}
	
	static List<Integer> filtrarNumeros(List<Integer> numeros) {
		
		return numeros.stream()
				.filter(numero->numero == 2)
				.collect(Collectors.toList());
	}
	
	static void empezandoPartida() {
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
