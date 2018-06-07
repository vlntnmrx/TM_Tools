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
public abstract class form {
    
    double pos_x; //Position vom Ursprung in x Richtung
    double pos_y; //Position vom Ursprung in y Richtung

    double sp_x; //Schwerpunktkoordinate x
    double sp_y; // '' für y

    double i_x; //Flächenträgheitsmomente
    double i_y;
    
    double w_x; //Widerstandsmomente
    double w_y;
    
    double a_max;
    
    double area;

    /**
     * Berechnet die Fläche der Form neu! Sollte vor dem Zugriff auf this.area
     * bevorzugt werden
     *
     * @return
     */
    abstract double area();

    /**
     * Berechnet das Flächenträgheitsmoment
     *
     *
     */
    abstract void fltm();

    /**
     * Aktualisiert den Schwerpunkt in x und y
     */
    abstract void sp();

    /**
     * Berechnet das Widerstandsmoment
     *
     *
     */
    void wdsm(double a_max) {
        this.w_x = this.i_x / a_max;
        this.w_y = this.i_y / a_max;
    }
    
    void update() {
        this.area();
        this.sp();
        this.fltm();
        this.wdsm(this.a_max);
    }
}
