import java.util.*;
public class fibonaccu {
    public static void main(String args[]){
      int a,b,temp;
      a=1;
      b=2;
      temp=a+b;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<n;i++){
        if(i==1)
        System.out.print(i+" ");
        else if(i==2)
        System.out.print(i+" ");
        else{
        System.out.print(temp+" ");
        a=b;
        b=temp;
        temp=a+b;
        }
      }
      sc.close();


    }
}
