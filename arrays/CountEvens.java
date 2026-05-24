public class CountEvens {
    public static void main(String[] args){
        int arr[]={};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0 && arr.length>0){
                    count++;
            }

        }
        System.out.println("the count of even numbers is  "+count);


    }
}
