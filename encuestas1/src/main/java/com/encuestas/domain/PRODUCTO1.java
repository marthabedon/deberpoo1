package com.encuestas.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="producto")
public class PRODUCTO1 {
	@Id//clave primaria
	@GeneratedValue
	private int idproducto;
	private String nombre;
        private int precio;
        private int cantidad;
	@OneToMany(cascade = CascadeType.ALL)
        //@MamyToOne(cascade =CascadeTyoe.ALL)
        //@JoinColumn(name="encuestaid")
	
	// cuando es de uno a micho es set
        // cuando es de mucho a una solo son los nombre de la clss

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
        
	
	
	
	
	
	
	
}
