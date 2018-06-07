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
public class TM {

    /**
     * Demo-Projekt zum verwenden der Toolbox
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        composite teil = new composite();

        //teil.add(new rechteck(360.0, 60.0, 0.0, 0.0));
        //teil.add(new rechteck(60.0, 420.0, 150.0, 60.0));
        //teil.add(new rechteck(180.0, 60.0, 90.0, 480.0));
        teil.add(new rechteck(30, 10, 0, 0));
        teil.add(new rechteck(10, 40, 30, 0));

        System.out.println("Profildaten:");
        System.out.println("Fläche Träger: " + teil.area());
        System.out.println("Schwerpunkt: (" + teil.sp_x + "|" + teil.sp_y + ")");
        System.out.println("Flächenträgheitsmoment: (" + teil.i_x + "|" + teil.i_y + ")");

    }

}
