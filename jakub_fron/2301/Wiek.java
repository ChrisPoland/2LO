public class Wiek{
    public static void main(String[] args){
        if(args.length==0)
        {
            System.out.println("Error");
        }
        else{
        int rok_ur = Integer.parseInt(args[0]);
        int wiek = 2017-rok_ur;
        if(wiek >=18)
        {
            System.out.println("Osoba pełnoletnia");
            System.out.println("Wiek:"+wiek);
        }   
        else{
            System.out.println("Osoba nieletnia");
            System.out.println("Wiek:"+wiek);
        }
        }
    }
}