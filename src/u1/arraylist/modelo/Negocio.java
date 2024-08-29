/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.arraylist.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Boris Perez
 */
public class Negocio {

    private ArrayList<Estudiante> estudiantes;

    public Negocio() {
        estudiantes = new ArrayList<Estudiante>();
    }

    public void agregarEstudiante(String nombre, String apellido, int edad, double promedio, String codigo) {

        if (estudiantes.isEmpty()) {
            Estudiante e = new Estudiante();
            e.setNombre(nombre);
            e.setApellido(apellido);
            e.setEdad(edad);
            e.setCodigo(codigo);
            e.setPromedio(promedio);
            estudiantes.add(e);
        } else {
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getCodigo().equals(codigo)) {
                    JOptionPane.showMessageDialog(null, "Este estudiante ya existe");
                } else {
                    Estudiante e = new Estudiante();
                    e.setNombre(nombre);
                    e.setApellido(apellido);
                    e.setEdad(edad);
                    e.setCodigo(codigo);
                    e.setPromedio(promedio);
                    estudiantes.add(e);
                    break;
                }
            }
        }
    }

    public ArrayList<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    public Estudiante buscarEstudiante(String codigo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                return estudiante;
            }
        }
        return null;
    }

    public void actualizarInfo(String nombre, String apellido, String edad, String promedio, String codigo) {

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);
                estudiante.setEdad(Integer.parseInt(edad));
                estudiante.setPromedio(Double.parseDouble(promedio));
            }
        }

    }
}
