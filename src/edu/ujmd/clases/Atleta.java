/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author meev9
 */
public class Atleta {

    public Atleta() {
    }

    private Scanner N;
    private String Nombre;

    private String Apellido;

    private int NumeroIdentificacion;

    private float Peso;

    private int NumeroGuantes;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public float getPeso() {
        return Peso;
    }

    public int getNumeroGuantes() {
        return NumeroGuantes;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNumeroIdentificacion(int NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public void setNumeroGuantes(int NumeroGuantes) {
        this.NumeroGuantes = NumeroGuantes;
    }

    public void IngresarDatosAtleta() {
        Nombre = JOptionPane.showInputDialog("Ingrese el Nombre del atleta");
        Apellido = JOptionPane.showInputDialog("Ingrese el Apellido del atleta");

    }

    public void MostrarDatosAtleta() {
        JOptionPane.showConfirmDialog(null, Nombre + Apellido);
    }

}
