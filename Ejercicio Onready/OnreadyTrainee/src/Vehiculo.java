import java.text.DecimalFormat;

public class Vehiculo implements Comparable<Vehiculo> {
	
enum Marca{
	
	Peugeot,
	Honda,
	Yamaha
	
}


Marca marca;
String modelo;
double precio;

/**
 * Constructor por defecto
 */
public Vehiculo() {
	
	this.precio = 0;
}

/**
 * Constructor parametrizado
 * @param marca
 * @param modelo
 * @param precio
 */
public Vehiculo(Marca marca, String modelo, double precio) {
	
	this.marca=marca;
	this.modelo=modelo;
	this.precio=precio;
}

/**
 * Getter atributo precio
 * @return precio
 */
public double GetPrecio() {
	
	return this.precio;
}

/**
 * Getter atributo marca
 * @return marca
 */
public Marca GetMarca() {
	
	return this.marca;
}

/**
 * Getter atributo modelo
 * @return modelo
 */
public String GetModelo() {
	
	return this.modelo;
}

/**
 * Sobrecarga del metodo compareTo, compara los objetos de tipo vehiculo por precio
 */
@Override
public int compareTo(Vehiculo v) {
	
	if(this.precio < v.precio) {
		return 1;
	}
	
	if(this.precio > v.precio) {
		return -1;
	}
	
	return 0;
}

/**
 * Muestra todos los datos del objeto
 * @return todos los datos del objeto
 */
public String Mostrar(){
	
	DecimalFormat formateador = new DecimalFormat("####.##");
	
	return "Marca: " + this.marca.toString() + " // " + "Modelo: " + this.modelo +
			" // " + "Precio: $" + formateador.format(this.precio);
}


}
