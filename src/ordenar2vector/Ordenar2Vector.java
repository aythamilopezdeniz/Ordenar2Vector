package ordenar2vector;

public class Ordenar2Vector implements OrdenarVector {
    private final String nombreMetodo="Método de Shell";

    @Override
    public String nombreMetodo() {
        return nombreMetodo;
    }

    @Override
    public void ordena(int[] v, DatosEstadisticos de) {
        int j=0;
        double antes=System.currentTimeMillis();
        de.añadeMovimiento();
        int increment=v.length/2;
	while(increment>0){
            for(int i=increment;i<v.length; i++) {
                j=i;
                de.añadeMovimiento();
                int temp=v[i];
                de.añadeComparacion();
                    while(j>=increment&&v[j-increment]>temp) {
                        de.dameComparaciones();
                        de.añadeMovimiento();
                        v[j]=v[j-increment];
                        j=j-increment;
                    }
                    de.añadeMovimiento();
                    v[j]=temp;
		}
            de.añadeComparacion();
                if(increment==2){
                    increment=1;
		}else{
                    increment*=(5.0/11);
		}
	}
        double despues=System.currentTimeMillis();
        de.estableceTiempo((float)((despues-antes)/1000f));
    }
}