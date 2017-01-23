public class wiek{
    public static void main(String[] args){
        if (args.length !=0)
        {
            int a = Integer.parseInt(args[0]);
            a=2017-a;
            if(a>=18)
            {
               System.out.println("Masz "+a+" lat. Jesteś pełnoletni."); 
            }
            if(a<18)
            {
                System.out.println("Masz "+a+" lat. Jesteś nieletni.");
            }
        }
        else
        {
            System.out.println("Podaj swój rok urodzenia");
        }
        
    }
}