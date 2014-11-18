package ordenar2vector;

public class Ordenar1Vector implements OrdenarVector {
    private String nombreMetodo;

    @Override
    public String nombreMetodo() {
        return nombreMetodo;
    }

    @Override
    public void ordena(int[] v, DatosEstadisticos de) {
        double antes=System.currentTimeMillis();
        for (int i=0;i<v.length;i++) {
            swap(v, i, getPositionOfMinimum(v, i, v.length));
        }
        double despues=System.currentTimeMillis();
        de.añadeTiempo((float)((despues-antes)/1000));
    }
    
    private static void swap(int[] v, int p1, int p2){
        int aux=v[p1];
        v[p1]=v[p2];
        v[p2]=aux;
    }
    
    private static int getPositionOfMinimum(int v[], int from, int to){
        int minPos=from;
        for (int i=from; i < to; i++) {
            if(v[i]<v[minPos])minPos=i;
        }
        return minPos;
    }
}