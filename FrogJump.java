public class FrogJump {
    public static void main(String []args){
        int []a={3,5,6,4,3,5,7,1,9,2,6,10,4};
        int max=0;
        for(int i=0;i<a.length;i++){
            int left=calDistanceLeft(i,a);
            int right=calDistanceRight(i,a);
            int distance = (right-left)+1;
            max=Math.max(max,distance);
        }
        System.out.println(max);
    }

    public static int calDistanceLeft(int index, int []a) {
        if(index-1<0){
            return index;
        }
        else if(a[index-1]>=a[index]){
            return calDistanceLeft(index-1,a);
        }
        return index;
        }

    public static int calDistanceRight(int index, int []a) {
        if(index+1>=a.length){
            return index;
        }
        else if(a[index+1]>=a[index]){
            return calDistanceRight(index+1,a);
        }
        return index;
    }
}
