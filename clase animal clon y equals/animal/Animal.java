package animal;

public class Animal implements Cloneable {
    private String nombre;
    private int edad;

    public Animal() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Yo me llamo " + nombre + " y tengo " + edad + " años";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return edad == animal.edad && nombre.equals(animal.nombre);
    }
}


