/*
 * Copyright (c) 2018, tomat
 * Do not redistribute without permission.
 * Thx.
 */
package tm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomat
 */
public class composite extends form {

    private List<form> elements;

    public composite() {
        elements = new ArrayList<>();
        area();
    }

    void add(form elmt) {
        elements.add(elmt);
    }

    @Override
    double area() {
        double ar = 0;
        for (int i = 0; i < elements.size(); i++) {
            ar += elements.get(i).area;
        }
        this.area = ar;
        return this.area;
    }

    @Override
    void fltm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void sp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
