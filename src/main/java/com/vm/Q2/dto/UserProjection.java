/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vm.Q2.dto;

import com.vm.Q2.models.Technology;
import java.util.List;

/**
 *
 * @author Ashok
 */
public interface UserProjection {
    
    Long getId();
    String getFirstName();
    List<Technology> getTechnology();
    
}
