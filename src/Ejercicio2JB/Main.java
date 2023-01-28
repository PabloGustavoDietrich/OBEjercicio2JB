package Ejercicio2JB;

public class Main {
    final private static double iva = 0.21;
    public static void main(String[] args) {

        /*Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.*/
        double precio = 100.10;
        System.out.println(precioMasIVA(precio));
    }
    public static double precioMasIVA(double precio){
        double precioTotal;
        precioTotal = precio + (precio * iva);
        return precioTotal;
    }
}