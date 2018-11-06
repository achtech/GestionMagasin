/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.sarl.shop_management.user.service;

import com.software.sarl.shop_management.user.entity.Users;
import java.util.List;

/**
 *
 * @author OUMNIA-PC
 */
public class UsersService {
    public Users save(Users user){
        return user;
    }
     public Users edit(Users user){
        return user;
    }
      public Boolean delete(Users user){
        return false;
    }
  public List<Users> findAll(){
        return null;
    }
  public List<Users> findById(Integer id ){
        return null;
    }
}
