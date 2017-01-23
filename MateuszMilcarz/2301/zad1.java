public class zad1{
    public static void main(String[] args){
        if(args.length !=0){
        int lat=Integer.parseInt(args[0]);
        int a;
        a=2017 - lat;
        if(a>=18){
            System.out.println("Masz "+a+" jesteś pełnoletni");
        }
        else{
            System.out.println("Nie kupisz browara");
        }
        }else
        System.out.println("błąd");
        
    }
}