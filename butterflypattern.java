public class butterflypattern {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            //overall 1st part
            //1st part
            for(int j=1;j<=i;j++){
                //1st part
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //overall 1st part
            //1st part
            for(int j=1;j<=i;j++){
                //1st part
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
