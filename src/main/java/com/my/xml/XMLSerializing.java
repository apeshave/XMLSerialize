/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


/**
 *
 * @author ADi
 */
public class XMLSerializing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Serializer serializer = new Persister();
        
//        File users = new File("./src/main/resources/userlist.xml");
//        Userlist userlist = serializer.read(Userlist.class, users);
        
//        File policies = new File("./src/main/resources/policies.xml");
//        Policies policylist = serializer.read(Policies.class, policies);
//        
//        File rolesss = new File("./src/main/resources/roles.xml");
//        Roles rolelist = serializer.read(Roles.class, rolesss);
//
//        File permissions = new File("./src/main/resources/permissions.xml");
//        Permissions permissionList = serializer.read(Permissions.class, permissions);
        
        
        //System.out.println("Userlist : "  + userlist.toString());
//        System.out.println("Policies : " + policylist);
        //System.out.println("Roles: " + rolelist);
//        System.out.println("Permissions: " + permissionList.toString());
        
         
        Userlist list = new Userlist();
        User u = new User();
        
        u.setUsername("ABC");
        u.setDeviceid("3232");
        Role role = new Role();
        role.name = "admin";
        Permission per1 = new Permission();
        per1.setPermission("C");
        Permission per2 = new Permission();
        per2.setPermission("R");
        
        RoleList roles = new RoleList();
        //roles.roles.add("ADmin");
        //roles.roles.add("1");
        //roles.roles.add("2");
        
        //roles.roles.add(role);
        roles.roles.add("adsadsadsa");
        roles.roles.add("zxcxzc");
        
        Permissions permissions = new Permissions();
        //permissions.permissions.add(per1);
        //permissions.permissions.add(per2);
        permissions.permissions.add("Read");
        permissions.permissions.add("Write");
        
        
        //u.getPermissions().add(per1);
        //u.getPermissions().add(per2);
        
        u.permissions.add("Read");
        u.permissions.add("Write");
        
        u.roles.add("ADmin");
        
        
        
        //u.roles.roles.add(role);
        //u.roles.add(role);
        //u.getRoles().add(role);
        
//        u.permissions = permissions;
       // u.roles = roles;
        
        Policy p = new Policy();
        p.name = "P1";
        p.permissions.add(per1);
        p.permissions.add(per2);
        p.roles.add(role);
        
        Policies pol = new Policies();
        pol.policies.add(p);
        
        list.userlist.add(u);
        
        Serializer testing = new Persister();
        File result = new File("./src/main/resources/final3.xml");
        serializer.write(permissions, result);
        
    }
}
