public class finally_exception {
    public static void main(String[] args){
        try{
            int x=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Caught");
        }
        finally {
            System.out.println("oustide Finally block");
           
            try{
                int x=5/0;
            }
            catch (Throwable e){
               System.out.println("inside finally catch");
            }
        }
    }
}
