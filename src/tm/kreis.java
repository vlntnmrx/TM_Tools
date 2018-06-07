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
        this.a_max = 2;

        update();
    }

    @Override
    double area() {
        this.area = PI * r * r;
        return this.area;
    }

    @Override
    void fltm() {
        this.i_x = (PI * Math.pow(r * 2.0, 4)) / 64.0;
        this.i_y = (PI * Math.pow(r * 2.0, 4)) / 64.0;
    }

    @Override
    void sp() {
        this.sp_x = this.pos_x;
        this.sp_y = this.pos_y;
    }

}
