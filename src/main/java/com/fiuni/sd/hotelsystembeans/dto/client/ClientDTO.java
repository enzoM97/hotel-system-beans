package com.fiuni.sd.hotelsystembeans.dto.client;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;

@XmlRootElement(name = "client")
public class ClientDTO extends BaseDTO {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private String lastName;
    private String document;
    private String direction;
    private String email;
    private String phone;

    @XmlElement
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @XmlElement
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    @XmlElement
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    @XmlElement
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @XmlElement
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
