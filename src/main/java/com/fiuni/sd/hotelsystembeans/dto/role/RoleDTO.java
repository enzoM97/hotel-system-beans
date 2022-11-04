package com.fiuni.sd.hotelsystembeans.dto.role;

import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;



@XmlRootElement(name = "role")
public class RoleDTO extends BaseDTO{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
