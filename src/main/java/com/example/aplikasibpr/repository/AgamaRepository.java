/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.aplikasibpr.repository;


import com.example.aplikasibpr.entity.master.Agama;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author iqbal
 */
public interface AgamaRepository  extends CrudRepository<Agama, String> {
     public List<Agama> findAll();
}
