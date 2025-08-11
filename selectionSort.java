public class selectionSort {
    public static void main(String args[]){
        int arr[]={5,3,24,7,6,12};
        int minIndex=0;
        System.out.println("Before Sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
        for(int i=0;i<arr.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
