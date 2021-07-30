
package Array;

public class TwoDimensionalArray {
    
    public static void main(String[] args) {
        /*
        int matrixA[][] = new int [2][3];
        
        matrixA[0][0] =7;
        matrixA[1][2] =8;
        
        matrixA[1][0] = matrixA[0][0] + matrixA[1][2];
        
        System.out.println("Ans = "+matrixA[1][0]);
        */
        int x[][] = {{11,12,13},
                     {21,22,23}};
        int ave,sum=0;
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + x[i][j];
                System.out.print(" "+x[i][j]);
                
            }
            System.out.println();
        }
        System.out.println("Value of ave = "+sum/6);
    }
    
}
