package btap6;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];
        
        System.out.println("Nhập các phần tử của ma trận thứ nhất:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Nhập các phần tử của ma trận thứ hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Kết quả của phép cộng hai ma trận là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
