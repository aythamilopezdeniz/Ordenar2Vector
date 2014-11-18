package ordenar2vector;

public class CalculadorEstadisticas {
    public static DatosEstadisticos estadisticaOrdenaVector(OrdenarVector m, 
            int tam_vector, boolean modo){
        DatosEstadisticos datosEstadisticos=new DatosEstadisticos();
        int[] vec=GeneraCaso.generaVector(tam_vector, modo);
        CompruebaCaso.compruebaVector(vec, tam_vector);
        m.ordena(vec, datosEstadisticos);
        return datosEstadisticos;
    }
    
    public static DatosEstadisticos estadisticaOrdenaVectorAleatorio(
            OrdenarVector m, int tam_vector){
        return null;
    }
    
    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(
            OrdenarVector m, int[] tam_vectores){
        return null;
    }
    
    public static DatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(
            OrdenarVector m, int[] tam_vectores){
        return null;
    }
}