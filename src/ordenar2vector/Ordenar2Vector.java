package ordenar2vector;

public class Ordenar2Vector implements OrdenarVector {
    private final String nombreMetodo="Inserción Lineal";

    @Override
    public String nombreMetodo() {
        return nombreMetodo;
    }

    @Override
    public void ordena(int[] v, DatosEstadisticos de) {
        int[] aux=new int[v.length];
        int j=0;
        double antes=System.currentTimeMillis();
        // Inserción Lineal
        de.añadeMovimiento();
        aux[0]=v[0];
        for(int i=1;i<v.length;i++){
            if(j<i&&aux[j]<=v[i])
                de.añadeComparacion();
                j+=1;
            for(int k=i-1;i<j;k--){
                de.añadeMovimiento();
                aux[k+1]=v[k];
            }
            de.añadeMovimiento();
            aux[j]=v[i];
        }
        v=aux;
        //copiarVector(aux,v);
        double despues=System.currentTimeMillis();
        de.estableceTiempo((float)((despues-antes)/1000));
    }

    private void copiarVector(int[] aux, int[] v) {
        for(int i=0;i<aux.length;i++)
            v[i]=aux[i];
    }
}