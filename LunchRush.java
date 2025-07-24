import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LunchRush {
    public static int k=-1;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String input=br.readLine();
        int N_res=Integer.parseInt(input.split(" ")[0]);
        k =Integer.parseInt(input.split(" ")[1]);
        int max_joy=-1;
        for(int i=0;i<N_res;i++)
        {
            String input_2=br.readLine();
            int joy=-1;
            if(Integer.parseInt(input_2.split(" ")[1])>k){
                joy =joyCal(k,Integer.parseInt(input_2.split(" ")[0]),Integer.parseInt(input_2.split(" ")[1]));
            }
            else{
                joy=Integer.parseInt(input_2.split(" ")[0]);
            }

            if(i==0){
                max_joy =joy;
            }
            else{
                if(joy>max_joy){
                    max_joy =joy;
                }
            }
        }
        System.out.println(max_joy);

    }

    public static int joyCal(int k, int resJoy, int resTime){
        return resJoy-(resTime-k);

    }
}
