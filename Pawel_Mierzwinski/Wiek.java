public class Wiek{
    public static void main(String[] args){
        
        if(args.length!=0){
       int wiek=2017-Integer.parseInt(args[0]);
       System.out.println("Masz "+wiek+ "lat");
       if (wiek<18){System.out.println("Jestes niepelnoletni");}
       else{System.out.println("tak");}
        } else System.out.println("Masz problem");
       
    }
}