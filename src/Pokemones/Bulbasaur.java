package Pokemones;



import Tipos.tipoPlanta;

public class Bulbasaur extends Pokemon implements tipoPlanta{

	@Override
	protected void atacarPlacaje() {
		System.out.println("Bulbasaur Usa Placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Bulbasaur Usa Araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Bulbasaur Usa Mordisco");
		
	}

	@Override
	public void atacarDrenadoras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atacarToxico() {
		// TODO Auto-generated method stub
		
	}

}
