// Autor - Larian

package com.mycompany.ejerciciosjava_ut4;

import javax.swing.JOptionPane; // JOptionPane - Interfaces

public class Ejercicios {

    public static void main(String[] args) { // Llamar a un método u otro (ejercicios) según la opción indicada
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("ELIJA UN EJERCICIO (1 - 16):"));
        switch (opcion) {
            case 1:
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
            case 3:
                Ejercicio3();
                break;
            case 4:
                Ejercicio4();
                break;
            case 5:
                Ejercicio5();
                break;
            case 6:
                Ejercicio6();
                break;
            case 7:
                Ejercicio7();
                break;
            case 8:
                Ejercicio8();
                break;
            case 9:
                Ejercicio9();
                break;
            case 10:
                Ejercicio10();
                break;
            case 11:
                Ejercicio11();
                break;
            case 12:
                Ejercicio12();
                break;
            case 13:
                Ejercicio13();
                break;
            case 14:
                Ejercicio14();
                break;
            case 15:
                Ejercicio15();
                break;
            case 16:
                Ejercicio16();
                break;
            default:
                JOptionPane.showMessageDialog(null, "NO ES UNA OPCIÓN");
                break;
        }
    }
    
    public static void Ejercicio1() { // Pedir número por teclado y ver si es par o impar
        JOptionPane.showMessageDialog(null, "PAR O IMPAR");
        int num = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN\nNÚMERO:"));
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "ES PAR");
        } else {
            JOptionPane.showMessageDialog(null, "ES IMPAR");
        }
    }
    
    public static void Ejercicio2() { // Pedir número y mostrar si es múltiplo de 10
        JOptionPane.showMessageDialog(null, "¿ES MÚLTIPLO DE 10?");
        int num = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN\nNÚMERO:"));
        if (num % 10 == 0) {
            JOptionPane.showMessageDialog(null, "ES MÚLTIPLO");
        } else {
            JOptionPane.showMessageDialog(null, "NO ES MÚLTIPLO");
        }
    }
    
    public static void Ejercicio3() { // Pedir letra por teclado y ver decir si es mayúscula o minúscula
        JOptionPane.showMessageDialog(null, "¿MAYÚSCULA O MINÚSCULA?");
        String letra = JOptionPane.showInputDialog("INTRODUZCA UNA\nLETRA:");
        String letra_min = letra.toLowerCase();
        if (letra == letra_min) {
            JOptionPane.showMessageDialog(null, "ES MINÚSCULA");
        } else {
            JOptionPane.showMessageDialog(null, "ES MAYÚSCULA");
        }
    }
    
    public static void Ejercicio4() { // Pedir dos caracteres por teclado y comprobar que son iguales
        JOptionPane.showMessageDialog(null, "¿SON IGUALES O NO?");
        String caracter = JOptionPane.showInputDialog("INTRODUZCA UN\nCARACTER:");
        String caracter2 = JOptionPane.showInputDialog("INTRODUZCA OTRO\nCARACTER:");
        if (caracter == caracter2) {
            JOptionPane.showMessageDialog(null, "SON IGUALES");
        } else {
            JOptionPane.showMessageDialog(null, "NO SON IGUALES");
        }
    }
    
    public static void Ejercicio5() { // Pedir dos número y dividir num1 por num2 y comprobar que el divisor no sea 0
        JOptionPane.showMessageDialog(null, "DIVIDIR NÚMEROS");
        int num_1 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL\nDIVIDENDO:"));
        int num_2 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL\nDIVISOR:"));
        if (num_2 == 0) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE\nDIVIDIR ENTRE 0");
        } else {
            JOptionPane.showMessageDialog(null, "EL RESULTADO ES:\n" + (num_1 / num_2));
        }
    }
    
    public static void Ejercicio6() { // Pedir tres números por teclado, sumarlos y mostrar el mayor
        JOptionPane.showMessageDialog(null, "SUMAR NÚMEROS");
        int num_1 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL\nPRIMER NÚMERO"));
        int num_2 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL\nSEGUNDO NÚMERO:"));
        int num_3 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL\nTERCER NÚMERO:"));
        JOptionPane.showMessageDialog(null, "LA SUMA DE\n" + num_1 + " + " + num_2 + " + " + num_3 + "\nES IGUAL A: " + (num_1 + num_2 + num_3));
        if (num_1 > num_2 && num_1 > num_3) {
            JOptionPane.showMessageDialog(null, "DE LOS NÚMEROS\nINTRODUCIDOS, EL\nMAYOR ES: " + num_1);
        } else if (num_2 > num_1 && num_2 > num_3) {
            JOptionPane.showMessageDialog(null, "DE LOS NÚMEROS\nINTRODUCIDOS, EL\nMAYOR ES: " + num_2);
        } else if (num_3 > num_1 && num_3 > num_2) {
            JOptionPane.showMessageDialog(null, "DE LOS NÚMEROS\nINTRODUCIDOS, EL\nMAYOR ES: " + num_3);
        } else {
            JOptionPane.showMessageDialog(null, "LOS TRES NÚMEROS\nINTRODUCIDOS SON\nIGUALES");
        }
    }
    
    public static void Ejercicio7() { // Pedir número de més, dar nombre y los días que tiene
        JOptionPane.showMessageDialog(null, "MESES");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL\nNÚMERO DE MÉS"));
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "ENERO - 31 DÍAS");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "FEBRERO - 28 DÍAS\n29 DÍAS SI ES AÑO\nBISIESTO");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "MARZO - 31 DÍAS");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "ABRIL - 30 DÍAS");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "MAYO - 31 DÍAS");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "JUNIO - 30 DÍAS");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "JULIO - 31 DÍAS");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "AGOSTO - 31 DÍAS");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "SEPTIEMBRE - 30 DÍAS");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "OCTUBRE - 31 DÍAS");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "NOVIEMBRE - 30 DÍAS");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "DICIEMBRE - 31 DÍAS");
                break;  
            default:
                JOptionPane.showMessageDialog(null, "NO HAY MÁS DE\n12 MESES");
                break;
        }
    }

    public static void Ejercicio8() { // Imprimir los números del 1 al 100 usando while
        JOptionPane.showMessageDialog(null, "NÚMEROS DEL 1 AL 100");
        int num = 0;
        while (num != 100) {
            num++;
            JOptionPane.showMessageDialog(null, num);
        }
    }

    public static void Ejercicio9() { // Imprimir los números del 1 al 100 usando for
        for (int num = 1; num < 101; num++) {
            JOptionPane.showMessageDialog(null, num);
        }
    }

    public static void Ejercicio10() { // Imprimir los números del 1 al 100 que sean divisibles entre 2 y 3
        for (int num = 1; num < 101; num++) {
            if (num % 2 == 0 || num % 3 == 0) {
                JOptionPane.showMessageDialog(null, num);
            }
        }
    }

    public static void Ejercicio11() { // Pedir número de ventas y pedir tantas ventas como número se haya indicado
        int num_ventas = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DE VENTAS"));
        int contador = 1;
        int suma = 0;
        while (contador != num_ventas + 1) {
            int venta = Integer.parseInt(JOptionPane.showInputDialog("VENTA " + contador));
            contador++;
            suma = suma + venta;
        }
        JOptionPane.showMessageDialog(null, "EL TOTAL DE LAS\nVENTAS ES:\n" + suma);
    }

    public static void Ejercicio12() { // Ecuación de segundo grado y comprobar discriminante
        JOptionPane.showMessageDialog(null, "ECUACIÓN DE\nSEGUNDO GRADO");
        double a = Double.parseDouble(JOptionPane.showInputDialog("INTRODUZCA A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("INTRODUZCA B:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("INTRODUZCA C:"));
        JOptionPane.showMessageDialog(null, a + "x^2 + " + b + "x + " + c + " = 0");
        double discriminante =  Math.pow(b, 2) - 4 * a * c;
        if (discriminante == 0) { // Una solución real doble
            double resultado1 = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "x:\n" + resultado1);
        } else if (discriminante > 0) { // Dos soluciones reales diferentes
            double resultado1 = (-b - Math.sqrt(discriminante)) / (2 * a);
            double resultado2 = (-b + Math.sqrt(discriminante)) / (2 * a);
            JOptionPane.showMessageDialog(null, "x1:\n" + String.format("%.2f", resultado1) + "\nx2:\n" + String.format("%.2f", resultado2));
        } else { // Dos soluciones complejas
            double parte_real = -b / (2 * a);
            double parte_imaginaria = Math.sqrt(-discriminante) / (2 * a);
            JOptionPane.showMessageDialog(null, "DOS SOLUCIONES COMPLEJAS:\nx1 = " + parte_real + " + " + parte_imaginaria + "i\nx2 = " + parte_real + " - " + parte_imaginaria + "i");
        }
    }

    public static void Ejercicio13() { // Pedir número mayor o igual de 0, si no lo es pedirlo constantemente hasta que lo sea
        int num = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN NÚMERO\nMAYOR O IGUAL QUE 0"));
        while (num < 0) {
            JOptionPane.showMessageDialog(null, "¡ERROR!");
            num = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN NÚMERO\nMAYOR O IGUAL QUE 0"));
        }
        JOptionPane.showMessageDialog(null, "EL NÚMERO ES:\n" + num);
    }

    public static void Ejercicio14() { // Introducir contraseña con 3 intentos y si es correcta sale
        String psswd = "Password1234_.";
        int contador = 0, maximo = 3;
        while (contador < maximo) {
            String input = JOptionPane.showInputDialog("INTRODUZCA LA CONTRASEÑA:");
            if (input.equals(psswd)) {
                JOptionPane.showMessageDialog(null, "¡ENHORABUENA!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "INCORRECTO");
                contador++;
            }
        }
    }

    public static void Ejercicio15() { // Pedir día de la semana e indicar si es día laboral o no
        String dia = JOptionPane.showInputDialog("INTRODUZCA UN DÍA\nDE LA SEMANA:");
        dia.toLowerCase();
        switch (dia) {
            case "lunes":
                JOptionPane.showMessageDialog(null, "LUNES:\nDÍA LABORAL");
                break;
            case "martes":
                JOptionPane.showMessageDialog(null, "MARTES:\nDÍA LABORAL");
                break;
            case "miercoles":
                JOptionPane.showMessageDialog(null, "MIÉRCOLES:\nDÍA LABORAL");
                break;
            case "jueves":
                JOptionPane.showMessageDialog(null, "JUEVES:\nDÍA LABORAL");
                break;
            case "viernes":
                JOptionPane.showMessageDialog(null, "VIERNES:\nDÍA LABORAL");
                break;
            case "sabado":
                JOptionPane.showMessageDialog(null, "SÁBADO:\nDÍA LABORAL");
                break;
            case "domingo":
                JOptionPane.showMessageDialog(null, "DOMINGO:\nDÍA NO LABORAL");
                break;
            default:
                JOptionPane.showMessageDialog(null, "NO ES UN DÍA\nDE LA SEMANA");
                break;
        }
    }

    public static void Ejercicio16() { // Pedir número e indicar si es un número primo
        int num_p = Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODZCA UN NÚMERO:"));
        if (num_p % num_p == 0 && num_p % 1 == 0) {
            JOptionPane.showMessageDialog(null, num_p + " ES UN\nNÚMERO PRIMO");
        } else if (num_p == 1 || num_p < 0) {
            JOptionPane.showMessageDialog(null, num_p + " NO ES UN\nNÚMERO PRIMO");
        } else {
            JOptionPane.showMessageDialog(null, num_p + " NO ES UN\nNÚMERO PRIMO");
        }
    }
}