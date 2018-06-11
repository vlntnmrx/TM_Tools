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
public class rechteck extends form {

    double b; //Länge in x Richtung (Breite)
    double h; //Länge in y Richtung (Höhe)

    /**
     * Nimmt Länge in x (breite) und y (höhe) Richtung sowie x und y Koordinate
     * des linken unteren Punktes entgegen
     *
     * @param b
     * @param h
     * @param x
     * @param y
     */
    public rechteck(double b, double h, double x, double y) {
        this.pos_x = x;
        this.pos_y = y;
        this.b = b;
        this.h = h;
        this.a_max = 0.5;
        
        update();
    }

    @Override
    double area() {
        this.area = h * b;
        return this.area;
    }

    @Override
    void fltm() {
        this.i_x = (b * h * h * h) / 12.0;
        this.i_y = (h * b * b * b) / 12.0;
    }

    @Override
    void sp() {
        this.sp_x = this.pos_x + (this.b / 2.0);
        this.sp_y = this.pos_y + (this.h / 2.0);
    }

}
