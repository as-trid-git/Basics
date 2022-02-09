//import java.util.Scanner;
public class Palindrom{

    public static boolean Ejemplo(String Palabra) {

        Palabra= Palabra.toLowerCase();
        Palabra= Palabra.replaceAll(" ","");
        Palabra= Palabra.replaceAll("á","a");
        Palabra= Palabra.replaceAll("é","e");
        Palabra= Palabra.replaceAll("í","i");
        Palabra= Palabra.replaceAll("ó","o");
        Palabra= Palabra.replaceAll("ú","u ");
          
        //return Palindromo(sinespacios);  //Verifica si es un palindromo
        for (int i=0;i<Palabra.length();i++) {
            if(Palabra.charAt(i)!= Palabra.charAt(Palabra.length()-i-1)) {
                return false;
            } 
        }return true;
    }
    public static void main(String[] args) {

        //Scanner lector= new Scanner(System.in); //input

        String Palabra= "Reconocer";  // se cambia a vacio

        //System.out.println("Ingrese una palabra");

        if (Ejemplo(Palabra) == true) {
            System.out.println("El ejemplo: "+ Palabra + " es palindromo ");

        } else{
            System.out.println("El ejemplo: "+ Palabra + " no es un palindromo ");
        }

        
    }

}