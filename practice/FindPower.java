package practice;

public class FindPower {
    static int powerOfN(int gn,int p){
           if(p==0){
            return 1;
           }
           return gn*powerOfN(gn, p-1);
    }
}
