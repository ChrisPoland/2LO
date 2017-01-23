public class Suma{
    public static void main(String[] args){
       if ( args.length != 0 )
        {
        double a=0; 
        for ( int i=0; i <args.length ; i++)
            { 
                a = a+Double.parseDouble(args[i]);
                 
            }
            
            System.out.format("%.2f%n", a);
            System.out.println ( " Suma wynosi " + a );
            }
            else 
            System.out.println("blad ");
    }
}