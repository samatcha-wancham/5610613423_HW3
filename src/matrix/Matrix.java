/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Matrix {

   
        
    
    protected int SIZE;
    protected int member[][];

    
    public Matrix() {
        SIZE = 2;
        member = new int[SIZE][SIZE];
    }

    public Matrix(int vSIZE) {
        SIZE = vSIZE;
        member = new int[SIZE][SIZE];
    }

    
    public void setMemberAt(int i, int j, int val) {
        this.member[i][j] = val;
    }

   
    public void scanInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for matrix's member < "+SIZE+"*"+SIZE+" >");
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                this.member[i][j] = sc.nextInt();
            }
        }
    }

    
    public static Matrix add(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.member[i][j] = a.member[i][j] + b.member[i][j];
            }
        }
        return c;
    }

    
    public static Matrix substract(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.member[i][j] = a.member[i][j] - b.member[i][j];
            }
        }
        return c;
    }

   
    public static Matrix multiplication(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int k = 0; k < a.SIZE; k++) {
                    c.member[i][j] += a.member[i][k] * b.member[k][j];
                }
            }
        }
        return c;
    }

    
    @Override
    public String toString() {
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                System.out.print(this.member[i][j] + " ");
            }
            System.out.println("");
        }
        return "";
    }
    }
    

