import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String[] arr = {"13","14","15","16","17","18","19","20","21","22","23"};
        if(s.contains("AM")){
            if(s.substring(0, 2).equals("12")){
                StringBuffer str=new StringBuffer(s);
                str.replace(0, 2, "00");
                return str.substring(0, 8);
            }
            else{
                StringBuffer str=new StringBuffer(s);
                return str.substring(0, 8);
            }
        }
        else {
            StringBuffer str=new StringBuffer(s);
            String hr=str.substring(0, 2);
            int hrs=Integer.parseInt(hr);
            str.replace(0, 2, arr[hrs-1]);
            return str.substring(0, 8);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
