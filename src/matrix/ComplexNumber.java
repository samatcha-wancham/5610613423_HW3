/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

public class ComplexNumber {

    private double Re;
    private double Im;

    ComplexNumber(double x, double y) {
        this.Re = x;
        this.Im = y;
    }

    ComplexNumber() {
        Re = 0;
        Im = 0;
    }

    public ComplexNumber add(ComplexNumber s, ComplexNumber t) {
        double r = s.Re + t.Re;
        double m = s.Im + t.Im;
        return new ComplexNumber(r, m);

    }

    public ComplexNumber substract(ComplexNumber s, ComplexNumber t) {
        double r = s.Re - t.Re;
        double m = s.Im - t.Im;
        return new ComplexNumber(r, m);
    }

    public ComplexNumber multiple(ComplexNumber s, ComplexNumber t) {
        //(a + bi)(c + di) = (ac - bd) + (ad +bc)i
        double re = (s.Re * t.Re) - (s.Im * t.Im);
        double im = (s.Re * t.Im) + (s.Im * t.Re);
        return new ComplexNumber(re, im);
    }

    public ComplexNumber realpart(ComplexNumber a) {
        return new ComplexNumber(Re, a.Re);
    }

    public ComplexNumber imagpart(ComplexNumber a) {
        return new ComplexNumber(Im, a.Im);
    }

    public double magnitude() {
        return Math.sqrt((Re * Re) + (Im * Im));
    }

    public boolean compare(ComplexNumber a) {
        return Math.sqrt((Re * Re) + (Im * Im)) == Math.sqrt((a.Re * a.Re) + (a.Im * a.Im));
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "(" + Re + "+" + Im + "i)";
    }
}
