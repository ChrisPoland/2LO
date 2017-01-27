
// Importowanie biblioteki potrzebnej do losowania liczb
import java.util.Random;

public class Losowe{
    public static void main(String[] args){
      
            
             // Stworzenie obiektu klasy Random, który posłuży do loswania liczb
                 Random rand = new Random();
        
        
             // losowanie liczb całkowitych z zak.[p,q]: rand.nextInt(q-p+1)+p
             //losowanie liczby z zakresu[0,10]
                System.out.println( rand.nextInt(11)+0 );
                
       
    }
}