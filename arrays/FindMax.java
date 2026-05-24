public class FindMax {
    public static void main(String[] args) {

        int[] arr=new int[] {1,2,23,43,45};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("max number "+max);

    }
}
