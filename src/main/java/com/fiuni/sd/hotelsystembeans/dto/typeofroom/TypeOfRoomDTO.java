package com.fiuni.sd.hotelsystembeans.dto.typeofroom;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;

@XmlRootElement(name = "typeOfRoom")
public class TypeOfRoomDTO extends BaseDTO {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
    @XmlElement
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}
