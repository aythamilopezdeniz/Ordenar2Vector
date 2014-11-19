package ordenar2vector;

public class DatosEstadisticos {
    private float tiempo;
    private int numeroComparaciones;
    private int numeroMovimientos;

    public DatosEstadisticos() {
        numeroComparaciones=0;
        numeroMovimientos=0;
    }

    public void añadeTiempo(float tiempoReal){
        this.tiempo+=tiempoReal;
    }

    public void añadeComparacion() {
        this.numeroComparaciones++;
    }

    public void añadeMovimiento() {
        this.numeroMovimientos++;
    }

    public void estableceTiempo(float tiempo) {
        this.tiempo=tiempo;
    }

    public void estableceComparaciones(int comparaciones) {
        this.numeroComparaciones=comparaciones;
    }

    public void estableceMovimientos(int movimientos) {
        this.numeroMovimientos=movimientos;
    }

    public float dameTiempo() {
        return tiempo;
    }

    public int dameComparaciones() {
        return numeroComparaciones;
    }

    public int dameMovimientos() {
        return numeroMovimientos;
    }
}