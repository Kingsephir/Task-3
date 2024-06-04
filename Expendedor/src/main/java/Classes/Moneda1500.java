package Classes;

/**
 * Subclase de la clase Moneda
 * Representa las monedas de valor numérico 1500
 */
public class Moneda1500 extends Moneda{
    /**
     * Constructor por defecto, crea una instancia de Moneda1500 y entrega su valor a la superclase para asignar su serie.
     */
    public Moneda1500(){
        super(1500);
    }

    /**
     * Método que retorna el valor numérico de la moneda, el cual es 1500
     * @return int 1500, valor de la moneda
     */
    public int getValor(){
        return 1500;
    }

}
