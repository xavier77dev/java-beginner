import library.Book;
import library.BorrowingRecord;
import library.Member;
import library.MembersVip;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "Dístopía", 15);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasía", 8);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "Ficción Clásica", 12);

        Member user1 = new Member("Juan","12346", "Pérez", "12345678");
        Member user2 = new Member("María","1111", "González", "87654321");
        Member user3 = new Member("Carlos","89898", "Ramírez", "45678912");

        Book[] booksUser1 = new Book[]{book1, book2, book3};

        BorrowingRecord borrowingfirst = new BorrowingRecord(user1, "11/04/25",booksUser1);

        borrowingfirst.getBorringRecodUser();

        user1.setFirstName("Pablo");
        System.out.println(user1.getFirstName());

//        MembersVip memberVip1 = new MembersVip("Lopez", "45412", "Fernando", "784512");
        MembersVip memberVip1 = new MembersVip(user1);
        System.out.println("----");

        memberVip1.getPassword();
        System.out.println(memberVip1.getFirstName());




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
//        System.out.println("Primavera");
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
//        teniendo en cuenta que solo son tres posibilidades de fallo (check)
//        controlar tambien que sean de 4 digitos que la suma de los digitos del medio sea un numero par
//        ojo qur solo usando programacion estructurada osea qe no le meta arrays dale
//        solo con lo basico nomas si cumple todo el control imprime "Acceso Permitido#
//        si no imprima por que no cumple el control y si pasa los 3 intentos imprima "Acceso Bloqueado"
//        nada de arrays los String son arrays es un dato numerico un int seria es un arrays de caracteres
//        hay un algoritmo para sacar los digitos

        // validate 4 digits (x)
        // 3 intentos (x)
        // suma de los 2 numeros del medio deben ser pares (x)

//        validateUser();

        // 6. Arrays and matrices

//        String names [] = new String[8];
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < names.length; i++) {
//            String name = scanner.next();
//            names[i] = name;
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Pos: " + i + " " + names[i]);
//        }


        // 7. POO


        // create a new class
        Book biblia = new Book("biblia", "Jesucito lindo", "historia, ficcion", 50);



        // TODO: Topics before Spring Boot
//        Fundamental Concepts
//        Classes and Objects – Defining classes, creating objects, and using constructors.
//        Encapsulation – Using access modifiers (private, public, protected) and getter/setter methods.
//        Inheritance – Extending classes (extends keyword) and method overriding.
//        Polymorphism – Method overloading and method overriding.
//        Abstraction – Using abstract classes and interfaces.

//        Advanced OOP Concepts
//        Composition vs. Inheritance – When to use composition instead of inheritance.
//        Interfaces vs. Abstract Classes – Differences and best practices.
//        Inner Classes – Static and non-static inner classes.
//        Final Keyword – Final classes, methods, and variables.
//        Static vs. Instance Members – Differences and usage.

//        Design Principles & Patterns
//        SOLID Principles – Best practices for designing maintainable code.
//        Factory Pattern – Creating objects without specifying exact classes.
//        Singleton Pattern – Ensuring only one instance of a class exists.
//        Observer Pattern – Implementing event-driven programming.
//        Dependency Injection – Loose coupling between objects.
    }

//    public static  void validateUser() {
//
//        int failCounts = 0;
//        Scanner keyboard = new Scanner(System.in);
//
//        while (failCounts < 3) {
//            System.out.println("Introduce el codigo (4 digitos): ");
//            int code = keyboard.nextInt();
//
//            if (validateCode(code)) {
//                System.out.println("Acceso permitido");
//                break;
//            } else {
//                failCounts++;
//                System.out.println("Acceso incorrecto, tienes " + failCounts + " intentos de 3");
//            }
//        }
//    }
//
//    public static boolean validateCode(int code) {
//        int newCode = code;
//        int digits = 0;
//
//        while (newCode > 0) {
//            newCode /= 10;
//            digits++;
//        }
//
//        if (digits != 4) {
//            return false;
//        }
//
//        if ((getDigit(2, code) + getDigit(3, code)) % 2 != 0) {
//            return false;
//        };
//
//        return true;
//    }
//
//    public static int getDigit(int position, int number) {
//        for (int i = 1; i < position; i++) {
//            number /= 10;
//
//        }
//        return  number%10;
//    }
}
