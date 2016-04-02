package mipaquete;

/**
 * Realiza operaciones matemáticas.
 * 
 * @author Jonatan Amuchastegui Gil.
 * @version 2016.03.16
 */
public class Operaciones {

	private static final double SMI = 5322.234; //No se usa.
	
	private int a;
	private int b;
	
	/**
	 * Inicializa la clase con dos números introducidos
	 * por el usuario.
	 * 
	 * @param a Primer número.
	 * @param b Segundo número.
	 */
	public Operaciones(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	/**
	 * Inicializa la clase con los dos 
	 * números con valor cero.
	 */
	public Operaciones() {
		this (0,0);		
	}
	
	/**
	 * Suma los dos números.
	 * @return el resultado de la suma.
	 */
	public int calculaSuma() {
		return a+b;
	}
	
	/**
	 * Resta los dos números.
	 * @return el resultado de la resta.
	 */
	public int calculaResta() {
		return a-b;
	}
	
	/**
	 * Multiplica los dos números y el parámetro.
	 * 
	 * @param parametro Número introducido por el usuario.
	 * @return  el resultado de la multiplicación.
	 */
	public int multiplicaNumero(int parametro) {
		return a*b*parametro;
	}

}
