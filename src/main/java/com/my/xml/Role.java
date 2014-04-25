/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author Aditya
 */
@Element
public class Role {
    
    @Element
    public String name;
    
    public String getRole() {
		return name;
	}

	public void setRole(String role) {
		this.name = role;
	}


	@Override
    public String toString() {
        return  name;
    }
    
}
