import java.util.Scanner;
public class Watermelonevenodd {
    public static void main(String[] args) {
        int weight=0;
        Scanner sc=new Scanner(System.in);
        weight=sc.nextInt();
        if(weight%2==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}
