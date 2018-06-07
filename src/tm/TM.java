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

        teil.add(new rechteck(10, 60, 0, 0));
        teil.add(new rechteck(60, 15, 10, 0));
        teil.add(new rechteck(20, 75, 50, 15));

        /**
         * So sieht der T-Träger aus:
         *    _
         *   | |
         *  _| |_
         * |_____|
         * 
         * Ich weiß, was Du denkst und NEIN!
         */
        
        System.out.println("T-Träger:");
        System.out.println("Fläche Träger: " + teil.area());
        System.out.println("Schwerpunkt: (" + teil.sp_x + "|" + teil.sp_y + ")");
        System.out.println("Flächenträgheitsmoment: (" + teil.i_x + "|" + teil.i_y + ")");

    }

}
