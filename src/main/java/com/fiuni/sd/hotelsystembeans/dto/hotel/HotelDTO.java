package com.fiuni.sd.hotelsystembeans.dto.hotel;

import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;

@XmlRootElement(name = "hotel")
public class HotelDTO extends BaseDTO {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private String direction;
    private String email;
    private String phone;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }




}
