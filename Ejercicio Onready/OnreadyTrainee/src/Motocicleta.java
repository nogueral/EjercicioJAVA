import java.text.DecimalFormat;

public class Motocicleta extends Vehiculo {

	int cilindrada;
	
	
	/**
	 * Constructor
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param cilindrada
	 */
	public Motocicleta(Marca marca, String modelo, double precio, int cilindrada)
	{
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	/**
	 * Sobrecarga del metodo Mostrar de la clase base Vehiculo
	 */
	@Override
	public String Mostrar(){
		
		DecimalFormat formateador = new DecimalFormat("0000.00");
		
		return "Marca: " + this.marca.toString() + " // " + "Modelo: " + this.modelo +
				" // " + "Cilindrada: " + this.cilindrada + "cc // " +
				"Precio: $" + formateador.format(this.precio);
	}
}
