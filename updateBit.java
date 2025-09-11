import java.util.Scanner;
public class updateBit {
    public static void main(String args[]){
        //Update the 2nd bit(position=1) pf a number n to 1(n=0101)
        //For 0(clear operation)
        //(i)Bit mask:1<<i
        //(ii)Operation:AND with NOT

        //For 1(set operation)
        //(i)Bit mask:1<<i
        //(ii)Operation:OR
        Scanner sc=new Scanner(System.in);
        int n=5;
        int pos=1;
        int oper=sc.nextInt();//update bit to 1 else upadte bit to 0
        int bitmask=1<<pos;
        //Set oper
        if(oper==1){
            int newNumber=bitmask |n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitmask=~(bitmask);
            int newNumber=newBitmask & n;
            System.out.println(newNumber);
        }
    }
}
