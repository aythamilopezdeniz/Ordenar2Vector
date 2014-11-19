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
            mediaDatosEstadisticos.añadeDatosEstadisticos(
                    estadisticaOrdenaVector(m, tam_vector, true));
        }
        return mediaDatosEstadisticos;
    }
    
    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(
            OrdenarVector m, int[] tam_vectores){
        DatosEstadisticos[] datosEstadisticos=new DatosEstadisticos[6];
        for(int i=0;i<datosEstadisticos.length;i++){
            datosEstadisticos[i]=estadisticaOrdenaVector(m, tam_vectores[i], false);
        }
        return datosEstadisticos;
    }
    
    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(
            OrdenarVector m, int[] tam_vectores){
        MediaDatosEstadisticos[] mediaDatosEstadisticos=new MediaDatosEstadisticos[6];
        for(int i=0;i<mediaDatosEstadisticos.length; i++){
            mediaDatosEstadisticos[i]=estadisticaOrdenaVectorAleatorio(m, tam_vectores[i]);
        }
        return mediaDatosEstadisticos;
    }
}