import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int c=0;
        if(m%n!=0){
           System.out.println(-1);
        }
        else{
          int j=m/n;
          while(j%2==0){
              j/=2;
              c++;
          }
          while(j%3==0){
              j/=3;
              c++;
          }
        System.out.println(c);
        }
    }
}