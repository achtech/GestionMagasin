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
public class Roles {
    private Integer id;
    private String libelle;
    private List<Privileges> privilegeList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Privileges> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<Privileges> privilegeList) {
        this.privilegeList = privilegeList;
    }

    public Roles(Integer id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Roles(String libelle) {
        this.libelle = libelle;
    }

    public Roles() {
    }
    
    
}
