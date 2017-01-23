public class Suma{
    public static void main(String[] args){
        int n=args.length;
        if(n>0 && n<=10){
                    double suma=0;
                    for(int i=0;i<n;i++)
                         suma=suma+Double.parseDouble(args[i]);
                    System.out.format("%.2f%n", suma);
            
        }
        else System.out.println("Błąd danych");
    }
}