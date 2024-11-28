package org.example.corejava.exception;

// Q. Can you write multi catch block?
// Ans: Yes, We can create more than one catch block in try-catch. We can create child-specific exceptions followed by parent exceptions.
public class MultiCatchBlock {
    String x;
    public static void main(String[] args) {
        try {
            int z = 10 / 0; // This will throw an ArithmeticException
            Integer.parseInt("xyz"); // This will throw a NumberFormatException
            int a1 = (Integer) null; // This will throw a NullPointerException

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        catch (java.lang.Exception e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}
