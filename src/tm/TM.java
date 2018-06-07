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

        teil.add(new rechteck(3, 1, 0, 0));
        teil.add(new rechteck(1, 2, 1, 1));

        System.out.println("T-Träger:");
        System.out.println("Schwerpunkt R1: (" + teil.get(0).sp_x + "|" + teil.sp_y + ")");
        System.out.println("Schwerpunkt R2: (" + teil.get(1).sp_x + "|" + teil.sp_y + ")");
        System.out.println("Schwerpunkt: (" + teil.sp_x + "|" + teil.sp_y + ")");
        System.out.println("Flächenträgheitsmoment: (" + teil.i_x + "|" + teil.i_y + ")");
        

    }

}
