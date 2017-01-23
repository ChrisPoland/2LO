public class Suma{
    public static void main(String[] args){
        if (args.length != 0 && args.length <= 10)
        {
            double suma = 0;
            for (int i=0; i<args.length; i++)
            {
               double a = Double.parseDouble(args[i]); 
               suma = suma + a;
            }
            System.out.print("Twoja suma wynosi: ");
            System.out.format("%.2f%n", suma);
        }
        else
        System.out.println("Błąd danych - podaj od 1 do 10 liczb");
    }
}