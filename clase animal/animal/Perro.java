package animal;

public class Perro extends Animal {
        private String raza;

        // Constructor sin argumentos
        public Perro() {
            super();
            this.raza = "Desconocido";
        }

        // Getter y setter para la raza
        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        @Override
        public String toString() {
            System.out.println("Hola soy un perro, me llamo " + getNombre() + ", tengo " + getEdad() + " años y soy un " + raza + ".");
            return null;
        }
    }




