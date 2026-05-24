public class CountEvens {
    public static void main(String[] args){
        int arr[]={2,4,3,5,7};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                    count++;
            }
        }
        System.out.println("the count of even numbers is  "+count);


    }
}
