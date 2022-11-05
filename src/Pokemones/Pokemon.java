package Pokemones;

public abstract class Pokemon {
	protected int id;
	protected String nombre;
	protected int vida;
	
	public Pokemon() {
	}
	
	public Pokemon(int id, String nombre, int vida) {
		this.id=id;
		this.nombre=nombre;
		this.vida=vida;
	}
	public void datosPokemon() {
		System.out.println("Id: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Vida: " + vida);
	}
	
	protected abstract void atacarPlacaje();
	protected abstract void atacarAraniazo();
	protected abstract void atacarMordisco();
}
