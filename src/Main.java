//herencia #6
//integrantes: samuel rodrigez, cristhian brandon moreno,christhian leonardo
import mantenimiento.Camioneta;
import mantenimiento.Turismo;

public class Main {
    public static void main(String[] args) {
        Camioneta miCamioneta = new Camioneta();
        miCamioneta.setMarca("Ford");
        miCamioneta.setModelo("Explorer");
        miCamioneta.setColor("Negro");
        miCamioneta.setCilindros(6);
        miCamioneta.setAnio(2023);
        miCamioneta.setPlacas("XYZ789");
        miCamioneta.setKlmrecorroridos(20000.0f);
        miCamioneta.setLitrosdegas(250.0f);
        miCamioneta.setAsientosCamioneta(7);
        miCamioneta.mostrarInformacion();

        Turismo miTurismo = new Turismo();
        miTurismo.setAsientosT(9);
        miTurismo.mostrarInformacion();

    }
}