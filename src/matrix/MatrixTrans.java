/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix;

/**
 *
 * @author Administrator
 */
public class MatrixTrans extends Matrix{
    
    // Add transpose method 
    public Matrix Transpose(){
        Matrix c = new Matrix();
        for (int i = 0; i < super.SIZE; i++) {
            for (int j = 0; j < super.SIZE; j++) {
                c.member[i][j] = this.member[j][i];
            }
        }
        return c;
    }
}