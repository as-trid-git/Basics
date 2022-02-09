import javax.swing.JOptionPane;

public class Vocales {

    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog(null, "Escribe una cadena: ", 
        "Inserción", JOptionPane.ERROR_MESSAGE);

        texto= texto.toLowerCase();

        char [] vocales={'a','e','i','o','u'};

        char palabra;
        int contador=0;
        boolean esVocal;

        for(int i=0;i<texto.length();i++){

            palabra=texto.charAt(i);
            esVocal=false;

            for(int j=0;j<vocales.length && !esVocal;j++){

                if(vocales[j]==palabra){
                    contador++;
                    esVocal=true;

                }

            }

        }

        JOptionPane.showMessageDialog(null, "La frase tiene: " + contador + " vocales",
         "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
