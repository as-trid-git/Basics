public class Burbuja {

    public static void ordBurbuja(int lista []){

        int intercambios=0;

        for(boolean ordenado=false; !ordenado;){ //primer bucle ordena
            for(int i=0;i<lista.length-1;i++){
                if(lista[i]>lista[i+1]){  //de menor a mayor o vic
                    int variableaux=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=variableaux;
                    intercambios++;

                }

            } if(intercambios==0){
                ordenado=true;

            }
            intercambios=0;

        }

    }

    public static void main(String[] args) {
        
        int [] numeros= {5,6,2,10,1};

        ordBurbuja(numeros);

        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);

        }
    }
    
}
