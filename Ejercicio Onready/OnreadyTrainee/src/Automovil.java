import java.text.DecimalFormat;

public class Automovil extends Vehiculo{

	int puertas;
	
	/**
	 * Constructor
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param puertas
	 */
	public Automovil(Marca marca, String modelo, double precio, int puertas)
	{
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
	
	/**
	 * Sobrecarga del metodo Mostrar de la clase base Vehiculo
	 */
	@Override
	public String Mostrar(){
		
		DecimalFormat formateador = new DecimalFormat("0000.00");
		
		return "Marca: " + this.marca.toString() + " // " + "Modelo: " + this.modelo +
				" // " + "Puertas: " + this.puertas + " // " +
				"Precio: $" + formateador.format(this.precio);
	}
}
