public class Wiek{
    public static void main(String[] args){
        if (args.length!=0){
                            int rok=Integer.parseInt(args[0]);
                            int wiek=2017-rok;
                            System.out.println("Masz "+wiek+" lat");
                            if (wiek<18) System.out.println ("Jesteś nieletni.");
                                else System.out.println("Jesteś pełnoletni.");
                            }
        else System.out.println("Błąd danych");
    }
}