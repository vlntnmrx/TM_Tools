/*
 * Copyright (c) 2018, tomat
 * Do not redistribute without permission.
 * Thx.
 */
package tm;

/**
 *
 * @author tomat
 */
public class dreieck extends form {

    double g;
    double h;
    double alpha;

    public dreieck(double g, double h, double alpha) {
        this.g = g;
        this.h = h;
        this.alpha = alpha;
    }

    @Override
    double area() {
        this.area = (g * h) / 2;
        return area;
    }

    @Override
    void fltm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void sp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
