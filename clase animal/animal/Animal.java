package animal;

public class Animal {
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
            System.out.println( "Yo me llamo " + nombre + " y tengo " + edad + " años");
            return null;
        }
    }


