
/*
* Classe de exemplo aula de métodos - Calculadora
*/

public class Calculadora {

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtrair(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subtração de " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicar(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " = " + resultado);
    }

    public static void dividir(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " / " + numero2 + " = " + resultado);
    }
}