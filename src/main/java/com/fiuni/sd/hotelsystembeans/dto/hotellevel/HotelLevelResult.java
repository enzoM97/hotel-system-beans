package com.fiuni.sd.hotelsystembeans.dto.hotellevel;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseResult;

@XmlRootElement(name = "hotelLevelResult")
public class HotelLevelResult extends BaseResult<HotelLevelDTO> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @XmlElement
    public List<HotelLevelDTO> getHotelLevels(){
        return getList();
    }

    public void setHotelLevels(List<HotelLevelDTO> dtos) {
        super.setList(dtos);
    }


}
