/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfcarro.controller;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author laboratorio
 */
@ManagedBean
public class CarroBean {
    private String modelo;
    private String marca;
    private String anof;
    private String anom;
    private String obs;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnof() {
        return anof;
    }

    public void setAnof(String anof) {
        this.anof = anof;
    }

    public String getAnom() {
        return anom;
    }

    public void setAnom(String anom) {
        this.anom = anom;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
}
