package ordenar2vector;

public class MediaDatosEstadisticos {
    private float dameMediaTiempos=0;
    private float dameMediaComparaciones=0;
    private float dameMediaMovimientos=0;
    private int numeroDatos=0;

    public MediaDatosEstadisticos() {
    }
    
    public void añadeDatosEstadisticos(DatosEstadisticos de){
        numeroDatos++;
        dameMediaTiempos+=de.dameTiempo();
        dameMediaMovimientos+=de.dameMovimientos();
        dameMediaComparaciones+=de.dameComparaciones();
    }
    
    public float dameMediaTiempos(){
        return dameMediaTiempos/numeroDatos;
    }
    
    public float dameMediaComparaciones(){
        return dameMediaComparaciones/numeroDatos;
    }
    
    public float dameMediaMovimientos(){
        return dameMediaMovimientos/numeroDatos;
    }
}