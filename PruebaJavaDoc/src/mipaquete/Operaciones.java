package mipaquete;

/**
 * Realiza operaciones matem�ticas.
 * 
 * @author Jonatan Amuchastegui Gil.
 * @version 2016.03.16
 */
public class Operaciones {

	private static final double SMI = 5322.234; //No se usa.
	
	private int a;
	private int b;
	
	/**
	 * Inicializa la clase con dos n�meros introducidos
	 * por el usuario.
	 * 
	 * @param a Primer n�mero.
	 * @param b Segundo n�mero.
	 */
	public Operaciones(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	/**
	 * Inicializa la clase con los dos 
	 * n�meros con valor cero.
	 */
	public Operaciones() {
		this (0,0);		
	}
	
	/**
	 * Suma los dos n�meros.
	 * @return el resultado de la suma.
	 */
	public int calculaSuma() {
		return a+b;
	}
	
	/**
	 * Resta los dos n�meros.
	 * @return el resultado de la resta.
	 */
	public int calculaResta() {
		return a-b;
	}
	
	/**
	 * Multiplica los dos n�meros y el par�metro.
	 * 
	 * @param parametro N�mero introducido por el usuario.
	 * @return  el resultado de la multiplicaci�n.
	 */
	public int multiplicaNumero(int parametro) {
		return a*b*parametro;
	}

}
