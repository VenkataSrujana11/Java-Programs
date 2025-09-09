public class clearBit {
    public static void main(String args[]){
        //clear the 3rd bit(position=2) of a number n.(n=0101)
        //(i).Bit mask:1<<i
        //(ii).AND with NOT
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notBitmask=~(bitmask);
        int newNumber=notBitmask & n;
        System.out.println(newNumber);
    }
}
