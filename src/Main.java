import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Se requiere un programa en Java para calcular el resultado de la suma, diferencia, producto, módulo y cociente de dos números decimales de cualquier longitud");

    Scanner into= new Scanner(System.in);
    Float num1, num2, suma, diferencia, producto, cociente,modulo,cociente1;

    System.out.println("ingreso el primer número a utilizar:");
    num1= into.nextFloat();
        System.out.println("ingreso el segundo  número a utilizar:");
        num2= into.nextFloat();
suma=num1+num2;
diferencia=num1-num2;
producto=num1*num2;

cociente= num1/num2;


        System.out.println("la suma de" + num1+ "+"+num2+"es igual a "+ suma);
        System.out.println("la diferencia de" + num1+ "-"+num2+"es igual a "+ diferencia);
        System.out.println("el producto de" + num1+ "*"+num2+"es igual a "+ producto);
        System.out.println("el cociente de " + num1+ "/"+num2+"es igual a "+ cociente);



    }



    }
