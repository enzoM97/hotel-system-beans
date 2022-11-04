package com.fiuni.sd.hotelsystembeans.dto.user;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;
import com.fiuni.sd.hotelsystembeans.dto.role.RoleDTO;



@XmlRootElement(name = "user")
public class UserDTO  extends BaseDTO{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String username;

    private String email;

    private String password;

    private Set<RoleDTO> roles;

    @XmlElement
    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    @XmlElement
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @XmlElement
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement
    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
    }
}