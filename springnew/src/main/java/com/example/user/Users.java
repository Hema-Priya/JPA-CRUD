package com.example.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Users {

    
   // @GeneratedValue used for automatically putting primary key
    
   @Id 
   @GeneratedValue(strategy=GenerationType.AUTO)
   private Integer id;
     private String username;
    private String password;
    

    public Users() {
    }
    

    public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   
}

