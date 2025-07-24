import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Serverutilization {
    public static void main(String args[]) throws ParseException {
        List<String> servertime=new ArrayList<>();
        servertime.add("2023-11-04 16:29:47");
        servertime.add("2023-11-05 01:49:47");
        servertime.add("2023-11-25 01:37:08");
        servertime.add("2023-11-25 03:50:08");
        servertime.add("2023-11-13 03:05:31");
        servertime.add("2023-11-13 11:10:31");
        servertime.add("2023-11-29 15:11:17");
        servertime.add("2023-11-29 15:42:17");
        servertime.add("2023-11-20 00:31:44");
        servertime.add("2023-11-20 07:03:44");
        servertime.add("2023-11-20 00:27:11");
        servertime.add("2023-11-20 01:41:11");
        servertime.add("2023-11-04 23:16:48");
        servertime.add("2023-11-05 01:15:48");
        servertime.add("2023-11-30 15:09:18");
        servertime.add("2023-11-30 20:48:18");
        servertime.add("2023-11-25 21:09:06");
        servertime.add("2023-11-26 04:58:06");
        servertime.add("2023-11-16 19:42:22");
        servertime.add("2023-11-16 21:08:22");


        //SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long total=0;

        for(int i=0;i<servertime.size();i=i+2){

            Date start=format.parse(servertime.get(i));
            Date end=format.parse(servertime.get(i+1));

            long diff = end.getTime() - start.getTime();
            total=total+diff;

        }
        long days= TimeUnit.MILLISECONDS.toDays(total);
        System.out.println(days);
    }
}
