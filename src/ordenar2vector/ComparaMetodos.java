package ordenar2vector;

public class ComparaMetodos {

    public static void main(String[] args) {
        int[] v=new int[]{1000, 2000, 4000, 8000, 16000, 32000};
        MediaDatosEstadisticos vec1[], vec3[];
        DatosEstadisticos vec2[], vec4[];
        System.out.println("                                    Ordenar1Vector");
        System.out.println("            Vector en orden inversoTiempo   Vector en orden aleatorioTiempo");
        vec1 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar1Vector(), v);
        vec2 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar1Vector(), v);
        vec3 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar2Vector(), v);
        vec4 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar2Vector(), v);
        for(int i=0;i<v.length;i++) {
            System.out.printf("%6d         %15f             %15f             %15f\n", 
                    v[i], vec1[i].dameMediaTiempos(), vec1[i].dameMediaComparaciones(), 
                    vec1[i].dameMediaMovimientos());
        }
        System.out.println();
        for (int i=0;i<v.length;i++) {
            System.out.printf("%6d         %15f       %15d       %15d\n", 
                    v[i], vec2[i].dameTiempo(), vec2[i].dameComparaciones(), 
                    vec2[i].dameMovimientos());
        }
        System.out.println();
        System.out.println("                                    Ordenar2Vector");
        for (int i=0;i<v.length;i++) {
            System.out.printf("%6d         %15f       %15f       %15f\n", 
                    v[i], vec3[i].dameMediaTiempos(), vec3[i].dameMediaComparaciones(), 
                    vec3[i].dameMediaMovimientos());
        }
        System.out.println();
        for (int i=0;i<v.length;i++) {
            System.out.printf("%6d         %15f       %15d       %15d\n", 
                    v[i], vec4[i].dameTiempo(), vec4[i].dameComparaciones(), 
                    vec4[i].dameMovimientos());
        }
    }
}