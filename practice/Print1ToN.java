package practice;

public class Print1ToN {

    static void printnatural(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printnatural(n-1);
    }
   public static void main(String[] args) {
         printnatural(10);
   }

}
