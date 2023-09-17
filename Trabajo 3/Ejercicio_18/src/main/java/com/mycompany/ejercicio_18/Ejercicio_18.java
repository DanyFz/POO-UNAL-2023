/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_18;

/**
 *
 * @author felip
 */
public class Ejercicio_18 {

    public double codigo;
    public String nombre;
    public double hora;
    public double vhora;
    public double retencion;
    public double bruto;
    public double neto;
    public Ejercicio_18(double hora, double vhora, double retencion){
        this.nombre = nombre;
        this.codigo = codigo;
        this.hora = hora;
        this.vhora = vhora;
        this.retencion = retencion;
        this.bruto = (hora * vhora);
        this.neto = bruto-((bruto*retencion)/ 100);
    }    
    public static void main(String[] args) {   
    FORMULARIO form= new FORMULARIO();
        form.setVisible(true);
    }    
    }
    

