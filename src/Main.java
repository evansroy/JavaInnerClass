class OuterClass {
    int x = 10;

    class InnnerClass{
        public int myInnerMethod(){
            return x;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnnerClass myInner = myOuter.new InnnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}