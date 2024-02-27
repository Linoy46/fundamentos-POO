package animal;

public class Gato extends Animal {
        private int numVidas;

        // Constructor sin argumentos
        public Gato() {
            super();
            this.numVidas = 7;
        }

        // Método para obtener el número de vidas
        public int getVida() {
            return numVidas;
        }

        // Método para quitar una vida
        public void quitaVida() {
            if (numVidas > 0) {
                numVidas--;
            }
        }
        @Override
        public String toString() {
            return "Hola, soy un GATO, me llamo " + getNombre() + ", tengo " + getEdad() + " años y me quedan " + getVida() + " vidas.";
        }
    }


