package practice;

public class SumNatural {
    static int sumNtural(int n){
              if(n==0){
                return 0;
              }
              return n+sumNtural(n-1);
                 
    }
    public static void main(String[] args) {
        System.out.println(sumNtural(3));
    }
    
}
