import org.example.Calculadora;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testCalculadora {
    @Test
    public void testSumar() {
        System.out.println ("prueba del metodo de suma");
        int a = 3;
        int b = 5;
        Calculadora calc = new Calculadora (a, b);
        double esperando = 8;
        double resultado = calc.sumar();
        assertEquals(esperando, resultado ,0.0);
        System.out.println(resultado);
    }
    @Test
    public void testRestar() {
        System.out.println("prueba del metodo de resta");
        int a = 4;
        int b = 2;
        Calculadora calc = new Calculadora(a, b);
        double esperado = 2;
        double resultado = calc.restar();
        assertEquals(esperado, resultado, 0.0);
        System.out.println(resultado);
    }

}