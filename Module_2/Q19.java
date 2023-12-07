package Assignment_Tops.Module_2;

public class Q19 {
    public static void main(String[] args) {
        // calling factorial function
        Factorial(10);
    }

    static public void Factorial(int n) {
        int result = 1;
        // login here is result*i(n=5) => 1*1 > 1*2 > 2*3 > 6*4 > 24*5 =120
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        System.out.println(result);
    }

}
