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
class User {
	 @Element
    public String username;
    
	 @Element
    public String deviceid;

	 @ElementList(entry = "role")
     List<String> roles = new ArrayList<String>();

    @ElementList(entry = "permission")
    List<String> permissions = new ArrayList<String>();
	 
	 
    public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	@Override
    public String toString() {
        return "User{" + "username=" + username + ", deviceid=" + deviceid + ", roles=" + roles + ", permissions=" + permissions + '}';
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

    
    
    
}
