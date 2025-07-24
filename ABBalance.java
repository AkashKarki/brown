import java.util.*;

public class ABBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        for (String str : list) {
            int ab = -1, ba = -1;
            if(str.length()<2){
                System.out.println(str);
            }
            else {
                ab = countab(str);
                ba = countba(str);
                if(ab==ba){
                    System.out.println(str);
                }
                else{
                    int flag=0;
                    StringBuffer s = new StringBuffer(str);
                    for(int i=0;i<str.length();i++){
                        StringBuffer temp1=s.replace(i,i+1,"a");
                        StringBuffer temp2=s.replace(i,i+1,"b");
                        int newabtemp1 = countab(temp1.toString());
                        int newbatemp1 = countba(temp1.toString());

                        int newabtemp2 = countab(temp2.toString());
                        int newbatemp2 = countba(temp2.toString());
                        if (newabtemp1==newbatemp1){
                            System.out.println(temp1);
                            break;
                        }
                        else if(newabtemp2==newbatemp2){
                            System.out.println(temp2);
                            break;
                        }
                    }
                }
            }

        }
    }

    public static int countab(String str) {
        int count=0;
        for (int i = 0; i < str.length() - 1; i++) {
            String substring = str.substring(i, i + 2);
            if(substring.equals("ab")){
                count++;
            }
        }
        return count;
    }

    public static int countba(String str) {
        int count=0;
        for (int i = 0; i < str.length() - 1; i++) {
            String substring = str.substring(i, i + 2);
            if(substring.equals("ba")){
                count++;
            }
        }
        return count;

    }
}