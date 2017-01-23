public class Maks{
    public static void main(String[] args){
       if (args.length =! 0)
       {  
           double maks = Double.parseDouble(args[0]);
           for(int i=1; i<args.length; i++)
           {
              double a = Double.parseDouble(args[i]); 
              if(maks < a)
              {
                  maks = a;
              }
           }
           System.out.print("Twoje liczby od największej do najmniejszej: ");
           for(int j=0; j<args.length; j++)
           System.out.print(args[j]+(" , "));
           }
       else
       System.out.println("Podaj liczby");
    }
}