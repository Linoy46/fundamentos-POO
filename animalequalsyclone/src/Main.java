import animal.Animal;

public class Main {
    public static void main(String[] args) {
        try {
            // Creación de objetos
            Animal animal1 = new Animal("Firulais", 5);
            Animal animal2 = new Animal("Firulais", 5);
            Animal animal3 = new Animal("Rex", 3);

            // Comparación de objetos
            System.out.println("Comparación de objetos:");
            System.out.println("animal1.equals(animal2): " + animal1.equals(animal2)); // Debería ser true
            System.out.println("animal1.equals(animal3): " + animal1.equals(animal3)); // Debería ser false

            // Clonación de objetos
            System.out.println("\nClonación de objetos:");
            Animal animalClonado = (Animal) animal1.clone();
            System.out.println("Animal clonado: " + animalClonado);
            System.out.println("animal1.equals: " + animal1.equals(animalClonado)); // Debería ser true

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
