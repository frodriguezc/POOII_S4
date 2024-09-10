package vehiculos;

public class Vehiculo extends Thread {
    private int id;

    public Vehiculo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Vehículo " + id + " está en movimiento.");
    }
}