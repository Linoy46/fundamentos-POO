import java.util.Scanner;
public class App   {
    public static void main(String[] args) {
        int numint;
        double numdbl, res1, res2, res3, res4, res5, res6;
        System.out.printf("Bienvenidos, favor de seguir las instrucciones\n");
//Crea un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nDigite un número entero");
        //next int solo admite solo numeros enteros y evita los datos de otro tipo
        numint = scanner.nextInt();
        System.out.printf("\nDigite un número decimal");
        //similar que nextint, pero ahora con numeros decimales
        numdbl = scanner.nextDouble();
        //Realizar varias operaciones con los números introducidos y de
        // ser necesario cambia el tipo de dato para hacer la operacion
        res1 = numdbl + numint; //Suma
        res2 = numint / (int)numdbl; //División entera
        res3 = numint / numdbl; //División real
        res4 = numdbl / numint; //División real
        res5 = (int)numdbl / numint;
        res6 = (int)numdbl + numint; //Suma
        System.out.printf("\nEl valor de la operación =" + res1);
        System.out.printf("\nEl valor de la operación =" + res2);
        System.out.printf("\nEl valor de la operación = :" + res3);
        System.out.printf("\nEl valor de la operación =" + res4);
        System.out.printf("\nEl valor de la operación = :" + res5);
        System.out.printf("\nEl valor de la operación = "+ res6);

    }

}
