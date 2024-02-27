//clase: animal.
//integrantes: samuel rodriguez, cristhian brandon moreno, cristhian leonardo
import animal.Animal;
import animal.Perro;
import animal.Gato;
public class main {
    public static void main(String[] args) {
        //prueba de superclse animal
        Animal animal1 = new Animal();
        animal1.toString();
        Animal animal2 = new Animal("firulais",2);
        animal2.toString();

        Perro Perro1 = new Perro();
        Perro1.toString();
        Perro perro2 = new Perro();
        perro2.setNombre("solovino");
        perro2.setEdad(3);
        perro2.toString();
        Perro perro3 =new Perro();
        perro3.setNombre("fifi");
        perro3.setEdad(2);
        perro3.setRaza("Labrador");
        perro3.toString();

        Gato gato1 = new Gato();
        System.out.println(gato1);

        Gato gato2 =new Gato();
        gato2.setNombre("pelusa");
        gato2.setEdad(5);
        System.out.println(gato2);

        Gato gato3 = new Gato();
        System.out.println("\nprueba de quitar vida,no tiene mas datos");
        System.out.println(gato3);
        gato1.quitaVida();
        System.out.println(gato1);
    }
    }