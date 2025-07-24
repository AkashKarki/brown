import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Long> cases=new ArrayList<Long>();
        for(int i=0;i<n;i++){
            cases.add(sc.nextLong());
        }

        for(Long wheels : cases){
            if (wheels%4==0){
                if (wheels%6==0){
                    System.out.println(wheels/6 +" "+wheels/4);
                }
                else{
                    System.out.println(wheels/4 +" "+wheels/4);
                }
            }
            else {
                System.out.println("-1");
            }
        }
    }
}