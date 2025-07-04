import java.util.Scanner;
class secondlargest {
    public static int getSecondLargest(int[] arr) {
        // code here
         int largest=-1;
    int secondLargest=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
        }else if(arr[i]>secondLargest&&arr[i]!=largest){
            secondLargest=arr[i];
        }
    }
    return secondLargest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getSecondLargest(arr));
    }
}