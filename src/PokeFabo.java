import Pokemones.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
// Para la visibilidad dentro del mismo paquete

public class PokeFabo {

	public static void main(String[] args) {
		
		probandoStream();
	}
	static void probandoStream() {
		List<Integer> numeros =  new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(44);
		numeros.add(2);
		
		filtrarNumeros(numeros).forEach(System.out::println);
		mapearNumeros(numeros).forEach(System.out::println);
		trucarNumeros(numeros,2).forEach(System.out::println);
		System.out.println(macheoNumeros(numeros));
		System.out.println(maxNumero(numeros));
		System.out.println(countNumeros(numeros));
		System.out.println(totalNumeros(numeros));
		System.out.println(promedioNumeros(numeros));
		ordenarNumeros(numeros).forEach(System.out::println);

	}
	static List<Integer> ordenarNumeros(List<Integer> numeros){
		return numeros.stream()
				.sorted((n1,n2)-> n1.compareTo(n2))
				.collect(Collectors.toList());
	}

	static double promedioNumeros(List<Integer> numeros) {
		return numeros.stream()
				.mapToInt(numero->numero)
				.average().orElse(0);
	}
	static int totalNumeros(List<Integer> numeros) {
		return numeros.stream()
				.mapToInt(alumno->alumno)
				.sum();
	}
	
	static int countNumeros(List<Integer> numeros) {
		return (int) numeros.stream()
				.filter(alumno->alumno>2)
				.count();
	}
	static int maxNumero(List<Integer> numeros) {
		return numeros.stream()
				.max((a1,a2)-> Integer.compare(a1, a2))
				.orElse(null);
	}
	static boolean macheoNumeros(List<Integer> numeros) {
		return numeros.stream()
				.anyMatch(alumno->alumno==6);
	}
	static List<Integer> trucarNumeros(List<Integer> numeros, int nro){
		return numeros.stream()
				.limit(nro)
				.collect(Collectors.toList());
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
