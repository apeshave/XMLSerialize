/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.my.xml;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author Aditya
 */
@Element
class Policy {
    
    @Element
    public String name;
    
    @ElementList(name = "role", type = Role.class)
    public List<Role> roles = new ArrayList<Role>();
    
    @ElementList(name = "permission", type = Permission.class)
    public List<Permission> permissions = new ArrayList<Permission>();

    
    
    
    public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public List<Role> getRoles() {
		return roles;
	}




	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}




	public List<Permission> getPermissions() {
		return permissions;
	}




	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}




	@Override
    public String toString() {
        return "Policy{" + "name=" + name + ", roles=" + roles + ", permissions=" + permissions + '}';
    }
    
    
    
    
}
