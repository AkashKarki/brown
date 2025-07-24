import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //List<String> list=new ArrayList<>();
        int i = 0, x = 0;

        while (i<n) {
        i++;
        if(sc.next().contains("+")){
            x++;
        }
        else{
            x--;
        }
        }
        System.out.println(x);
    }
}
