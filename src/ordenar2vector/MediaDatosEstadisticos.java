package ordenar2vector;

public class MediaDatosEstadisticos {
    private float dameMediaTiempos=0;
    private float dameMediaComparaciones=0;
    private float dameMediaMovimientos=0;

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
    
    public float dameMediaComparaciones(){
        return dameMediaComparaciones;
    }
    
    public float dameMediaMovimientos(){
        return dameMediaMovimientos;
    }
}