/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.sarl.shop_management.user.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OUMNIA-PC
 */
public class Users {
    private Integer id;
    private String name;
    private String login;
    private String password;
    private  List<Roles>rolesList = new ArrayList<>();

    public List<Roles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Roles> rolesList) {
        this.rolesList = rolesList;
    }
    
    

    public Users() {
    }

    public Users(Integer id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public Users(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
