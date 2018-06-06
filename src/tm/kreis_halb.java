/*
 * Copyright (c) 2018, tomat
 * Do not redistribute without permission.
 * Thx.
 */
package tm;

import static java.lang.Math.*;

/**
 * Halbkreis, nach oben gewölbt und horizontal ausgerichtet TODO: Flexibler
 * machen
 *
 * @author tomat
 */
public class kreis_halb extends kreis {

    public kreis_halb(double r, double x, double y) {
        super(r, x, y);
    }

    @Override
    double area() {
        this.area = (PI * r * r) / 2;
        return this.area;
    }

    @Override
    void fltm() {
        super.fltm(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void sp() {
        this.sp_x = this.pos_x;
        this.sp_y = (4 * this.r) / (3 * PI);
    }

}
