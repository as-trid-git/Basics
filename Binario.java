public class Binario {

    //para hacer una bus binaria tiene que ordenares el array

    public static void ordQuicksort(int [] array, int izq, int der){
        int j=der;
        int i=izq;
        int pivote=array[(i+j)/2];

        do{
            while(array[i]<pivote){
                i++;

            }
            while(array[j]>pivote){
                j--;

            }
            if(i<=j){
                int aux=array[i];
                array[i]=array[j];
                array[j]=aux;
                i++;
                j--;

            }

        } while(i<=j);

        if(izq<j){
            ordQuicksort(array, izq, j);

        }

        if(i<der){
            ordQuicksort(array, i, der);

        }

    }

    public static int  buscarBin(int [] array, int numbuscado){
        int izq=0;
        int der=array.length;
        boolean encontrado=false;
        int pos=-1;

        for(int i=0;!encontrado && i<array.length;i++){
            int central=array[(izq+der)/2];

            if(central<=numbuscado){
                if(central==numbuscado){
                    encontrado=true;
                    pos=(izq+der)/2;

                } else {
                    izq=(izq+der)/2;
                }

            } else{
                der= (izq+der)/2;
            }

        } 
        return pos;

    }

    public static void main(String[] args) {
        int [] numeros= {5,6,2,10,1};

        ordQuicksort(numeros,0,numeros.length-1);

        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);

        }

        System.out.println("El num 5 está en la posición: "+ buscarBin(numeros, 5));
    }
    
}
