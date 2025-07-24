import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextRound {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        int count=0;
        String line1=br.readLine();
        int n=Integer.parseInt(line1.split(" ")[0]);
        int k=Integer.parseInt(line1.split(" ")[1])-1;

        String line2=br.readLine();
        String array[]=line2.split(" ");
        if(Integer.parseInt(array[k])<0){
            System.out.println("0");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if(Integer.parseInt(array[k])==0){
                    if (Integer.parseInt(array[i]) > Integer.parseInt(array[k])) {
                        count++;
                    }
                }
                    else if (Integer.parseInt(array[i]) >= Integer.parseInt(array[k])) {
                        count++;
                }
            }
            System.out.println(count);
        }


    }
}
