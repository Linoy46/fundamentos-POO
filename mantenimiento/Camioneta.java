package mantenimiento;

public class Camioneta extends Carro {
    private int asientosCamioneta;

    public Camioneta() {
        // Llamada al constructor de la clase
        super();
    }

    public int getAsientosCamioneta() {
        return asientosCamioneta;
    }

    public void setAsientosCamioneta(int asientosCamioneta) {
        this.asientosCamioneta = asientosCamioneta;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de asientos (Camioneta): " + asientosCamioneta);

    }



}
