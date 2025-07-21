class Reverse{
    public int reverse(int x) {
        double temp=0,rem;
        while(x!=0)
        {
            rem=x%10;
            temp=temp*10+rem;
            x=x/10;
        }
        return(temp<Integer.MIN_VALUE||temp>Integer.MAX_VALUE)?0:(int)temp;
    }
}
