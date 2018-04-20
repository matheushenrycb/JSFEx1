/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfcarro.medel;

import br.com.jsfcarro.mapeamento.CarroMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author laboratorio
 */
public class CarroModel {

    //fazer o CRUD
    public void inserir(CarroMap car) {
        
        try {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session secao = sf.openSession();
        Transaction tr = secao.beginTransaction();// abrir transação
        secao.save(car);// salvar o objeto   
        tr.commit();// ira executar o que pediu
        secao.close();
        sf.close();     
        } catch (Exception e) {
            System.out.println("erro"); 
        }
       
    }
}
