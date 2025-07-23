public class linearSearch {
    public static void main(String args[]){
        int arr[]={11,33,24,53,76,90};
        int search=76;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Element exists");
                return;
            }
        }
    }
}
