public class solidrhombus {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                //spaces
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                //stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
