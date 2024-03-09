package easy;
//import java.lang.Math;
class Npowers{

    static int isInPowerOfN(int n,int num,int temp){
        if(num==n){
            return 1;
        }
        else if(num>n){
            return -1;
        }    
        return isInPowerOfN(n, num*temp,temp);        
    }

    public static void main(String[] args) {
      int a=isInPowerOfN(256*4, 4,4);
    if(a==1){
        System.out.println("Yes its is In Power of ");

    }
    else{
        System.out.println("No its is In Power of ");


    }
    }

}