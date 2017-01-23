public class Wiek{
    public static void main(String[] args){
   if(args.length>0){ int rok=Integer.parseInt(args[0]);
    int c;
    c= 2017-rok;
        if (c<18)
        System.out.println("Masz "+c+" lat, jesteś nieletni");
        else 
        System.out.println("Masz "+c+" lat, jesteś pełnoletni");}
        else
        System.out.println("BLAD");
        
    }
}