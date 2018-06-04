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

    double area;

    /**
     * Berechnet die Fläche der Form neu!
     * Sollte vor dem Zugriff auf this.area bevorzugt werden
     *
     * @return
     */
    abstract double area();

    /**
     * Berechnet das Flächenträgheitsmoment
     *
     * @return
     */
    abstract double fltm();

    /**
     * Aktualisiert den Schwerpunkt in x und y
     */
    abstract void sp();
    
    /**
     * Berechnet das Widerstandsmoment
     *
     * @return
     */
    double wdsm(double a_max) {
        return fltm() / a_max;
    }
}
