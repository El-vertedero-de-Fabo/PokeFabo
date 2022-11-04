package Pokemones;

public abstract class Pokemon {
	protected int id;
	protected String nombre;
	protected int vida;
	
	
	protected abstract void atacarPlacaje();
	protected abstract void atacarAraniazo();
	protected abstract void atacarMordisco();
}
