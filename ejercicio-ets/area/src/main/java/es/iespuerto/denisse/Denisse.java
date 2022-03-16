package es.iespuerto.denisse;

/**
 * Ejercicio para el examen de Entornos de desarrollo
 * @author Denisse Moujalli Totesaut
 * @version 1.0
 */
public class Denisse {
    private String tipo;
    private int valor1;
    private int valor2;

    /**
     * Constructor vacío de la clase.
     */
    public Denisse(){}

    /**
     * Constructor que recibe un solo parámetro de la clase.
     * @param valor1 primer valor a ingresar.
     */
    public Denisse(int valor1) {
        this.valor1 = valor1;
    }

    /**
     * Constructor que recibe dos parámetros de la clase.
     * @param valor1 primer valor a ingresar.
     * @param valor2 segundo valor a ingresar.
     */
    public Denisse(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * Método de la clase para calrcular el area.
     * @param valor1 Número 1 para calcular el area
     * @param valor2 Número 2 para calcular el area.
     * @return
     */
    public double CalculoArea(int valor1, int valor2) {
        double area;
        // area de un rectángulo
        area=valor1*valor2;
        return area;
    }

    public static void main(String args[]) {
        Denisse a1=new Denisse();
        Denisse a2=new Denisse(35);
        Denisse a3=new Denisse(12,89);
        a3.CalculoArea();
    }
}
