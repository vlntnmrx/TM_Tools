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

        teil.add(new rechteck(30, 15, 0, 0));
        teil.add(new kreis_halb(10, 15, 0, true));

        System.out.println("Hk: " + teil.get(1).i_x + " , " + teil.get(1).i_y);

        System.out.println("Profildaten:");
        System.out.println("Fläche Träger: " + teil.area());
        System.out.println("Schwerpunkt: (" + teil.sp_x + "|" + teil.sp_y + ")");
        System.out.println("Flächenträgheitsmoment: (" + teil.i_x + "|" + teil.i_y + ")");

    }

}
