import java.util.Arrays;

public class PotHoleFix {
    public static void main(String args[]) {
        String str = "x.x.xxx...x";
        int budget = 14;
        int ans = 0;
        int arr[] = getHoleCount(str);
        if (Arrays.stream(arr).sum()<0) {
            System.out.println("0");

        } else{
            for (int i = arr.length - 1; i >= 0 && budget > 0; i--) {
                if (arr[i] > 0) {
                    int loop = arr[i];
                    while (loop > 0) {
                        if (budget > i + 1) {
                            ans = ans + i;
                            budget = budget - (i + 1);
                            loop--;
                        } else {
                            ans = ans+ (budget -1);
                            budget = budget - (budget -1);
                            break;
                        }

                    }

                }
            }
    }
        System.out.println(ans);
    }

    public static int[] getHoleCount(String str){
        int holecount[] =new int[str.length()+1];
        int hc=0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='x'){
                hc++;

            }
            else if(hc>0){
                holecount[hc]++;
                hc=0;

            }
        }
        if(hc>0){
            holecount[hc]++;

        }
        return holecount;
    }
}
