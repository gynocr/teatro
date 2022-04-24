/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatro;
import teatro.controlador.controlador;
import teatro.model.modelado;
import teatro.view.View;
/**
 *
 * @author acamposl
 */
public class aplicacion {
        
    public static void main(String[] args) {
        modelado model=new modelado();
        View view = new view();
        controlador controlador = new controlador(model,view);
        view.setVisible(true);
        view
    }
}
