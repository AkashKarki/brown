import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeItIncreasing {

    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int NoTcs=Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Object>> list= new  ArrayList<ArrayList<Object>>();

        for(int i=0;i<NoTcs;i++){
            String n=br.readLine();
            String input=br.readLine();

            List<String> inputList = new ArrayList<>();
            inputList= Arrays.asList(input.split(" "));
            





        }

    }

}
