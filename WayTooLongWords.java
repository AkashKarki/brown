import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        List<String> al = new ArrayList<String>();
        n=sc.nextInt();
        for(int i=0;i<n;i++ ){
            al.add(sc.next());
        }

        for(String text : al){
            if(text.length()>=10){
                char first=text.charAt(0);
                char Last=text.charAt(text.length()-1);
                int bet=text.length()-2;

            System.out.println( first+""+ bet+"" +Last );
            }
            else{
                System.out.println(text);
            }
        }


    }
}
