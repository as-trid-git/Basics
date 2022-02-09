import java.util.Arrays;

public class CadenaQS {

    public static void ordQuicksort(String [] array, int izq, int der){
        int j=der;
        int i=izq;
        int pivote=(i+j)/2;

        do{
            while(array[i].compareToIgnoreCase(array[pivote])<0){
                i++;

            }
            while(array[j].compareToIgnoreCase(array[pivote])>0){
                j--;

            }
            if(i<=j){
                String aux=array[i];
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

    public static void ordQuicksortinverso(String [] array, int izq, int der){
        int j=der;
        int i=izq;
        int pivote=(i+j)/2;

        do{
            while(array[i].compareToIgnoreCase(array[pivote])>0){
                i++;

            }
            while(array[j].compareToIgnoreCase(array[pivote])<0){
                j--;

            }
            if(i<=j){
                String aux=array[i];
                array[i]=array[j];
                array[j]=aux;
                i++;
                j--;

            }

        } while(i<=j);

        if(izq<j){
            ordQuicksortinverso(array, izq, j);

        }

        if(i<der){
            ordQuicksortinverso(array, i, der);

        }

    } 

    public static void main(String[] args) {
        String [] cadenas= {"fernando","Pepe","Alejandro","alfredo","soledad"};

      
       /* int [] order= new int [cadenas.length];

        for(int i=0;i<cadenas.length;i++) {
            order[i]= Integer.parseInt(cadenas[i]);

        }
        Arrays.sort(order);

        System.out.println(Arrays.toString(order)); */

        ordQuicksort(cadenas,0,cadenas.length-1);

        System.out.println("Orden alfabético ascendente: ");

        for(int i=0;i<cadenas.length;i++){
            System.out.println(cadenas[i]);

        }

        System.out.println("");

        ordQuicksortinverso(cadenas,0,cadenas.length-1);

        System.out.println("Orden alfabético descendente: ");

        for(int i=0;i<cadenas.length;i++){
            System.out.println(cadenas[i]);

        }

       /* int aux []= new int[cadenas.length];

        System.out.println("Orden alfabético descendente: ");

        for(int i=cadenas.length-1, j=0;i>=0;i--, j++){ //i posicion 4 j posicion 0
            aux[j]=Integer.parseInt(cadenas[i]);
            System.out.println(aux[j]);
        } */



    }
    
}
