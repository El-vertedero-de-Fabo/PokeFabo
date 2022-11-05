package Pokemones;
import Tipos.tipoFuego;

public class Charmander extends Pokemon implements tipoFuego{

	public Charmander() {
		super();
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Charmander Usa Placaje");
		
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Charmander Usa Araniazo");
		
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Charmander Usa Mordisco");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Charmander Usa Ascuas");
		
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Charmander Usa PunioFuego");
		
	}

}
