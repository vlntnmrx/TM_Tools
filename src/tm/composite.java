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
    
    List<form> elements;
    
    public composite() {
        elements = new ArrayList<>();
        
        this.pos_x = 0;
        this.pos_y = 0;
        this.area = 0;
    }

    /**
     * Fügt eine neue Form zum Composit hinzu
     *
     * @param elmt Das hinzuzufügende Element
     */
    void add(form elmt) {
        elements.add(elmt);
        update();
    }
    
    form get(int i) {
        return elements.get(i);
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
        this.i_x = 0;
        this.i_y = 0;
    }
    
    @Override
    void sp() {
        double s1, ages;
        
        s1 = 0;
        ages = 0;
        for (int i = 0; i < elements.size(); i++) {
            s1 += elements.get(i).pos_x * elements.get(i).area();
        }
        for (int i = 0; i < elements.size(); i++) {
            ages += elements.get(i).area();
        }
        this.sp_x = s1 / ages;
        
        s1 = 0;
        ages = 0;
        for (int i = 0; i < elements.size(); i++) {
            s1 += elements.get(i).pos_y * elements.get(i).area();
        }
        for (int i = 0; i < elements.size(); i++) {
            ages += elements.get(i).area();
        }
        this.sp_y = s1 / ages;
    }
    
}
