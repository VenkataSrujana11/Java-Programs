public class binarySearch {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int key=10;
        int start=0,end=arr.length-1;
        boolean ele=false;
        for(int i=start;i<arr.length;i++){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ele=true;
                break;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(ele){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not Found");
        }
    }
}
