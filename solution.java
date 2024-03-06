// import java.util.*;

//  class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         ArrayList<Integer> list=new ArrayList<>(n);        
//         for(int i=0;i<n;i++)
//         {
//              list.add(sc.nextInt());
            
//         }
//         int qu=sc.nextInt();
//         for(int i=0;i<qu;i++){
//             String str;
//             str=sc.nextLine();
//             String s2="Insert";
//             if(str.equals(s2)){
//                int x=sc.nextInt();
//                int y=sc.nextInt();
//                list.add(x,y);
               
//                 }
//              else{
//                 int x=sc.nextInt();
//                 list.remove(x);
//            }
//         }
//         // print
//         for(Integer i:list )
//         {
//             System.out.print(i+" ");
//         }
//     }
// }