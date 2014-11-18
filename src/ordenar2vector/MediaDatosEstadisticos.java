package ordenar2vector;

public class MediaDatosEstadisticos {
    private float dameMediaTiempos;
    private int dameMediaComparaciones;
    private int dameMediaMovimientos;

    public MediaDatosEstadisticos() {
    }
    
    public void añadeDatosEstadisticos(DatosEstadisticos de){
        dameMediaTiempos+=de.dameTiempo();
        dameMediaMovimientos+=de.dameMovimientos();
        dameMediaComparaciones+=de.dameComparaciones();
    }
    
    public float dameMediaTiempos(){
        return dameMediaTiempos;
    }
    
    public int dameMediaComparaciones(){
        return dameMediaComparaciones;
    }
    
    public int dameMediaMovimientos(){
        return dameMediaMovimientos;
    }
}