<h1 align="center">  PokeFabo </h1>

Juego con pokemones inventados por mi persona (algunos son algo fumadas)

![](/Portada/Portada.jpg)

---

## Streams

<p><img width="250" align='right' src="./Portada/Pikachu.png"></p>


- [Programa Principal](#programa-principal)
- [ordenarNumeros](#ordenarnumeros)
- [promedioNumeros](#promedionumeros)
- [totalNumeros](#totalnumeros)
- [countNumeros](#countnumeros)
- [maxNumero](#maxnumero)
- [macheoNumeros](#mapearnumeros)
- [trucarNumeros](#trucarnumeros)
- [mapearNumeros](#mapearnumeros)
- [filtrarNumeros](#filtrarnumeros)

---

## Programa Principal

```java
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
```

### ordenarNumeros

```java
static List<Integer> ordenarNumeros(List<Integer> numeros){
	return numeros.stream()
		.sorted((n1,n2)-> n1.compareTo(n2))
		.collect(Collectors.toList());
}
```

### promedioNumeros

```java
static double promedioNumeros(List<Integer> numeros) {
	return numeros.stream()
		.mapToInt(numero->numero)
		.average().orElse(0);
}
```

### totalNumeros

```java
static int totalNumeros(List<Integer> numeros) {
	return numeros.stream()
		.mapToInt(alumno->alumno)
		.sum();
}
```
### countNumeros

```java
static int countNumeros(List<Integer> numeros) {
	return (int) numeros.stream()
		.filter(alumno->alumno>2)
		.count();
}
```
### maxNumero

```java
static int maxNumero(List<Integer> numeros) {
	return numeros.stream()
		.max((a1,a2)-> Integer.compare(a1, a2))
		.orElse(null);
}
```
### macheoNumeros

```java
static boolean macheoNumeros(List<Integer> numeros) {
	return numeros.stream()
		.anyMatch(alumno->alumno==6);
}
```
### trucarNumeros

```java
static List<Integer> trucarNumeros(List<Integer> numeros, int nro){
	return numeros.stream()
		.limit(nro)
		.collect(Collectors.toList());
}
```

### mapearNumeros

```java
static List<Integer> mapearNumeros(List<Integer> numeros){
	return numeros.stream()
		.map(alumno->alumno+4)
		.collect(Collectors.toList());
}
```

### filtrarNumeros

```java
	static List<Integer> filtrarNumeros(List<Integer> numeros) {
	return numeros.stream()
		.filter(numero->numero == 2)
		.collect(Collectors.toList());
}
``