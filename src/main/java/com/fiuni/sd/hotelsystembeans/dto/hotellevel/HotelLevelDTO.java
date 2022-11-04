package com.fiuni.sd.hotelsystembeans.dto.hotellevel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;

@XmlRootElement(name = "hotelLevel")
public class HotelLevelDTO extends BaseDTO {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;

    @XmlElement
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
