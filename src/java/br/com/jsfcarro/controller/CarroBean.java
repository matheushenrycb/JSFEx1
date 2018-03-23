/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfcarro.controller;

import br.com.jsfcarro.mapeamento.CarroMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.SessionScoped;

/**
 *
 * @author laboratorio
 */
@RequestScoped
//@SessionScoped // O sessionscoped ira manter o objeto até
@ManagedBean
public class CarroBean {

    private CarroMap carro;
    private CarroModel carromod;

    public CarroModel getCarromod() {
        return carromod;
    }

    public void setCarromod(CarroModel carromod) {
        this.carromod = carromod;
    }
    public CarroBean() {
        this.carro = new CarroMap();
        this.carroMod= new CarroModel();
    }

    public void salvar() {
        carroMod.salvar(carro);

    }

    public CarroMap getCarro() {
        return carro;
    }

    public void setCarro(CarroMap carro) {
        this.carro = carro;
    }
}
