/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.list;

import java.util.ArrayList;
import java.util.List;
import ni.edu.uni.pojo.Activo;

/**
 *
 * @author Sistemas-15
 */
public class ActivosList {
    List<Activo> activos = new ArrayList<>();

    public ActivosList() {
    }

    public List<Activo> getActivos() {
        return activos;
    }

    public void setActivos(List<Activo> activos) {
        this.activos = activos;
    }
}
