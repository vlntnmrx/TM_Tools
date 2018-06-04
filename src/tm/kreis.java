/*
 * Copyright (c) 2018, tomat
 * Do not redistribute without permission.
 * Thx.
 */
package tm;

import static java.lang.Math.*;

/**
 *
 * @author tomat
 */
public class kreis extends form {

    double r; //Radius

    /**
     * Nimmt Radius, x und y Koordinate entgegen
     *
     * @param r Radius
     * @param x x-Koordinate
     * @param y y-Koordinate
     */
    public kreis(double r, double x, double y) {
        this.r = r;
        this.pos_x = x;
        this.pos_y = y;

        area();
        sp();
    }

    @Override
    double area() {
        this.area = PI * r * r;
        return this.area;
    }

    @Override
    double fltm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void sp() {
        this.sp_x = this.pos_x;
        this.sp_y = this.pos_y;
    }

}
