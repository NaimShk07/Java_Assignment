package Assignment_Tops.Module_1;

public class N06 {
    public static void main(String[] args) {

        //display pattern like right angle triangle with number increase by number
        int temp=1;
        // value of variable in loop will reset when loop end that why another outside variable is used in this program
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}
