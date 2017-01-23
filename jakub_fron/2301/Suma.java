public class Suma{
    public static void main(String[] args){
        double suma = 0;
        if(args.length==0 || args.length > 10){
            System.out.println("Error");
        }
        else{
        for(int i=0;i<args.length;i++){
            suma = suma + Double.parseDouble(args[i]);
        }
        System.out.format("%.2f%n", suma);
        }
    }
}