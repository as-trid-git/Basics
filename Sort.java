import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        
        int [] arrayexample= {6,4,7,4,9};
        int [] order= arrayexample;

        for(int i=0;i<4;i++) {
            //order[i]= Integer.parseInt(args[i]);

        }
        Arrays.sort(order);

        System.out.println(Arrays.toString(order));
    }
    
}
