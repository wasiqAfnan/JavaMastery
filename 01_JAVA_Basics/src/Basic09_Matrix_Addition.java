import java.util.Scanner;
public class Basic09_Matrix_Addition {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];
        Scanner sc = new Scanner(System.in);

        //getting values from user in matrix1
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter value for matrix1["+i+"]"+"["+j+"]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        //getting values from user in matrix2
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter value for matrix2["+i+"]"+"["+j+"]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // adding 2 matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //Printing values
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
