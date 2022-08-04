public class Exception2_0 {
    public static void main(String[] args) {
        var a=new A();
        try {
            a.info(5);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
class A{
    public void info(int x) throws Exception {
        var ex = new Exception();
        if (x == 5) {
            throw ex;
        }
        System.out.println("Num= " + x);
    }
}