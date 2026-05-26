import javax.crypto.spec.PSource;

import static java.lang.Integer.MIN_VALUE;

public class SecondLargest {
    public static int secondlargest(int[] arr) {
        int largest= MIN_VALUE;
        int Secondlargest= MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                Secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>Secondlargest){
                Secondlargest=arr[i];
            }

        }
        return Secondlargest;


    }
    public static void main(String[] args){
        int[] arr={10,5,25,8,20};
        System.out.println(secondlargest(arr));

    }

}
