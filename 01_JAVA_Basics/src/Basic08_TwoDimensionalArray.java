import java.util.Scanner;
public class Basic08_TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating an array with 3 rows and 3 columns
        int[][] student = new int[3][3];

        //getting values from user
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter value for student["+i+"]"+"["+j+"]: ");
                student[i][j] = sc.nextInt();
            }
        }

        //Printing values
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(student[i][j]);
            }
            System.out.println();
        }
    }
}
