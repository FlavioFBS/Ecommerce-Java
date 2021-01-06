/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Categoria implements Serializable{
    private int codigo;
    private String nombre;
    private boolean visible;
    private int categoriaSuperior;

    public Categoria() {
    }

    public Categoria(int codigo, String nombre, boolean visible, int categoriaSuperior) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.visible = visible;
        this.categoriaSuperior = categoriaSuperior;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getCategoriaSuperior() {
        return categoriaSuperior;
    }

    public void setCategoriaSuperior(int categoriaSuperior) {
        this.categoriaSuperior = categoriaSuperior;
    }
    
}
