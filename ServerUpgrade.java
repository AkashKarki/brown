public class ServerUpgrade {
    public static void main(String args[]){
        int[] count ={1};
        int[] upgrade ={2};
        int[] sell = {1};
        int[] money = {1};
        int[] max = new int[count.length];

        for(int i=0;i<count.length;i++){
            int total_cost=upgrade[i]*count[i];
            if(total_cost<=money[i]){
                max[i]=count[i];
            }
            else{
               int left_cost=total_cost-money[i];
               int server_sell=left_cost/sell[i];
               if(server_sell>count[i]){
                   max[i]=0;
               }
               else if(server_sell==count[i]){
                   max[i]=count[i]-1;
               }
               else{
                   max[i]=count[i]-server_sell;
               }

            }

        }
        for (int i : max){
            System.out.print(i+" ");
        }


    }
}
