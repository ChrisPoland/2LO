public class Suma{
    public static void main(String[] args){
   if(args.length>0 && args.length<=10)
   { 
    double a=0;
        for(int i=0; i<args.length; i++)
       { 
           a=a +Double.parseDouble(args[i]); }
       System.out.format("Suma= %.2f%n", a);
   
       
   }else
        System.out.println("BLAD");
        
    }
}