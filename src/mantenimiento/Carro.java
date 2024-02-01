package mantenimiento;

public class Carro {
        private String marca;
        private String modelo;
        private String color;
        
        private int cilindros;
        private int anio;
        private String placas;
        private float klmrecorroridos;
        private float litrosdegas;


        public Carro() {
        }

        //atributos
        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public String getModelo() {
                return modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

      
       
        public int getCilindros() {
                return cilindros;
        }

        public void setCilindros(int cilindros) {
                this.cilindros = cilindros;
        }

        public int getAnio() {
                return anio;
        }

        public void setAnio(int anio) {
                this.anio = anio;
        }

        public String getPlacas() {
                return placas;
        }

        public void setPlacas(String placas) {
                this.placas = placas;
        }

        public float getKlmrecorroridos() {
                return klmrecorroridos;
        }

        public void setKlmrecorroridos(float klmrecorroridos) {
                this.klmrecorroridos = klmrecorroridos;
        }

        public float getLitrosdegas() {
                return litrosdegas;
        }

        public void setLitrosdegas(float litrosdegas) {
                this.litrosdegas = litrosdegas;
        }

        public void mostrarInformacion() {
                System.out.println("Marca: " + marca);
                System.out.println("Modelo: " + modelo);
                System.out.println("Color: " + color);
                System.out.println("Cilindros: " + cilindros);
                System.out.println("Año: " + anio);
                System.out.println("Placas: " + placas);
                System.out.println("Kilómetros Recorridos: " + klmrecorroridos);
                System.out.println("Litros de Gasolina: " + litrosdegas);
        }


        public void setPuertas(int i) {
        }
}


