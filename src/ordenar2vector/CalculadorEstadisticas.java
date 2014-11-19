package ordenar2vector;

public class CalculadorEstadisticas {
    public static DatosEstadisticos estadisticaOrdenaVector(OrdenarVector m, 
            int tam_vector, boolean modo){
        DatosEstadisticos datosEstadisticos=new DatosEstadisticos();
        int[] vec=GeneraCaso.generaVector(tam_vector, modo);
        m.ordena(vec, datosEstadisticos);
        CompruebaCaso.compruebaVector(vec, tam_vector);
        return datosEstadisticos;
    }
    
    public static MediaDatosEstadisticos estadisticaOrdenaVectorAleatorio(
            OrdenarVector m, int tam_vector){
        int[] v=new int[10];
        MediaDatosEstadisticos mediaDatosEstadisticos=new MediaDatosEstadisticos();
        for(int i=0;i<v.length;i++){
            DatosEstadisticos datosEstadisticos=new DatosEstadisticos();
            v=GeneraCaso.generaVector(tam_vector, true);
            m.ordena(v, datosEstadisticos);
            CompruebaCaso.compruebaVector(v, tam_vector);
            mediaDatosEstadisticos.añadeDatosEstadisticos(datosEstadisticos);
        }
        return mediaDatosEstadisticos;
    }
    
    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(
            OrdenarVector m, int[] tam_vectores){
        return null;
    }
    
    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(
            OrdenarVector m, int[] tam_vectores){
        return null;
    }
}