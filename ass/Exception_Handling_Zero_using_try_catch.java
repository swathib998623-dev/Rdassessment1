public class Exception_Handling_Zero_using_try_catch {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        int result=0;

        try {
            result = a/b;// risky code//
            System.out.println("result:"+ result);
        }catch (ArithmeticException e){ // handling exception //
            System.out.println("Error : division by zero is not allowed!");
        }
        System.out.println("Program continues after exception handling:)");
    }
}
