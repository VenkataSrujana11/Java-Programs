public class methodoverloading{
    public void add(int a,int b)
    {
        int r=a+b;
        System.out.println(r);

    }
    public void add(float x,int y)
    {
        float r=x+y;
        System.out.println(r);
        
    }
    public void add()
    {
        System.out.println("in add method");
    }
    public static void main(String args[])
    {
        methodoverloading m=new methodoverloading();
        m.add();
        m.add(8,9);
        m.add(9.8f,7);
    }
    
}