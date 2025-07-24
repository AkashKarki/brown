import java.util.ArrayList;
import java.util.List;

public class IndustrialVillage {
    public static void main(String args[]){

    int[] village={0, -4, 2, -3, 0};
    List<Integer> insdustryIndex=getIndustryindex(village);
    int tree=0;

    for (int index : insdustryIndex){
        if(index==0) {
            int sum = village[0] + village[1];
            if (sum < 0) {
                sum = Math.abs(sum);
                tree = tree + sum;
            }
        }
            else if(index==village.length-1){
                int sum=village[village.length-2]+village[village.length-1];
                if(sum<0){
                    sum=Math.abs(sum);
                    tree=tree+sum;
                }
            }
            else{
                int sum1=0,sum2=0,sum3=0;
                sum1=village[index-1]+village[index];
                sum2=village[index-1]+village[index]+village[index+1];
                sum3=village[index]+village[index+1];
                int min=Math.min(sum1,sum2);
                int maxmin=Math.min(min,sum3);
                tree=tree+Math.abs(maxmin);

        }
        }
    System.out.println(tree);
    }

    public static List<Integer> getIndustryindex(int[] village){
        List<Integer> list=new ArrayList<>();
        for(int i=0; i< village.length;i++){
            if(village[i]<0){
                list.add(i);
            }
        }
        return list;
    }

}
