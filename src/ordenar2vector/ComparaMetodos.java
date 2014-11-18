package ordenar2vector;

public class ComparaMetodos {

    public static void main(String[] args) {
        int[] v=new int[]{1000, 2000, 4000, 8000, 16000, 32000};
        DatosEstadisticos vec1[],vec2[];
        System.out.println("            Vector en orden inversoTiempo   Vector en orden aleatorioTiempo");
        vec1 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar1Vector(), v);
        vec2 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar1Vector(), v);
        for(int i=0;i<v.length;i++) {
            System.out.printf("%6d         %15f             %15f\n", 
                    v[i], vec1[i].dameTiempo(), vec2[i].dameTiempo());
        }    }
}