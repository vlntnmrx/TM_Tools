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
public class kreis_halb extends form {

    double r;

    /**
     * Funktioniert wie Kreis, nur halt halb
     *
     * @param r Radius
     * @param x x-Koordinate
     * @param y y-Koordinate
     * @param cut
     */
    public kreis_halb(double r, double x, double y, boolean cut) {
        if (cut) {
            this.multi = -1;
        }
        this.r = r;
        this.pos_x = x;
        this.pos_y = y;
        this.a_max = (1 - (4 / (3 * PI)));
        update();
    }

    public kreis_halb(double r, double x, double y) {
        this.r = r;
        this.pos_x = x;
        this.pos_y = y;
        this.a_max = (1 - (4 / (3 * PI)));
        update();
    }

    @Override
    double area() {
        this.area = (PI * r * r) / 2.0;
        return this.area;
    }

    @Override
    void fltm() {
        this.i_x = ((PI / 8.0) - (8.0 / (9.0 * PI))) * Math.pow(r, 4);
        this.i_y = 0.049 * Math.pow(r, 4);
    }

    @Override
    void sp() {
        this.sp_x = this.pos_x;
        this.sp_y = this.pos_y + (4.0 * this.r) / (3.0 * PI);
    }

}
