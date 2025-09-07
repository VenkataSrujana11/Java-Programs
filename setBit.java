public class setBit {
    //Set the 2nd bit(position=1) of a number n(n=0101)
    //(i).Bit Mask:1<<i
    //(ii).Operation:OR
    public static void main(String args[]){
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        int newNumber=bitmask | n;
        System.out.println(newNumber);
    }
}
