import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //1. declaration and assignment var

        //        int age = 77;
        //        double priceTotal = 1.71;
        //        boolean isActive = true;
        //        char letter = 'a';
        //        String description = "Hello World, Java";
        //        long amountPeople = 975454545L;
        //
        //        System.out.println("My age:" + age);

        //2. operator (pending) 1:03:00 time video

        //        double num1, num2, result;
        //        Scanner teclado = new Scanner(System.in);
        //
        //        System.out.println("Num1: ");
        //        num1 = teclado.nextDouble();
        //        System.out.println("Num2: ");
        //        num2 = teclado.nextDouble();
        //
        //        result = num1 / num2;
        //
        //        System.out.println("Result: " + result);

        // 3. conditions

        //        boolean isLive = false;
        //        int age = 17;
        //        int estacion = 10;

        //
        //        switch (estacion) {
        //            case 1:
        //                System.out.println("Primavera") ;
        //                break;
        //            case 2:
        //                System.out.println("Verano");
        //                break;
        //            default:
        //                System.out.println("No hay");
        //                break;
        //        }
        //        if (estacion == 1) {
        //            System.out.println("Primavera");
        //        } else if (estacion == 2) {
        //            System.out.println("Verano");
        //        } else {
        //            System.out.println("No hay estacion");
        //        }

        // 3.1 Exercise

        //        Scanner keyboard = new Scanner(System.in);
        //
        //        System.out.println("Ingrese la edad:");
        //        int age = keyboard.nextInt();
        //
        //        if (age > 4 && age <= 6) {
        //            System.out.println("Lunes y Miercoles de 16 a 17");
        //        } else if (age > 7 && age <= 8) {
        //            System.out.println("Martes y Jueves de 16:30 a 17:30");
        //        } else if (age > 9 && age <= 10) {
        //            System.out.println("Martes y Jueves de 17:30 a 19");
        //        } else if (age > 11 && age <= 13) {
        //            System.out.println("Martes y Jueves de 17 a 18:30");
        //        } else {
        //            System.out.println("No hay horario");
        //        }

        // 3.2 ternary operator

        //        boolean isDeath = false;
        //
        //        String response = (isDeath) ? "Esta muerto" : "Esta vivo";
        //
        //        System.out.println(response);

        // 4. MERCERIA

        //        Scanner keyboard = new Scanner(System.in);
        //
        //        System.out.println("Numero de productos:");
        //        int numProducts = keyboard.nextInt();
        //        System.out.println("Costo total:");
        //        double totalPrice = keyboard.nextDouble();
        //
        //        if (numProducts < 5) {
        //            System.out.println("No se permiten compras inferiores a 5");
        //        } else if (numProducts >= 5 && numProducts <= 15) {
        //            System.out.println("El costo de envio es de $10 USD");
        //        } else if (numProducts > 15) {
        //            System.out.println("El costo de envio es gratis");
        //        }
        //
        //        double discount, totalPriceWithDiscount;
        //
        //        if (totalPrice < 100) {
        //            System.out.println("No hay promocion, el costo total debe ser mayor a 100 USD");
        //        } else if (totalPrice > 100 && totalPrice < 300) {
        //            discount = totalPrice * 5 / 100;
        //            totalPriceWithDiscount = totalPrice - discount;
        //            System.out.println("El descuento es de 5%, debe de pagar: " + totalPriceWithDiscount);
        //        } else if (totalPrice > 300) {
        //            discount = totalPrice * 10 / 100;
        //            totalPriceWithDiscount = totalPrice - discount;
        //            System.out.println("El descuento es de 10%, debe de pagar: " + totalPriceWithDiscount);
        //        }

        // 5. loops

        // 5.1 Exercise - 4:05:48 time video
//        Realizar un programa que simule el control de acceso indroduciendo un valor numerico por teclado
//        teniendo en cuenta que solo son tres posibilidades de fallo
//        controlar tambien que sean de 4 digitos que la suma de los digitos del medio sea un numero par
//        ojo qur solo usando programacion estructurada osea qe no le meta arrays dale
//        solo con lo basico nomas si cumple todo el control imprime "Acceso Permitido#
//        si no imprima por que no cumple el control y si pasa los 3 intentos imprima "Acceso Bloqueado"
//        nada de arrays los String son arrays es un dato numerico un int seria es un arrays de caracteres
//        hay un algoritmo para sacar los digitos

//        boolean isNotCorrect = true;
//        int failCounts = 0;
//        int MAX_DIGITS = 4;
//        int MAX_CHANCE = 3;
//        int code;
//        int digits = 0;

//        Scanner keyboard = new Scanner(System.in);

//        while (code > 0) {
//            code /= 10;
//            digits++;
//        }

//        System.out.println(digits);

//        while (isNotCorrect) {
//            if (res > 0) {
//                digits += 1;
//            } else {
//                failCounts += 1;
//            }
//
//            while (res > 0) {
//
//            }
//
//            // el numero de intentos debe de ser igual o menor a 3
//            if (failCounts > 3) {
//                System.out.println("Acceso bloqueado");
//                isNotCorrect = false;
//            }
//        }
    }
}
