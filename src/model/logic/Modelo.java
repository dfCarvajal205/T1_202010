package model.logic;

import java.io.BufferedReader;
import java.io.File;

import model.data_structures.*;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo <T>{
	/**
	 * Atributos del modelo del mundo
	 */
	private MiLista<T> datos;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new MiLista();
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darLongitud();
	}
	
	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(T dato)
	{	
		datos.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public T buscar(T dato)
	{
		return datos.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public T eliminar(T dato)
	{
		return datos.eliminar(dato);
	}

	public void cargarDatos(){
		File arch = new File("./data/comparendos_dei_2018_small");
		
		BufferedReader br = new BufferedReader(arg0);
	}
}
