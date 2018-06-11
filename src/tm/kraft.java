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
public class kraft {

    double f; //Betrag

    //Noch nicht alle verwendet
    double x;
    double y;
    double z;
    

    public kraft(double f, double x, double y, double z) {
        this.set(x, y, z);
        this.f = f;
    }

    void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
