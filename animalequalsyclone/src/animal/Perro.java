package animal;

public class Perro extends Animal {
    private String raza;

    public Perro() {
        super();
        this.raza = "Desconocida";
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Hola, soy un PERRO, me llamo " + getNombre() + ", tengo " + getEdad() + " años y soy de raza " + raza + ".";
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
        if (!super.equals(obj)) {
            return false;
        }
        Perro perro = (Perro) obj;
        return raza.equals(perro.raza);
    }
}
