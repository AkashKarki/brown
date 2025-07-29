public class carBridge {
    public static void main(String []args){
        int []a={5, 3, 8, 1, 8, 7, 7, 6};
        int U=9;
        boolean f=false;
        for(int car :a){
            if(car<=U){
                f=true;
            }

        }
        int car_return=0;
        int index_1=0, index_2=1;
        while(index_2<a.length && f){
            if(a[index_1]+a[index_2]<=U){
                index_1=index_2;
                index_2++;

            } else  {
                index_2++;
                car_return++;
            }

        }
        System.out.println(car_return);


    }
}
