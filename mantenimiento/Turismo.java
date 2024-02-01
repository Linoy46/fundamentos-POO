package mantenimiento;

public class Turismo extends Carro {

    private int asientosT;

    public Turismo() {
        // Llamada al constructor de la clase carro
        super();
    }

    public int getAsientosT() {
        return asientosT;
    }

    public void setAsientosT(int asientosT) {
        this.asientosT = asientosT;
    }

    // Método para mostrar información
    public void mostrarInformacion() {

        System.out.println("Número de asientos (Turismo): " + asientosT);

    }



}
