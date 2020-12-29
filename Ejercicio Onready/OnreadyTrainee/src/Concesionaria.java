import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;

public class Concesionaria {

	LinkedList<Vehiculo> listaVehiculos;
	
	/**
	 * Constructor
	 */
	public Concesionaria(){
		
		this.listaVehiculos = new LinkedList<Vehiculo>();
	}
	

	/**
	 * Getter lista de vehiculos
	 * @return la lista de vehiculos
	 */
	public LinkedList<Vehiculo> GetListaVehiculos() {
		
		return this.listaVehiculos;
	}
	
	/**
	 * Muestra todos los vehiculos contenidos en la lista
	 */
	public void Mostrar() {
		
		for(Vehiculo v : this.listaVehiculos) {
			
			System.out.println(v.Mostrar());
		}
	}
	
	/**
	 * Muestra el vehiculo mas caro
	 */
	public void VehiculoMasCaro() {
		
		Vehiculo auxV = new Vehiculo();
		
		for(Vehiculo v : this.listaVehiculos) {
			
			if(v.GetPrecio() > auxV.GetPrecio()) {
				
				auxV = v;
			}
		}
		
		System.out.println("Vehiculo mas caro: " + auxV.GetMarca().toString() + " " + auxV.GetModelo());
	}
	
	/**
	 * Muestra el vehiculo mas barato
	 */
	public void VehiculoMasBarato() {
		
		Vehiculo auxV = new Vehiculo();
		boolean flag = true;
		
		for(Vehiculo v : this.listaVehiculos) {
			
			if(v.GetPrecio() < auxV.GetPrecio() || flag) {
				
				auxV = v;
				flag = false;
			}
		}
		
		System.out.println("Vehiculo mas barato: " + auxV.GetMarca().toString() + " " + auxV.GetModelo());
	}
	
	/**
	 * Muestra el vehiculo que contiene la letra 'Y' en la marca
	 */
	public void VehiculoPorLetra() {
		
		DecimalFormat formateador = new DecimalFormat("0000.00");
		
		for(Vehiculo v : this.listaVehiculos) {
			
			if(v.GetMarca().toString().contains("Y")) {
				
				System.out.println("Vehiculo que contienen en el modelo la letra 'Y': " 
				+ v.GetMarca().toString() + " " + v.GetModelo() + 
				" $" + formateador.format(v.GetPrecio()));
			}

		}
		
		
	}
	
	/**
	 * Ordena la lista de mayor a menor y la muestra
	 */
	public void OrdenarLista(){
		
	  Collections.sort(this.listaVehiculos);
	  
	  System.out.println("Vehículos ordenados por precio de mayor a menor: "); 
	  
		for(Vehiculo v : this.listaVehiculos) {
			
			System.out.println(v.GetMarca().toString() + " " + v.GetModelo());
		}
	}
}
