package ordenar2vector;

public class Ordenar2Vector implements OrdenarVector {
    private String nombreMetodo;

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
        aux[0]=v[0];
        for(int i=1;i<v.length;i++){
            if(j<i&&aux[j]<=v[i])
                j+=1;
            for(int k=i-1;i<k;k--){
                aux[k+1]=v[k];
            }
            aux[j]=v[i];
        }
        copiarVector(aux,v);
        double despues=System.currentTimeMillis();
        de.estableceTiempo((float)((despues-antes)/1000));
    }

    private void copiarVector(int[] aux, int[] v) {
        for(int i=0;i<aux.length;i++)
            v[i]=aux[i];
    }
}