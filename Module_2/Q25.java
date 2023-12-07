package Assignment_Tops.Module_2;

public class Q25 {
    public static void main(String[] args) {
        // handling mutiple exception with multiple catch block
        try {
            int[] a = new int[5];
            a[5] = 30 / 2;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
