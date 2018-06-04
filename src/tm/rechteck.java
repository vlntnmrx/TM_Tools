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

    double a; //Länge in x Richtung
    double b; //Länge in y Richtung

    /**
     * Nimmt Länge in x (a) und y (b) Richtung sowie x und y Koordinate des
     * linken unteren Punktes entgegen
     *
     * @param a
     * @param b
     * @param x
     * @param y
     */
    public rechteck(double a, double b, double x, double y) {
        this.pos_x = x;
        this.pos_y = y;
        this.a = a;
        this.b = b;

        area();
        sp();
    }

    @Override
    double area() {
        area = a * b;
        return area;
    }

    @Override
    void fltm() {

    }

    @Override
    void sp() {
        this.sp_x = this.pos_x + (this.a / 2);
        this.sp_y = this.pos_y + (this.b / 2);
    }

}
