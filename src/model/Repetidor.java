package model;

import javax.swing.*;

public class Repetidor {

    public boolean intentaRepetir(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Quieres hacer otra operación?");
        if(respuesta !=0){
                JOptionPane.showMessageDialog(null, "Fue un placer ayudarte, hasta luego.");
                return false;
        }
        return true;
    }
}
