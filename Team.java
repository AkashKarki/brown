import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        List<String> list=new ArrayList<String>();

        for(int i=0;i<n;i++){
            list.add(reader.readLine());
        }
        int max=0;
        for (String num : list){
            num=num.replaceAll("\\s", "");
            int first=Integer.parseInt(num.trim().charAt(0)+"");
            int sec=Integer.parseInt(num.trim().charAt(1)+"");
            int third=Integer.parseInt(num.trim().charAt(2)+"");
            if(first+sec+third >= 2){
                max++;
            }
        }
        System.out.println(max);

    }
}