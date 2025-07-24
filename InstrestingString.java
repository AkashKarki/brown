import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class InstrestingString {
public static void main(String args[]){
    String str="15:09:12";
    String str2="15:09:14";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalTime t1 = LocalTime.parse(str, formatter);
    LocalTime t2 = LocalTime.parse(str2, formatter);
    int ins=0;
    System.out.println(t1);
    while(checkValidation(t1,t2)){
        if(checktimeset(t1.toString())){
            System.out.println(t1);
            ins++;
        }
        t1=t1.plusSeconds(1);
    }
    System.out.println(ins);

}
public static boolean checkValidation(LocalTime t1, LocalTime t2){
    if (t1.isBefore(t2)) {
        return true;
    } else if (t1.isAfter(t2)) {
        return false;
    }
    else{
        return true;
    }
}

    public static boolean checktimeset(String time){
        Set<Character> uniqueDigits = new HashSet<>();
        for (char c : time.toCharArray()) {
            if (Character.isDigit(c)){
                uniqueDigits.add(c);
            if (uniqueDigits.size() > 2) {
                return false;  // More than 2 distinct digits found
            }
        }
        }
        return uniqueDigits.size() == 2;
    }
}
