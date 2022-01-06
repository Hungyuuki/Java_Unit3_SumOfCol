package com.codegym;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận: ");
        int rowNo = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int colNo = scanner.nextInt();
        int[][] matrix = new int[rowNo][colNo];


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        System.out.println("In ma trận ra màn hình: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println("");
        }
        System.out.println("Tính tổng cột thứ: ");
        int index = scanner.nextInt();
        if (index > matrix.length) {
            System.out.println("Không có cột thứ " + index);
        } else {
            int total = 0;
                for (int row = 0; row < matrix.length; row++)
                    total += matrix[row][index];
            System.out.println("Sum for column " + index + " is "
                    + total);
        }
    }
}